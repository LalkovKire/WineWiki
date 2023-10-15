package mk.ukim.finki.winewiki.service;

import mk.ukim.finki.winewiki.model.Manufacturer;
import mk.ukim.finki.winewiki.model.dto.ManufacturerDto;

import java.util.List;
import java.util.Optional;

public interface ManufacturerService {

    List<Manufacturer> findAll();

    Optional<Manufacturer> findById(Long id);

    Optional<Manufacturer> findByName(String name);

    Optional<Manufacturer> save(ManufacturerDto manufacturerDto);

    void deleteById(Long id);
}
