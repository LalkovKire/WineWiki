package mk.ukim.finki.winewiki.service;

import mk.ukim.finki.winewiki.model.Wine;
import mk.ukim.finki.winewiki.model.dto.WineDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface WineService {

       List<Wine> findAll();

       Optional<Wine> findById(Long id);

       Optional<Wine> findByName(String name);

       Optional<Wine> save(WineDto wineDto);

       Optional<Wine> edit(Long id,WineDto wineDto);

       void deleteById(Long id);

}
