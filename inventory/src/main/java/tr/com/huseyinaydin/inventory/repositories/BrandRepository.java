package tr.com.huseyinaydin.inventory.repositories;

import tr.com.huseyinaydin.inventory.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

public interface BrandRepository extends JpaRepository<Brand,String> {
    boolean existsByNameIgnoreCase(String name);
}
