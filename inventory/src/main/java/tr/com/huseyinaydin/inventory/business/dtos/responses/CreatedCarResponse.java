package tr.com.huseyinaydin.inventory.business.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreatedCarResponse {
    private String id;
    private String modelId;
    private int modelYear;
    private String plate;
    private int state;
    private double dailyPrice;
}
//filterService-->id,modelName,brandName,modelYear...