import java.util.*;

public class GroceryStoreSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Customer> customerQueue = new LinkedList<>();
        Map<String, Product> inventory = new HashMap<>();

        // Inventory data
        inventory.put("Apple", new Product("Apple", 1.0, 10, "Fruits"));
        inventory.put("Milk", new Product("Milk", 2.0, 5, "Dairy"));
        inventory.put("Bread", new Product("Bread", 2.5, 8, "Bakery"));
        inventory.put("Eggs", new Product("Eggs", 1.5, 15, "Dairy"));
        inventory.put("Banana", new Product("Banana", 0.5, 20, "Fruits"));

        // Display the inventory to customers
        System.out.println("Available Products in Inventory:");
        for (String productName : inventory.keySet()) {
            Product product = inventory.get(productName);
            System.out.println(productName + " - Price: $" + product.price + " - Quantity: " + product.quantity);
        }

        // Simulate customer arrivals
        while (true) {
            System.out.print("Enter customer name (or 'exit' to finish): ");
            String name = scanner.nextLine();

            if (name.equals("exit")) {
                break;
            }

            System.out.print("Enter customer budget: ");
            double budget = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter shopping list (comma-separated products): ");
            String[] shoppingListArray = scanner.nextLine().split(",");
            List<String> shoppingList = new ArrayList<>(Arrays.asList(shoppingListArray));

            customerQueue.add(new Customer(name, budget, shoppingList));
        }

        scanner.close();
    }
}
