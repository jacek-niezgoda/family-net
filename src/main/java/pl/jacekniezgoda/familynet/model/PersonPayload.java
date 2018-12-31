package pl.jacekniezgoda.familynet.model;

import pl.jacekniezgoda.familynet.entity.PersonVertex;

public class PersonPayload {
    private String firstName;
    private String lastName;
    private Gender gender;
    private boolean alive;

    public PersonPayload() {
    }

    public PersonPayload(PersonVertex personVertex) {
        firstName = personVertex.getFirstName();
        lastName = personVertex.getLastName();
        gender = personVertex.getGender();
        alive = personVertex.isAlive();
    }

    public PersonVertex populate(PersonVertex personVertex) {
        personVertex.setFirstName(firstName);
        personVertex.setLastName(lastName);
        personVertex.setGender(gender);
        personVertex.setAlive(alive);

        return personVertex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
