package mk.ukim.finki.winewiki.service.Implementation;

import mk.ukim.finki.winewiki.model.Manufacturer;
import mk.ukim.finki.winewiki.model.dto.ManufacturerDto;
import mk.ukim.finki.winewiki.repository.ManufacturerRepository;
import mk.ukim.finki.winewiki.service.ManufacturerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManufacturerServiceImplementation implements ManufacturerService {

    private final ManufacturerRepository manufacturerRepository;

    public ManufacturerServiceImplementation(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    @Override
    public List<Manufacturer> findAll() {
        return this.manufacturerRepository.findAll();
    }

    @Override
    public Optional<Manufacturer> findById(Long id) {
        return this.manufacturerRepository.findById(id);
    }

    @Override
    public Optional<Manufacturer> findByName(String name) {
        return this.manufacturerRepository.findByName(name);
    }

    @Override
    public Optional<Manufacturer> save(ManufacturerDto manufacturerDto) {
         Optional<Manufacturer> manufacturer = this.findByName(manufacturerDto.getName());
         if ( manufacturer.isPresent() ) return manufacturer;
         return Optional.of(this.manufacturerRepository.save(new Manufacturer(manufacturerDto.getName(),
                 manufacturerDto.getCountry())));
    }

    @Override
    public void deleteById(Long id) {
          this.manufacturerRepository.deleteById(id);
    }
}
