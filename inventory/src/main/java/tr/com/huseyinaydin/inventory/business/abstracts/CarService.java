package tr.com.huseyinaydin.inventory.business.abstracts;

import tr.com.huseyinaydin.inventory.business.dtos.requests.CreateCarRequest;
import tr.com.huseyinaydin.inventory.business.dtos.responses.CreatedCarResponse;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

public interface CarService {
    CreatedCarResponse add(CreateCarRequest createCarRequest);
}
