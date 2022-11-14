import java.util.ArrayList;

public class TakeOutOrder extends Order {
    private String customer;

    public TakeOutOrder( String customer){
        super();
        this.customer = customer;
        
    }
    public TakeOutOrder( String customer, ArrayList<Food> dishes){
        super(dishes);
        this.customer = customer;
    }
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    //tostring todo
    
    public String[] getPossibleStatuses(){
        String[] s = {"placed", "Cooking","Waiting For Pickup","Delivered"};
        return s;
    }   

}
    
