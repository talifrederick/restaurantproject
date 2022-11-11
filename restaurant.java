import java.util.Scanner;
import java.util.ArrayList;

public class restaurant {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Food> menu = new ArrayList<Food>();
    static ArrayList<Order> orders = new ArrayList<Order>();
    public static void main(String[] args) {
        Food Hamburger = new Food("Hamburger", 10);
        Food Ribeye = new Food("Ribeye Steak", 25);
        Food Wings = new Food("6 count Wings", 11);
        Food Quesadilla = new Food("Quesadillas", 12);
        menu.add(Hamburger);
        menu.add(Ribeye);
        menu.add(Wings);
        menu.add(Quesadilla);
        int ans = 0;
        while(ans != -1){
            System.out.println("Options:");
            System.out.println("1: Dine in");
            System.out.println("2: Takeout order");
            System.out.println("3: Delivery Order");
            System.out.println("4: List orders");
            System.out.println("5: Status");


            if( ans == 1){

            }

            if(ans==2){

            }

            if(ans==3){

            }

            if(ans==4){

            }

            if(ans ==5){

            }

        }
    }

    public static String getType(Order o){
        if(o instanceof TakeOutOrder){
            return "TakeoutOrder";

        }

        else if(o instanceof DeliveryOrder){
            return "TableOrder";
        }

        else if(o instanceof TableOrder){
            return "TableOrder";
        }

        else{
            return "";
        }
    }
    
}
