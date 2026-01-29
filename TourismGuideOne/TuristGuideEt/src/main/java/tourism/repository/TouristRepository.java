package tourism.repository;


import org.springframework.stereotype.Repository;
import tourism.model.TouristAttraction;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {

    private List<TouristAttraction> attractions = new ArrayList<>();

    public TouristRepository() {

    }

    public void addAttraction(TouristAttraction attraction) {
        attractions.add(attraction);
    }

    public List<TouristAttraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(List<TouristAttraction> attractions) {
        this.attractions = attractions;
    }
}
