package shane.spring.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import shane.spring.spring5webapp.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
