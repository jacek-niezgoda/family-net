package pl.jacekniezgoda.familynet.model;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import pl.jacekniezgoda.familynet.entity.PersonVertex;

public class Person {
    private String id;

    @JsonUnwrapped
    private PersonPayload payload;

    public Person() {
    }

    public Person(PersonVertex personVertex) {
        id = personVertex.getId();
        payload = new PersonPayload(personVertex);
    }

    public String getId() {
        return id;
    }

    public PersonPayload getPayload() {
        return payload;
    }
}
