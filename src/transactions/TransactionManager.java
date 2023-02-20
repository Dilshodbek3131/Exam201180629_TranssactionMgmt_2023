package transactions;

import java.util.*;

public class TransactionManager {

    List<String> regions = new ArrayList<>();
    Set<String> places = new HashSet<>();
    Map<String,Carrier> carriersMap = new HashMap<>();
    Map<String,Request> requestsMap= new HashMap<>();
    Map<String,Offer> offersMap = new HashMap<>();

    //R1
    public List<String> addRegion(String regionName, String... placeNames) {
        Set<String> regionPlaces = new TreeSet<>();
        regions.add(regionName);
        for (String placeName : placeNames) {
            if (!places.contains(placeName)) {
                regionPlaces.add(placeName);
            }
            places.add(placeName);
        }

        return new ArrayList<>(regionPlaces);
    }

    public List<String> addCarrier(String carrierName, String... regionNames) {
        Carrier carrier = new Carrier(carrierName);
        carriersMap.put(carrierName,carrier);
        Set<String> carrierRegions = new TreeSet<>();
        for (String regionName : regionNames) {
            if (regions.contains(regionName)) carrierRegions.add(regionName);

        }
        return new ArrayList<>(carrierRegions);

    }


    public List<String> getCarriersForRegion(String regionName) {
        Set<String> carriersForRegion = new TreeSet<>();
        regions.add(regionName);
        carriersForRegion.add(regionName);
        return new ArrayList<>(carriersForRegion);
    }
    //R2
    public void addRequest(String requestId, String placeName, String productId)
            throws TMException {
        Place place = new Place(placeName);
        if (!places.contains(placeName)) throw new TMException();
        if (requestsMap.containsKey(requestId)) throw new TMException();
        Request request = new Request(requestId, productId,place);
        requestsMap.put(requestId,request);
    }

    public void addOffer(String offerId, String placeName, String productId)
            throws TMException {
        Place place = new Place(placeName);

        if (!places.contains(placeName)) throw new TMException();
        if (offersMap.containsKey(offerId)) throw new TMException();

        Offer offer = new Offer(offerId,productId,place);
        offersMap.put(offerId,offer);
    }


    //R3
    public void addTransaction(String transactionId, String carrierName, String requestId, String offerId)
            throws TMException {
        Place place = new Place(carrierName);
        if (!requestsMap.get(requestId).getProductId().equals(offersMap.get(offerId).getProductId())) throw new TMException();

    }

    public boolean evaluateTransaction(String transactionId, int score) {
        return false;
    }

    //R4
    public SortedMap<Long, List<String>> deliveryRegionsPerNT() {
        return new TreeMap<Long, List<String>>();
    }

    public SortedMap<String, Integer> scorePerCarrier(int minimumScore) {
        return new TreeMap<String, Integer>();
    }

    public SortedMap<String, Long> nTPerProduct() {
        return new TreeMap<String, Long>();
    }
}