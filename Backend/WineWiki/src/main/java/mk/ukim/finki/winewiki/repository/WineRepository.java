package mk.ukim.finki.winewiki.repository;

import mk.ukim.finki.winewiki.model.Wine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WineRepository extends JpaRepository<Wine,Long> {

    Optional<Wine> findByName(String name);
}
