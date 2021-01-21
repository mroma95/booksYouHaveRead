package pl.mr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mr.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher,Long> {
    Publisher findByName(String name);
}
