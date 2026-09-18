public class OrderItem {
    private Clothing clothing;
    private int quantity;

    public OrderItem (Clothing clothing, int quantity){
        this.clothing = clothing;
        this.quantity = quantity;
    }

    public Clothing getClothing() {
        return clothing;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return clothing.getUnitPrice() * quantity;
    }
}
