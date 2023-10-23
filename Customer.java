import java.util.List;

public class Customer {
    String name;
    double budget;
    List<String> shoppingList;

    public Customer(String name, double budget, List<String> shoppingList) {
        this.name = name;
        this.budget = budget;
        this.shoppingList = shoppingList;
    }
}
