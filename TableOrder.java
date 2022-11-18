public class TableOrder extends Order {
    private String customer;
    private int numOfGuests;
    private int tableNumber;


    public TableOrder(String customer, int numOfGuests, int tableNumber){
        super();
        this.customer = customer;
        this.numOfGuests = numOfGuests;
        this.tableNumber = tableNumber;
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

    public void setTableNumber(int tableNumber){
        this.tableNumber = tableNumber;
    }

    public int getTableNumber(){
        return tableNumber;
    }

    public String toString(){
        return super.toString()+customer+ " "+ numOfGuests+ " "+tableNumber;
    }

    
    
    public String[] getPossibleStatuses(){
        String[] s = {"placed", "Cooking", "Served", "canceled"};
        return s;
    }


    
}
