package tr.com.huseyinaydin.inventory.business.abstracts;

import tr.com.huseyinaydin.inventory.business.dtos.requests.CreateModelRequest;
import tr.com.huseyinaydin.inventory.business.dtos.responses.CreatedModelResponse;

public interface ModelService {
    CreatedModelResponse add(CreateModelRequest createModelRequest);
}
