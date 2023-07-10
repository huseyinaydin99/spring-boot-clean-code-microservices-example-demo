package tr.com.huseyinaydin.inventory.api.controllers;

import tr.com.huseyinaydin.inventory.business.abstracts.BrandService;
import tr.com.huseyinaydin.inventory.business.dtos.requests.CreateBrandRequest;
import tr.com.huseyinaydin.inventory.business.dtos.responses.CreatedBrandResponse;
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
@RequestMapping("/api/v1/brands")
public class BrandsController {
    private BrandService brandService;
    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public CreatedBrandResponse add(@Valid @RequestBody CreateBrandRequest request){
        return  this.brandService.add(request);
    }
}