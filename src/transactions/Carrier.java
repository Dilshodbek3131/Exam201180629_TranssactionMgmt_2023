package transactions;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Carrier {
    private String name;
    private Region region;

    public Carrier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Region getRegion() {
        return region;
    }
}
