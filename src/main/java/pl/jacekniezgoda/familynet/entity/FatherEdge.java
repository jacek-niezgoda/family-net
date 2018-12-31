package pl.jacekniezgoda.familynet.entity;

import com.arangodb.springframework.annotation.Edge;
import com.arangodb.springframework.annotation.From;
import com.arangodb.springframework.annotation.To;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;

@Edge("fathers")
@TypeAlias("father-edge")
public class FatherEdge {
    @Id
    private String id;

    @From
    private PersonVertex father;

    @To
    private PersonVertex child;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PersonVertex getFather() {
        return father;
    }

    public void setFather(PersonVertex father) {
        this.father = father;
    }

    public PersonVertex getChild() {
        return child;
    }

    public void setChild(PersonVertex child) {
        this.child = child;
    }
}
