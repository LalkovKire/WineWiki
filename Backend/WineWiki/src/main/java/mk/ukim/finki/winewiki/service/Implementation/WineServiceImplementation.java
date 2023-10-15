package mk.ukim.finki.winewiki.service.Implementation;

import mk.ukim.finki.winewiki.model.Manufacturer;
import mk.ukim.finki.winewiki.model.Wine;
import mk.ukim.finki.winewiki.model.dto.WineDto;
import mk.ukim.finki.winewiki.model.exceptions.ManufacturerNotFoundException;
import mk.ukim.finki.winewiki.model.exceptions.WineAlreadyExistsException;
import mk.ukim.finki.winewiki.model.exceptions.WineNotFoundException;
import mk.ukim.finki.winewiki.repository.WineRepository;
import mk.ukim.finki.winewiki.service.ManufacturerService;
import mk.ukim.finki.winewiki.service.WineService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class WineServiceImplementation implements WineService {

    private final WineRepository wineRepository;
    private final ManufacturerService manufacturerService;

    public WineServiceImplementation(WineRepository wineRepository, ManufacturerService manufacturerService) {
        this.wineRepository = wineRepository;
        this.manufacturerService = manufacturerService;
    }

    @Override
    public List<Wine> findAll() {
        return this.wineRepository.findAll();
    }

    @Override
    public Optional<Wine> findById(Long id) {
        return this.wineRepository.findById(id);
    }

    @Override
    public Optional<Wine> findByName(String name) {
        return this.wineRepository.findByName(name);
    }

    @Override
    @Transactional
    public Optional<Wine> save(WineDto wineDto) {
        Optional<Wine> wine = this.findByName(wineDto.getName());
        if ( wine.isPresent() ) {
            throw new WineAlreadyExistsException(wine.get().getID());
        }
        Manufacturer manufacturer = this.manufacturerService.findById(wineDto.getManufacturer())
                .orElseThrow(() -> new ManufacturerNotFoundException(wineDto.getManufacturer()));
        return Optional.of(this.wineRepository.save(new Wine(wineDto.getName(),wineDto.getDescription(),
                wineDto.getQuantity(),manufacturer)));
    }

    @Override
    @Transactional
    public Optional<Wine> edit(Long id, WineDto wineDto) {
        Wine wine = this.findById(id).orElseThrow(() -> new WineNotFoundException(id));
        wine.setDescription(wineDto.getDescription());
        wine.setName(wineDto.getName());
        wine.setQuantity(wineDto.getQuantity());
        Manufacturer manufacturer = this.manufacturerService.findById(wineDto.getManufacturer())
                .orElseThrow(() -> new ManufacturerNotFoundException(wineDto.getManufacturer()));
        wine.setManufacturer(manufacturer);
        return Optional.of(this.wineRepository.save(wine));
    }

    @Override
    public void deleteById(Long id) {
       this.wineRepository.deleteById(id);
    }
}
