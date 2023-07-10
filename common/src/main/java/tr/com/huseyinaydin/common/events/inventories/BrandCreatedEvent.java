package tr.com.huseyinaydin.common.events.inventories;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

@Data
@Getter
@Setter
public class BrandCreatedEvent {
    private String id;
    private String name;
}