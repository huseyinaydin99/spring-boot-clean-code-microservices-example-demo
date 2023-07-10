package tr.com.huseyinaydin.filter.business.concretes;

import tr.com.huseyinaydin.filter.business.abstracts.FilterService;
import tr.com.huseyinaydin.filter.entities.Inventory;
import tr.com.huseyinaydin.filter.repositories.FilterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

@Service
@AllArgsConstructor
public class FilterServiceImpl implements FilterService {
    private FilterRepository filterRepository;

    @Override
    public void add(Inventory inventory) {
         this.filterRepository.save(inventory);
    }
}
