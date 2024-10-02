package MyLibrary;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class OrderRepository {

    public static List<Order> getAllOrders() {
        List<Product> products1 = Arrays.asList(
                new Product(1L, "Romanzo criminale", "Books", 120.0),
                new Product(3L, "Lego Technichs", "Baby", 50.0)
        );

        List<Product> products2 = Arrays.asList(
                new Product(4L, "jhonson's baby oil", "Boys", 40.0),
                new Product(5L, "Scarpe da calcetto", "Boys", 150.0)
        );

        return Arrays.asList(
                new Order(1L, "Completed", LocalDate.of(2021, 2, 15), LocalDate.of(2021, 2, 18), products1, new Customer(2L, "Jane Smith", 2)),
                new Order(2L, "Completed", LocalDate.of(2021, 3, 10), LocalDate.of(2021, 3, 15), products2, new Customer(3L, "Tom Baker", 2))
        );
    }
}
