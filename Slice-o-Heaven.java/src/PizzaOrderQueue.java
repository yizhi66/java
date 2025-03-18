import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class PizzaOrder {
    private String orderDetails;

    public PizzaOrder(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return orderDetails;
    }
}

public class PizzaOrderQueue {
    private Queue<PizzaOrder> orderQueue;

    public PizzaOrderQueue() {
        orderQueue = new LinkedList<>();
    }

    public void addOrder(PizzaOrder order) {
        orderQueue.add(order);
        System.out.println("Order added to the queue: " + order);
    }

    private void displayNextOrder() {
        if (!orderQueue.isEmpty()) {
            System.out.println("Next order in the queue: " + orderQueue.peek());
        } else {
            System.out.println("The order queue is empty.");
        }
    }

    private PizzaOrder processOrder() {
        if (!orderQueue.isEmpty()) {
            return orderQueue.poll();
        }
        return null;
    }

    private void removeAllOrders() {
        orderQueue.clear();
        System.out.println("All orders have been removed from the queue.");
    }

    private boolean isQueueEmpty() {
        return orderQueue.isEmpty();
    }

    private void displayAllOrders() {
        for (PizzaOrder order : orderQueue) {
            System.out.println(order);
        }
    }

    public void handleOrders() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" Choose what you want to do with order logs:");
            System.out.println("1. Display all the logs");
            System.out.println("2. Display the most recent logs");
            System.out.println("3. Remove a log entry");
            System.out.println("4. Remove alllog entries");
            System.out.println("5. Check if the log is completely empty");
            System.out.println("Enter your choice (1-5) or any other number to exit:");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    displayAllOrders();
                    break;
                case 2:
                    displayNextOrder();
                    break;
                case 3:
                    if (!isQueueEmpty()) {
                        System.out.println("Processed order: " + processOrder());
                    } else {
                        System.out.println("The order queue is empty.");
                    }
                    break;
                case 4:
                    removeAllOrders();
                    break;
                case 5:
                    if (isQueueEmpty()) {
                        System.out.println("The order queue is empty");
                    } else {
                        System.out.println("The order queue is not empty");
                    }
                    break;
                default:
                    System.out.println("Exiting order handling.");
                    return;
            }
        }
    }
    public static void main(String[] args) {
        PizzaOrderQueue pizzaQueue = new PizzaOrderQueue();
        pizzaQueue.addOrder(new PizzaOrder("Large Pepperoni Pizza, Garlic Bread, Coke"));
        pizzaQueue.addOrder(new PizzaOrder("Medium Mushroom Pizza, Fries, Sprite"));
        pizzaQueue.handleOrders();
    }
}

