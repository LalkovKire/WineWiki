package mk.ukim.finki.winewiki.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Wine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String name;

    private Integer quantity;

    @ManyToOne
    private Manufacturer manufacturer;

    private String description;

    public Wine(String name, String description,Integer quantity, Manufacturer manufacturer) {
        this.name = name;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.description = description;
    }
}
