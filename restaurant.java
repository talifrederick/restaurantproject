import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashSet;

public class restaurant {
   
    static ArrayList<Food> menu = new ArrayList<Food>();
    static ArrayList<Food> dishes = new ArrayList<Food>();
    static ArrayList<Order> orders = new ArrayList<Order>();
    private static Scanner sc = new Scanner(System.in);
  
    


    public static void main(String[] args) {

        TableOrder tableOrder;
        Order order;

        Random rand = new Random(); // creating instance of Random class

        Food Hamburger = new Food("Hamburger", 10);
        Food Ribeye = new Food("Ribeye Steak", 25);
        Food Wings = new Food("6 count Wings", 11);
        Food Quesadilla = new Food("Quesadillas", 12);
        menu.add(Hamburger);
        menu.add(Ribeye);
        menu.add(Wings);
        menu.add(Quesadilla);
        int ans = -1;
        while(ans != 0){
            System.out.println("Options:");
            System.out.println("1: Dine in");
            System.out.println("2: Takeout order");
            System.out.println("3: Delivery Order");
            System.out.println("4: List orders");
            System.out.println("5: Update Order");
            System.out.println("Select an option:");
            ans = sc.nextInt();
            sc.nextLine();


            if(ans == 1){

                System.out.println("What's your name?");
                String customer = sc.nextLine(); // name of customer
                System.out.println("How many people?");
                int numOfGuests = sc.nextInt(); // num of people at table
                int tableNumber = rand.nextInt(10); // generating a random table number
                System.out.println("You will be seated at table " + tableNumber);
                System.out.println("What would you like on the menu:");
                ArrayList<Food> dishes = getDishes();
                TableOrder o = new TableOrder(customer, numOfGuests, tableNumber); 
                o.setDishes(dishes);
                orders.add(o);
                



            }

            if(ans==2){
                System.out.print("Customer name: ");
                String customer = sc.nextLine();
                ArrayList<Food> dishes = getDishes(); 
                TakeOutOrder o = new TakeOutOrder(customer);
                o.setDishes(dishes);
                orders.add(o);


            }

            if(ans==3){
                System.out.print("Customer name: ");
                String customer = sc.nextLine();
                System.out.print("Address: ");
                String addr = sc.nextLine();
                System.out.print("Phone: ");
                String phone = sc.nextLine();
                ArrayList<Food> dishes = getDishes(); //function inside of restaurant
                DeliveryOrder o = new DeliveryOrder(customer, addr, phone);
                o.setDishes(dishes);
                orders.add(o);

            }

            if(ans==4){
                System.out.println("1. List by order number");
                System.out.println("2. List by order type");
                System.out.println("3. List by status");
                System.out.println("4. select an option");
                ans = sc.nextInt();
                sc.nextLine();
                listOrders(ans);

                

                

            }

            if(ans ==5){
                System.out.println("1. Update status");
                System.out.println("2. Add dish");
                System.out.println("3. Remove dish");
                System.out.println("4. Cancel order");
                System.out.println("select an option");
                ans = sc.nextInt();
                sc.nextLine();

                for(int i =0; i < orders.size(); i++){
                    System.out.println(1 +" "+orders.get(i));
                }
                int orderNum = sc.nextInt();
                sc.nextLine();

                Order o = orders.get(orderNum);

                if (ans==1){
                    String[]  statuses = o.getPossibleStatuses();
                    System.out.println(orders.get(orderNum));

                    for(int i =0; i < statuses.length;i++){
                        System.out.println(i+" "+statuses[i]);
                    }
                    int newStatus = sc.nextInt();
                    sc.nextLine();
                    o.setStatus(statuses[newStatus]);
                

                }

                if(ans ==2){
                    ArrayList<ArrayList <Food>> dishes2 = new ArrayList<>();
                    ArrayList<Food> dishes = getDishes(); 
                    for( Food dish: dishes){
                        o.addDish(dish);
                    }
                    System.out.println(dishes);
                    
                    dishes2.add(dishes);
                    System.out.println(dishes2);

                }

                

            }

        }
    }

    public static ArrayList<Food> getDishes(){
        ArrayList<Food> dishes = new ArrayList<>();
        int ans = 1;
        while(ans!= 0){
            for(int i =0; i <menu.size(); i++){
                System.out.println(i +1 + " "+ menu.get(i));
            }
            System.out.println("Enter Choice (-1 to exit):");
            ans = sc.nextInt();
            sc.nextLine();
            if(ans > 0 && ans<= menu.size()){
                dishes.add(menu.get(ans));
            }
            else if(ans ==-1){
                break;

            }
            else{
                System.out.println("Invalid Choice");
            }
        }
        return dishes;
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

    public static void listOrders(int n){
        if (n==1){ //print orders by order number
            for(Order o: orders){
                System.out.println(o);

            }
        }
        if(n==2){
            HashSet<String> orderTypes = new HashSet<>();
            for(Order o: orders){
                orderTypes.add(getType(o));
            }

            for(String orderType: orderTypes){
                for(Order o: orders){
                    if (getType(o).equals(orderType)){
                        System.out.println(o);
                    }
                }
            }

        }
        //if(n==3){//print orders by status
            //for(int i = 0; i)
        
    }
    
}
