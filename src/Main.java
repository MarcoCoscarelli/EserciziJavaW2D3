import MyLibrary.Order;
import MyLibrary.OrderRepository;
import MyLibrary.Product;
import MyLibrary.ProductRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu Esercizi ---");
            System.out.println("1. Lista prodotti nella categoria 'Books' con prezzo > 100 euro");
            System.out.println("2. Lista ordini con prodotti nella categoria 'Baby'");
            System.out.println("3. Lista prodotti nella categoria 'Boys' con sconto del 10%");
            System.out.println("4. Lista ordini di clienti livello 2 tra il 01-feb-2021 e il 01-apr-2021");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    esercizio1();
                    break;
                case 2:
                    esercizio2();
                    break;
                case 3:
                    esercizio3();
                    break;
                case 4:
                    esercizio4();
                    break;
                case 0:
                    System.out.println("Uscita...");
                    break;
                default:
                    System.out.println("Opzione non valida.");
            }
        } while (choice != 0);

        scanner.close();
    }

    // Esercizi da implementare
    public static void esercizio1() {
        List<Product> products = ProductRepository.getAllProducts();
        products.stream()
                .filter(p -> p.getCategory().equals("Books") && p.getPrice() > 100)
                .forEach(System.out::println);
    }

    public static void esercizio2() {
        List<Order> orders = OrderRepository.getAllOrders();
        orders.stream()
                .filter(o -> o.getProducts().stream().anyMatch(p -> p.getCategory().equals("Baby")))
                .forEach(System.out::println);
    }

    public static void esercizio3() {
        List<Product> products = ProductRepository.getAllProducts();
        products.stream()
                .filter(p -> p.getCategory().equals("Boys"))
                .map(p -> {
                    p.setPrice(p.getPrice() * 0.9);  // Applica lo sconto del 10%
                    return p;
                })
                .forEach(System.out::println);
    }

    public static void esercizio4() {
        List<Order> orders = OrderRepository.getAllOrders();
        orders.stream()
                .filter(o -> o.getCustomer().getTier() == 2 &&
                        o.getOrderDate().isAfter(LocalDate.of(2021, 2, 1)) &&
                        o.getOrderDate().isBefore(LocalDate.of(2021, 4, 1)))
                .forEach(System.out::println);
    }
}
