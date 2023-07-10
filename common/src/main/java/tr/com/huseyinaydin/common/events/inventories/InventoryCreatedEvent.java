package tr.com.huseyinaydin.common.events.inventories;

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
@AllArgsConstructor
@NoArgsConstructor
public class InventoryCreatedEvent {
    private String carId;
    private String modelId;
    private String modelName;
    private String brandId;
    private String brandName;
    private double dailyPrice;
    private int modelYear;
    private String plate;
    private int state;
}