package tourism.service;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import tourism.model.TouristAttraction;
import tourism.repository.TouristRepository;

import java.util.List;

@Service
public class TouristService {

    private final TouristRepository repository;

    public TouristService(TouristRepository repository) {
        this.repository = repository;
    }

    public List<TouristAttraction> getAllAttractions() {

        return repository.getAllAttractions();
    }

    public TouristAttraction getAttractionByName(String name) {

        TouristAttraction attraction = repository.getAttractionByName(name);

        if (attraction != null && attraction.getName().equals(name)) {
            return attraction;
        }
        return null;
    }
}
