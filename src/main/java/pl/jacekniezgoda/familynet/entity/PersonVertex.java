package pl.jacekniezgoda.familynet.entity;

import com.arangodb.springframework.annotation.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import pl.jacekniezgoda.familynet.model.Gender;

@Document("persons")
@TypeAlias("person-vertex")
public class PersonVertex {
    @Id
    private String id;

    private String firstName;
    private String lastName;
    private Gender gender;
    private boolean alive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
