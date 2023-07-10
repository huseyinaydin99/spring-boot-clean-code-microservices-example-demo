package tr.com.huseyinaydin.inventory.utils.exceptions;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

public class BusinessException extends RuntimeException {
    public BusinessException(String message){
        super(message);
    }
}
