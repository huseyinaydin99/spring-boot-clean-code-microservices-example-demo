package tr.com.huseyinaydin.inventory.business.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedBrandResponse {
    private String id;
    private String name;
}
