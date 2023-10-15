package mk.ukim.finki.winewiki.model.dto;

import lombok.Data;

@Data
public class ManufacturerDto {

    private String name;

    private String country;

    public ManufacturerDto() {
    }

    public ManufacturerDto(String name, String country) {
        this.name = name;
        this.country = country;
    }
}
