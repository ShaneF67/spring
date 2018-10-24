package shane.spring.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import shane.spring.spring5webapp.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
