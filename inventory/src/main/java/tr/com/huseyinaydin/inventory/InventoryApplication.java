package tr.com.huseyinaydin.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
* @Student Huseyin Aydin
* @since 1994
* Spring Boot Microservies
 */

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}
}