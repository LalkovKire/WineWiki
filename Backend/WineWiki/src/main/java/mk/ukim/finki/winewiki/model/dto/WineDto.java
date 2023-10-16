package mk.ukim.finki.winewiki.model.dto;

import lombok.Data;

@Data
public class WineDto {

    private String name;

    private Integer quantity;

    private String description;

    private Long manufacturer;

    private String URL;

    private Double price;

    public WineDto() {
    }

    public WineDto(String name, Integer quantity, String description, Long manufacturer, String URL, Double price) {
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.manufacturer = manufacturer;
        this.URL = URL;
        this.price = price;
    }
}
