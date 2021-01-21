package pl.mr.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.mr.model.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {
    Book findByIsbn(int isbn);
    List<Book> findAll();
    List<Book> findByAuthor_Lastname(String authorLastname);
}
