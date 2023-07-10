package tr.com.huseyinaydin.inventory.repositories;

import tr.com.huseyinaydin.inventory.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

public interface ModelRepository extends JpaRepository<Model,String> {
    boolean existsByNameIgnoreCase(String name);
}
