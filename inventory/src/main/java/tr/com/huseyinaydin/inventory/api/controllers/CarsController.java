package tr.com.huseyinaydin.inventory.api.controllers;

import tr.com.huseyinaydin.inventory.business.abstracts.CarService;
import tr.com.huseyinaydin.inventory.business.dtos.requests.CreateCarRequest;
import tr.com.huseyinaydin.inventory.business.dtos.responses.CreatedCarResponse;
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
@RequestMapping("/api/v1/cars")
public class CarsController {
    private CarService carService;

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public CreatedCarResponse add(@Valid @RequestBody CreateCarRequest createCarRequest){
        return  this.carService.add(createCarRequest);
    }
}
