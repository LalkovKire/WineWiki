package mk.ukim.finki.winewiki.repository;

import mk.ukim.finki.winewiki.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer,Long>{

    Optional<Manufacturer> findByName(String name);
}
