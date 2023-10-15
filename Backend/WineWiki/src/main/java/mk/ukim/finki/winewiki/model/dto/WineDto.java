package mk.ukim.finki.winewiki.model.dto;

import lombok.Data;

@Data
public class WineDto {

    private String name;

    private Integer quantity;

    private String description;

    private Long manufacturer;

    public WineDto() {
    }

    public WineDto(String name, Integer quantity, String description, Long manufacturer) {
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.manufacturer = manufacturer;
    }
}
