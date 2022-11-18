import java.util. ArrayList;

public class Order{
    private ArrayList<Food> dishes;
    private int orderNumber;
    private static int totalOrders = 0;
    private String status; 
    

    public Order(ArrayList<Food> dishes){
        this.dishes = dishes;
        totalOrders++;
        this.orderNumber = totalOrders;
        status = "placed";

    }

    public Order(){
        totalOrders++;
        this.orderNumber = totalOrders;
        dishes = new ArrayList<>();
        status = "placed";
    }

    public ArrayList<Food> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<Food> dishes) {
        this.dishes = dishes;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public boolean equals(Order o){
        return orderNumber == o.orderNumber;
    }

    public double getTotal(){
        double total = 0;
        for(Food dish: dishes){
            double price = dish.getPrice();
            total+= price;
        } 
        return total;
    }

    public String toString(){
        return "Order No:" +orderNumber+ " Status: "+status+ " Number of Dishes: "+ dishes.size()+ " total: "+getTotal()+" ";
    }

    public void addDish(Food f){
        dishes.add(f);
    }

    public void removeDish(Food f){
        dishes.remove(f);
    }
    
    public String[] getPossibleStatuses(){
        String[] g = {"placed", "cooking", "ready", "served"};
        return g;
    }

    public String getStatus(){
        
        return status;

    }
    public void setStatus(String s){
        status = s;
    }

   
}