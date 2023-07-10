package tr.com.huseyinaydin.filter.kafka;

import tr.com.huseyinaydin.common.events.inventories.InventoryCreatedEvent;
import tr.com.huseyinaydin.filter.business.abstracts.FilterService;
import tr.com.huseyinaydin.filter.entities.Inventory;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

@Service
@AllArgsConstructor
public class InventoryConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(InventoryConsumer.class);
    private FilterService filterService;

    @KafkaListener(topics = "inventory-car-created",groupId = "inventory-create")
    public void consume(InventoryCreatedEvent inventoryCreatedEvent){
        Inventory inventory = new Inventory();
        inventory.setBrandName(inventoryCreatedEvent.getBrandName());
        inventory.setBrandId(inventoryCreatedEvent.getBrandId());
        inventory.setCarId(inventoryCreatedEvent.getCarId());
        inventory.setModelId(inventoryCreatedEvent.getModelId());
        inventory.setState(inventoryCreatedEvent.getState());
        inventory.setPlate(inventoryCreatedEvent.getPlate());
        inventory.setDailyPrice(inventoryCreatedEvent.getDailyPrice());
        inventory.setModelYear(inventoryCreatedEvent.getModelYear());
        inventory.setModelName(inventoryCreatedEvent.getModelName());

        this.filterService.add(inventory);
    }
}