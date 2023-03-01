package transactions;

public class Transactions {
    private String transactionsId;
    private  Carrier carrier;
    private Request request;
    private Offer offer;
    private  int score;

    public Transactions(String transactionsId, Carrier carrier, Request request, Offer offer) {
        this.transactionsId = transactionsId;
        this.carrier = carrier;
        this.request = request;
        this.offer = offer;
        this.score = 0;
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

    public int getScore() {
        return score;
    }

    public void setTransactionsId(String transactionsId) {
        this.transactionsId = transactionsId;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
