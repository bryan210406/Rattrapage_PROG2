import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    public void testGetTotalAmount() {
        Customer customer = new Customer(
                "Bryan", "Kenny", LocalDate.of(2006, 4, 21),
                "Antananarivo", "bryan.23@gmail.com", "0344416842   "
        );

        Clothing tShirt = new Top("T-Shirt", Size.M, 15.0, Material.COTTON, SleeveType.SHORT);
        Clothing jeans = new Bottom("Jeans", Size.L, 40.0, Material.OTHER, 42);

        Order order = new Order(LocalDate.now(), "Summer clothing order", customer);
        order.addItem(tShirt, 2);
        order.addItem(jeans, 1);

        double expectedTotal = 70.0;
        double actualTotal = order.getTotalAmount();

        assertEquals(expectedTotal, actualTotal, 0.001, "The calculated total amount must match the expected total.");
    }
}