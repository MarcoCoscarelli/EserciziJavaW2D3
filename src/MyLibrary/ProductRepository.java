package MyLibrary;

import java.util.Arrays;
import java.util.List;

public class ProductRepository {

    public static List<Product> getAllProducts() {
        return Arrays.asList(
                new Product(1L, "Romanzo criminale", "Books", 120.0),
                new Product(2L, "Java e i suoi segreti", "Books", 80.0),
                new Product(3L, "Lego Technichs", "Baby", 50.0),
                new Product(4L, "jhonson's baby oil", "Boys", 40.0),
                new Product(5L, "Scarpe da calcetto", "Boys", 150.0),
                new Product(6L, "Pigiama", "Baby", 70.0)
        );
    }
}
