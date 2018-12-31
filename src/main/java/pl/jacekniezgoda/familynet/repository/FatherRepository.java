package pl.jacekniezgoda.familynet.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import pl.jacekniezgoda.familynet.entity.FatherEdge;

public interface FatherRepository extends ArangoRepository<FatherEdge, String> {
}
