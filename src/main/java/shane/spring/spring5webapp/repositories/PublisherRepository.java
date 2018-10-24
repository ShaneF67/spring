package shane.spring.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import shane.spring.spring5webapp.models.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
