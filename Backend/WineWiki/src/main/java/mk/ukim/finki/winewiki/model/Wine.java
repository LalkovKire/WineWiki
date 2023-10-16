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

    private Double price;

    private String URL;
    @ManyToOne
    private Manufacturer manufacturer;

    private String description;

    public Wine(String name, Integer quantity, Double price, String URL, Manufacturer manufacturer, String description) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.URL = URL;
        this.manufacturer = manufacturer;
        this.description = description;
    }
}
