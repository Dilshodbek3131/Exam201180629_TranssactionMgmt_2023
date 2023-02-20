package transactions;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private String name;


    private List<Place> places = new ArrayList<>();

    public Region(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlace(Place place) {
        places.add(place);
    }

    public List<Place> getPlaces() {
        return places;
    }
}
