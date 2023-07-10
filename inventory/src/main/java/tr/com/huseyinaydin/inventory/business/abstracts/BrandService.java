package tr.com.huseyinaydin.inventory.business.abstracts;

import tr.com.huseyinaydin.inventory.business.dtos.requests.CreateBrandRequest;
import tr.com.huseyinaydin.inventory.business.dtos.responses.CreatedBrandResponse;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

public interface BrandService {
    CreatedBrandResponse add(CreateBrandRequest createBrandRequest);
}
