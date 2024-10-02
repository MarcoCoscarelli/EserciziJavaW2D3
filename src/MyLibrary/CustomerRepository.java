package MyLibrary;

import java.util.Arrays;
import java.util.List;

public class CustomerRepository {

    public static List<Customer> getAllCustomers() {
        return Arrays.asList(
                new Customer(1L, "Marco Coscarelli", 1),
                new Customer(2L, "Kathrin Smith", 2),
                new Customer(3L, "Albero Spezzato", 2)
        );
    }
}
