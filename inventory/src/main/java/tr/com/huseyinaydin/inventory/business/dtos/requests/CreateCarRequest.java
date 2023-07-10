package tr.com.huseyinaydin.inventory.business.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateCarRequest {
    @NotBlank
    @NotNull
    private String modelId;
    @Min(value = 1886)
    private int modelYear;
    @NotBlank
    @NotNull
    private String plate;
    @Min(value = 0)
    private double dailyPrice;
}
