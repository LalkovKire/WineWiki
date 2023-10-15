package mk.ukim.finki.winewiki.web;

import mk.ukim.finki.winewiki.model.Wine;
import mk.ukim.finki.winewiki.model.dto.WineDto;
import mk.ukim.finki.winewiki.service.WineService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:5172"})
@RequestMapping("/api/wines")
public class WineController {

    private final WineService wineService;

    public WineController(WineService wineService) {
        this.wineService = wineService;
    }

    @GetMapping("/all")
    public List<Wine> findAll(){
        return this.wineService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Wine> findById(@PathVariable Long id){
        return this.wineService.findById(id)
                .map(wine -> ResponseEntity.ok().body(wine))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Wine> findByName(@PathVariable String name){
        return this.wineService.findByName(name)
                .map(wine -> ResponseEntity.ok().body(wine))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }
    @PostMapping("/add")
    public ResponseEntity<Wine> save(@RequestBody WineDto wineDto) {
        Optional<Wine> wine = this.wineService.save(wineDto);
        return ResponseEntity.of(wine);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<Wine> edit(@PathVariable Long id, @RequestBody WineDto wineDto) {
        Optional<Wine> wine = this.wineService.edit(id,wineDto);
        return ResponseEntity.of(wine);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        this.wineService.deleteById(id);
        if (this.wineService.findById(id).isEmpty()) return ResponseEntity.ok().build();
        return ResponseEntity.badRequest().build();
    }
}
