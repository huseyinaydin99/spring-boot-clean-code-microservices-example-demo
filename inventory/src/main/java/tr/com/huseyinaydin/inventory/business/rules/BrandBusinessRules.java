package tr.com.huseyinaydin.inventory.business.rules;


import tr.com.huseyinaydin.inventory.repositories.BrandRepository;
import tr.com.huseyinaydin.inventory.utils.exceptions.BusinessException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

@AllArgsConstructor
@Service
public class BrandBusinessRules {
    private BrandRepository brandRepository;
    public void checkIfBrandNameExists(String name){
        if (this.brandRepository.existsByNameIgnoreCase(name)){
            throw new BusinessException("Brand name exists");
        }
    }

}
