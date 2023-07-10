package tr.com.huseyinaydin.inventory.business.rules;

import tr.com.huseyinaydin.inventory.repositories.ModelRepository;
import tr.com.huseyinaydin.inventory.utils.exceptions.BusinessException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

@Service
@AllArgsConstructor
public class ModelBusinessRules {
    private ModelRepository modelRepository;

    public void checkIfModelNameExists(String name) {
        if (this.modelRepository.existsByNameIgnoreCase(name)){
            throw new BusinessException("Model name exists");
        }
    }
}
