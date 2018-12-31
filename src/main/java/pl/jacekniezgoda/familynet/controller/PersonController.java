package pl.jacekniezgoda.familynet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.jacekniezgoda.familynet.entity.PersonVertex;
import pl.jacekniezgoda.familynet.model.Person;
import pl.jacekniezgoda.familynet.model.PersonPayload;
import pl.jacekniezgoda.familynet.service.PersonService;

@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping
    public Iterable<Person> list() {
        return personService.list();
    }

    @PostMapping
    public Person create(@RequestBody PersonPayload personPayload) {
        return personService.create(personPayload);
    }

    @GetMapping("/{id}")
    public Person read(@PathVariable String id) {
        return personService.read(id);
    }

    @PostMapping("/{id}")
    public Person update(@PathVariable String id, @RequestBody PersonPayload personPayload) {
        return personService.update(id, personPayload);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        personService.delete(id);
    }
}
