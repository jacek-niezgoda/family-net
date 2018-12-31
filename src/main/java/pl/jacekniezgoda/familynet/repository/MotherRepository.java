package pl.jacekniezgoda.familynet.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import pl.jacekniezgoda.familynet.entity.MotherEdge;

public interface MotherRepository extends ArangoRepository<MotherEdge, String> {
}
