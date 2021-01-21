package pl.mr.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.mr.model.Author;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Long> {
    Author findByLastnameAndFirstname(String firstname,String lastname);
    List<Author> findAll();
}
