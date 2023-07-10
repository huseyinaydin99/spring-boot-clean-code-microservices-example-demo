package tr.com.huseyinaydin.inventory.repositories;

import tr.com.huseyinaydin.inventory.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

public interface CarRepository extends JpaRepository<Car,String> {
}
