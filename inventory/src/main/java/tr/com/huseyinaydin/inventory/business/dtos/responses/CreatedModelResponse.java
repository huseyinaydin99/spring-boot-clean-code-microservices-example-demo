package tr.com.huseyinaydin.inventory.business.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedModelResponse {
    private String id;
    private String name;
    private String brandId;
}
