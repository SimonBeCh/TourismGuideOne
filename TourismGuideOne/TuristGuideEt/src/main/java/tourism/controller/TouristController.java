package tourism.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tourism.model.TouristAttraction;
import tourism.service.TouristService;

import java.util.List;

@RestController
@RequestMapping("/attractions")
public class  TouristController {

    private final TouristService service;

    public TouristController(TouristService touristService) {
        this.service = touristService;
    }

    @GetMapping
    public List<TouristAttraction> attractionList() {

        List<TouristAttraction> attractions = service.getAllAttractions();
        return new ResponseEntity<>(attractions, HttpStatus.CREATED).getBody();

    }
}
