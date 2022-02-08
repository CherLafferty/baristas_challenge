import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 4.25);
        // item1.name = "mocha";
        // item1.price = 4.25;
        Item item2 = new Item("latte", 4.75);
        // item2.name = "latte";
        // item2.price = 4.75;
        Item item3 = new Item("drip coffee", 2.95);
        // item3.name = "drip coffee";
        // item3.price = 2.95;
        Item item4 = new Item("cappuccino", 3.95);
        // item4.name = "cappuccino";
        // item4.price = 3.95;
        // *************************

        // Order variables -- order1, order2 etc.
        // create 2 orders for unnamed guests
        Order order1 = new Order();
        // order1.name = "Cinduri";
        Order order2 = new Order();
        // order2.name = "Jimmy";
        Order order3 = new Order("Noah");
        // order3.name = "Noah";
        Order order4 = new Order("Sam");
        // order4.name = "Sam";
        Order order5 = new Order("Emily");
    
        // Application Simulations
        order1.addItem(item1);
        order1.addItem(item4);
        System.out.println(order1.getStatusMessage());
        // order1.items.add(item1);
        // order1.total += item1.price;
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());
        // order1.ready = true;
        System.out.println(order1.getOrderTotal());
        // order2.items.add(item1);
        // order2.total += item1.price;
        // order1.ready = true;

        order3.addItem(item2);
        order3.addItem(item2);
        order3.addItem(item3);
        order3.display();
        // order3.items.add(item4);
        // order3.total += item4.price;
        // order1.ready = true;

        // order4.items.add(item2);
        // order4.items.add(item2);
        // order4.total += item2.price * 2;
        // order1.ready = false;

    // *************************************************
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);

        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);

        // System.out.printf("Name: %s\n", order3.name);
        // System.out.printf("Total: %s\n", order3.total);
        // System.out.printf("Ready: %s\n", order3.ready);

        // System.out.printf("Name: %s\n", order4.name);
        // System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Ready: %s\n", order4.ready);
    }
}
