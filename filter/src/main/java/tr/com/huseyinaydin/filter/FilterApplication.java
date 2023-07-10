package tr.com.huseyinaydin.filter;

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
public class FilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilterApplication.class, args);
	}
}