package transactions;

public class Transactions {
    private String transactionsId;
    private  Carrier carrier;
    private Request request;
    private Offer offer;

    public Transactions(String transactionsId, Carrier carrier, Request request, Offer offer) {
        this.transactionsId = transactionsId;
        this.carrier = carrier;
        this.request = request;
        this.offer = offer;
    }

    public String getTransactionsId() {
        return transactionsId;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public Request getRequest() {
        return request;
    }

    public Offer getOffer() {
        return offer;
    }
}
