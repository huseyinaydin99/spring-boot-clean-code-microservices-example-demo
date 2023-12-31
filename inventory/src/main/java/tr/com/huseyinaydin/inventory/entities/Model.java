package tr.com.huseyinaydin.inventory.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/*
 * @Student Huseyin Aydin
 * @since 1994
 * Spring Boot Microservies
 */

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="models")
public class Model {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
    @OneToMany(mappedBy = "model", cascade = CascadeType.ALL)
    private List<Car> cars;
}