package tr.com.huseyinaydin.inventory.api.controllers;

import tr.com.huseyinaydin.inventory.business.abstracts.ModelService;
import tr.com.huseyinaydin.inventory.business.dtos.requests.CreateModelRequest;
import tr.com.huseyinaydin.inventory.business.dtos.responses.CreatedModelResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/models")
public class ModelsController {
    private ModelService modelService;
    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public CreatedModelResponse add(@Valid @RequestBody CreateModelRequest createModelRequest){
        return  this.modelService.add(createModelRequest);
    }
}