public class Amount {
    private String id;
    private int amount;
    private String currency;

    Amount (String id, int amount, String currency){
        this.id=id;
        this.amount=amount;
        this.currency=currency;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
