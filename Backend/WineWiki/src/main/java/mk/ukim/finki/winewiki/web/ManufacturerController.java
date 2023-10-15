package mk.ukim.finki.winewiki.web;

import mk.ukim.finki.winewiki.model.Manufacturer;
import mk.ukim.finki.winewiki.model.dto.ManufacturerDto;
import mk.ukim.finki.winewiki.service.ManufacturerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/manufacturer")
@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:5172"})
public class ManufacturerController {

    private final ManufacturerService manufacturerService;

    public ManufacturerController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

    @GetMapping("/all")
    public List<Manufacturer> findAll() {
        return this.manufacturerService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Manufacturer> findById(@PathVariable Long id) {
         return this.manufacturerService.findById(id)
                 .map(manufacturer -> ResponseEntity.ok().body(manufacturer))
                 .orElseGet(() -> ResponseEntity.notFound().build());
    }

   @GetMapping("/name/{name}")
   public ResponseEntity<Manufacturer> findByName(@PathVariable String name) {
        return this.manufacturerService.findByName(name)
                .map(manufacturer -> ResponseEntity.ok().body(manufacturer))
                .orElseGet(() -> ResponseEntity.notFound().build());
   }

   @PostMapping("/add")
   public ResponseEntity<Manufacturer> save(@RequestBody ManufacturerDto manufacturerDto) {
       Optional<Manufacturer> manufacturer = this.manufacturerService.save(manufacturerDto);
       return ResponseEntity.of(manufacturer);
   }

   @DeleteMapping("/delete/{id}")
   public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.manufacturerService.deleteById(id);
        if (this.manufacturerService.findById(id).isPresent()) return ResponseEntity.badRequest().build();
        return ResponseEntity.ok().build();
   }
}
