package shane.spring.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import shane.spring.spring5webapp.models.Author;
import shane.spring.spring5webapp.models.Book;
import shane.spring.spring5webapp.models.Publisher;
import shane.spring.spring5webapp.repositories.AuthorRepository;
import shane.spring.spring5webapp.repositories.BookRepository;
import shane.spring.spring5webapp.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {

        Author rodRiley = new Author("Rod", "Riley");
        Publisher harperCollins = new Publisher("Harper Collins", "USA");
        Book ddd = new Book("Domain Driven Design", harperCollins, "1234");

        rodRiley.getBooks().add(ddd);

        authorRepository.save(rodRiley);
        publisherRepository.save(harperCollins);
        bookRepository.save(ddd);


        Author shaneFeehily = new Author("Shane", "Feehily");
        Publisher shanesPublishments = new Publisher("Shanes Publishments", "Sligo");
        Book howToCode = new Book("How to Code", shanesPublishments, "456");

        shaneFeehily.getBooks().add(howToCode);

        authorRepository.save(shaneFeehily);
        publisherRepository.save(shanesPublishments);
        bookRepository.save(howToCode);
    }
}
