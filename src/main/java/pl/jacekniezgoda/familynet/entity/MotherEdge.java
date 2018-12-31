package pl.jacekniezgoda.familynet.entity;

import com.arangodb.springframework.annotation.Edge;
import com.arangodb.springframework.annotation.From;
import com.arangodb.springframework.annotation.To;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;

@Edge("mothers")
@TypeAlias("mother-edge")
public class MotherEdge {
    @Id
    private String id;

    @From
    private PersonVertex mother;

    @To
    private PersonVertex child;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PersonVertex getMother() {
        return mother;
    }

    public void setMother(PersonVertex mother) {
        this.mother = mother;
    }

    public PersonVertex getChild() {
        return child;
    }

    public void setChild(PersonVertex child) {
        this.child = child;
    }
}
