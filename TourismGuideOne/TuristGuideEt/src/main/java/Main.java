import tourism.model.TouristAttraction;
import tourism.repository.TouristRepository;

public class Main {
    static void main() {

        TouristRepository repository = new TouristRepository();

        TouristAttraction attraction1 = new TouristAttraction("Disney Land", "Amusement Park");
        TouristAttraction attraction2 = new TouristAttraction("Watching movie", "Movie Theater");
        TouristAttraction attraction3 = new TouristAttraction("Bowling", "Activity Center");
        TouristAttraction attraction4 = new TouristAttraction("Esports", "Live competitive computer entertainment");

        repository.addAttraction(attraction1);
        repository.addAttraction(attraction2);
        repository.addAttraction(attraction3);
        repository.addAttraction(attraction4);

    }
}
