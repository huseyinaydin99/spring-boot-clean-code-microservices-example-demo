package tr.com.huseyinaydin.inventory.business.concretes;

import tr.com.huseyinaydin.inventory.business.abstracts.ModelService;
import tr.com.huseyinaydin.inventory.business.dtos.requests.CreateModelRequest;
import tr.com.huseyinaydin.inventory.business.dtos.responses.CreatedModelResponse;
import tr.com.huseyinaydin.inventory.business.rules.ModelBusinessRules;
import tr.com.huseyinaydin.inventory.entities.Brand;
import tr.com.huseyinaydin.inventory.entities.Model;
import tr.com.huseyinaydin.inventory.repositories.ModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ModelServiceImpl implements ModelService {
    private ModelBusinessRules modelBusinessRules;
    private ModelRepository modelRepository;
    @Override
    public CreatedModelResponse add(CreateModelRequest createModelRequest) {
        this.modelBusinessRules.checkIfModelNameExists(createModelRequest.getName());

        Model model = new Model();
        model.setId(UUID.randomUUID().toString());
        model.setName(createModelRequest.getName());

        Brand brand = new Brand();
        brand.setId(createModelRequest.getBrandId());

        model.setBrand(brand);

        Model createdModel = this.modelRepository.save(model);

        CreatedModelResponse response = new CreatedModelResponse();
        response.setId(createdModel.getId());
        response.setName(createdModel.getName());
        response.setBrandId(createdModel.getBrand().getId());
        return response;
    }
}
