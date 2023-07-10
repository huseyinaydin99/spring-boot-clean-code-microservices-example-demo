package tr.com.huseyinaydin.inventory.business.concretes;

import tr.com.huseyinaydin.common.events.inventories.BrandCreatedEvent;
import tr.com.huseyinaydin.inventory.business.abstracts.BrandService;
import tr.com.huseyinaydin.inventory.business.dtos.requests.CreateBrandRequest;
import tr.com.huseyinaydin.inventory.business.dtos.responses.CreatedBrandResponse;
import tr.com.huseyinaydin.inventory.business.rules.BrandBusinessRules;
import tr.com.huseyinaydin.inventory.entities.Brand;
import tr.com.huseyinaydin.inventory.kafka.producers.InventoryProducer;
import tr.com.huseyinaydin.inventory.repositories.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

@Service
@AllArgsConstructor
public class BrandServiceImpl implements BrandService {
    private BrandRepository brandRepository;
    private BrandBusinessRules brandBusinessRules;
    private InventoryProducer inventoryProducer;

    @Override
    public CreatedBrandResponse add(CreateBrandRequest createBrandRequest) {

        this.brandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());

        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        brand.setId(UUID.randomUUID().toString());

        Brand createdBrand =  brandRepository.save(brand);

        CreatedBrandResponse response = new CreatedBrandResponse();
        response.setId(createdBrand.getId());
        response.setName(createdBrand.getName());


        BrandCreatedEvent brandCreatedEvent = new BrandCreatedEvent();
        brandCreatedEvent.setId(response.getId());
        brandCreatedEvent.setName(response.getName());
        inventoryProducer.sendMessage(brandCreatedEvent);

        return response;
    }
}