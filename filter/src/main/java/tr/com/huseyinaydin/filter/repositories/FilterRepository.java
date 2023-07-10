package tr.com.huseyinaydin.filter.repositories;

import tr.com.huseyinaydin.filter.entities.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

public interface FilterRepository extends MongoRepository<Inventory,String> {
}