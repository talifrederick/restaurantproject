import java.util.ArrayList;

public class DeliveryOrder extends Order{
    private String customer, address, phone;

    public DeliveryOrder(String customer, String address, String phone){
        super();
        this.customer = customer;
        this.address = address;
        this.phone = phone;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString(){
        return super.toString()+customer+ " "+ address+ " "+phone;
    }
    
    public String[] getPossibleStatuses(){
        String[] s = {"placed", "Cooking","Waiting For Driver", "On the Way","Delivered"};
        return s;
    }
}