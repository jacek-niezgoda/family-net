package pl.jacekniezgoda.familynet.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import pl.jacekniezgoda.familynet.entity.PersonVertex;

public interface PersonRepository extends ArangoRepository<PersonVertex, String> {
}
