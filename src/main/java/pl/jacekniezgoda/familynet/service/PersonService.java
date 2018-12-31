package pl.jacekniezgoda.familynet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jacekniezgoda.familynet.entity.PersonVertex;
import pl.jacekniezgoda.familynet.model.Person;
import pl.jacekniezgoda.familynet.model.PersonPayload;
import pl.jacekniezgoda.familynet.repository.PersonRepository;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Iterable<Person> list() {
        return Optional.ofNullable(personRepository.findAll())
                .map(Iterable::spliterator)
                .map(spliterator -> StreamSupport.stream(spliterator, false))
                .orElse(Stream.<PersonVertex>empty())
                .map(Person::new)
                .collect(Collectors.toList());
    }

    public Person create(PersonPayload personPayload) {
        return new Person(personRepository.save(personPayload.populate(new PersonVertex())));
    }

    public Person read(String id) {
        return personRepository.findById(id)
                .map(Person::new)
                .orElse(null);
    }

    public Person update(String id, PersonPayload personPayload) {
        return personRepository.findById(id)
                .map(personPayload::populate)
                .map(personRepository::save)
                .map(Person::new)
                .orElse(null);
    }

    public void delete(String id) {
        personRepository.findById(id)
                .ifPresent(personRepository::delete);
    }
}
