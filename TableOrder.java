public class TableOrder extends Order {
    private String customer;
    private int numOfGuests;

    public TableOrder(String customer, int numOfGuests){
        super();
        this.customer = customer;
        this.numOfGuests = numOfGuests;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNumOfGuests() {
        return numOfGuests;
    }

    public void setNumOfGuests(int numOfGuests) {
        this.numOfGuests = numOfGuests;
    }
    
    public String[] getPossibleStatuses(){
        String[] s = {"placed", "Cooking", "Served"};
        return s;
    }


    
}
