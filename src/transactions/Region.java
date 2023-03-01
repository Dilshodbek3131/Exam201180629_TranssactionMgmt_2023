package transactions;

import java.lang.management.PlatformLoggingMXBean;
import java.util.Comparator;
import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

public class Region {
    private String name;


    private Set<String> places = new TreeSet<>( );
    private Set<Carrier> carriers = new HashSet<>();

    public Region(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Carrier> getCarriers() {
        return carriers;
    }

    public  void  addCarrier(Carrier carrier){
        carriers.add(carrier);
    }

    public Set<String> getPlaces() {
        return places;
    }
}
