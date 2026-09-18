import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate orderdate;
    private String description;
    private Customer customer;
    private List<OrderItem> items;

    public Order (LocalDate orderdate, String description, Customer customer){
        this.orderdate = orderdate;
        this.description = description;
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public double getTotalAmount() {
        double total = 0.0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void addItem(Clothing clothing, int quantity){
        this.items.add(new OrderItem(clothing, quantity));
    }

    public LocalDate getOrderdate() {
        return orderdate;
    }

    public String getDescription() {
        return description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}
