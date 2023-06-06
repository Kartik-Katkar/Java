// import java.util.ArrayList;
// import java.util.List;

// class Order{
//     private int orderId;
//     private List<String> itemNames;
//     private boolean cashOnDelivary;
//     public int getOrderId() {
//         return orderId;
//     }
//     public void setOrderId(int orderId) {
//         this.orderId = orderId;
//     }
//     public List<String> getItemNames() {
//         return itemNames;
//     }
//     public void setItemNames(List<String> itemNames) {
//         this.itemNames = itemNames;
//     }
//     public boolean getCashOnDelivary(){
//         return cashOnDelivary;
//     }
//     public void setCashOnDelivary(boolean cashOnDelivary) {
//         this.cashOnDelivary = cashOnDelivary;
//     }
//     public Order(int orderId, List<String> itemNames, boolean cashOnDelivary ){
//         this.orderId = orderId;
//         this.cashOnDelivary = cashOnDelivary;
//         this.itemNames = itemNames;

//     }
// }
// public class Tester {
//     public static void main(String[] args) {
//         List<String> itemnames1 = new ArrayList<String>();
//         itemnames1.add("Jeans");
//         itemnames1.add("Shirt");
//         itemnames1.add("Belt");
//         Order o1 = new Order(101, itemnames1, true);

//         List<String> itemnames2 = new ArrayList<String>();
//         itemnames2.add("Tie");
//         itemnames2.add("Shirt");
//         Order o2 = new Order(102, itemnames2, true);

//         List<String> itemnames3 = new ArrayList<String>();
//         itemnames3.add("TShirts");
//         itemnames3.add("Socks");
//         itemnames3.add("Tie");
//         Order o3 = new Order(103, itemnames3, true);

//         List<Order> orders = new ArrayList<Order>();
//         orders.add(o1);
//         orders.add(o2);
//         orders.add(o3);

//         List<String> items = getItems(orders);
//         System.out.println("List of Items");
        
//         /*for (String item : items) {
//             System.out.print(item+ " ");
//         }*/
//         System.out.println(items);
//     }
//     private static List<String> getItems(List<Order> orders) {
//         List<String> items = new ArrayList<String>();
//         for (Order order : orders) {
//             items.addAll(order.getItemNames());
//         }
//         System.out.println(items);
//         return items;
//     }
// }

import java.util.ArrayList;
import java.util.List;

class Order1{
    private int orderId;
    private List<String> itemNames;
    private boolean cashOnDelivary;
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public List<String> getItemNames() {
        return itemNames;
    }
    public void setItemNames(List<String> itemNames) {
        this.itemNames = itemNames;
    }
    public boolean getCashOnDelivary(){
        return cashOnDelivary;
    }
    public void setCashOnDelivary(boolean cashOnDelivary) {
        this.cashOnDelivary = cashOnDelivary;
    }
    public Order1(int orderId, List<String> itemNames, boolean cashOnDelivary ){
        this.orderId = orderId;
        this.cashOnDelivary = cashOnDelivary;
        this.itemNames = itemNames;

    }
}
public class Tester {
    public static void main(String[] args) {
        List<String> itemnames1 = new ArrayList<String>();
        itemnames1.add("Sportswear");
        itemnames1.add("Dumbbell");
        
        Order1 o1 = new Order1(311, itemnames1, true);

        List<String> itemnames2 = new ArrayList<String>();
        itemnames2.add("Jeans");
        
        Order1 o2 = new Order1(102, itemnames2, true);

        List<String> itemnames3 = new ArrayList<String>();
        itemnames3.add("Smartwatch");
        itemnames3.add("Fitnessband");
        itemnames3.add("Joggers");
        Order1 o3 = new Order1(103, itemnames3, true);

        List<Order1> orders = new ArrayList<Order1>();
        orders.add(o1);
        orders.add(o2);
        orders.add(o3);

        List<String> items = getItems(orders);
        System.out.println("List of Items");
        
        /*for (String item : items) {
            System.out.print(item+ " ");
        }*/
        System.out.println(items);
    }
    
    private static List<String> getItems(List<Order1> orders) {
        List<String> items = new ArrayList<String>();
        for (Order1 order : orders) {
            items.addAll(order.getItemNames());
        }
        System.out.println(items);
        return items;
    }
}
