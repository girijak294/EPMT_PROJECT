import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        // Sample list of products
        List<StreamsProduct> products = Arrays.asList(
            new StreamsProduct("Laptop", 1500, "electronics", "A"),
            new StreamsProduct("Phone", 800, "electronics", "B"),
            new StreamsProduct("Refrigerator", 1200, "appliances", "A"),
            new StreamsProduct("TV", 1800, "electronics", "A"),
            new StreamsProduct("Microwave", 900, "appliances", "B")
        );

        // 1. Get all products with price > 1000/-
        List<StreamsProduct> expensiveProducts = products.stream()
            .filter(product -> product.getPrice() > 1000)
            .collect(Collectors.toList());

        System.out.println("Products with price > 1000:");
        expensiveProducts.forEach(System.out::println);

        // 2. Get all products from electronics category
        List<StreamsProduct> electronicsProducts = products.stream()
            .filter(product -> product.getCategory().equalsIgnoreCase("electronics"))
            .collect(Collectors.toList());

        System.out.println("\nProducts from electronics category:");
        electronicsProducts.forEach(System.out::println);

        // 3. Get all products with price > 1000/- and from electronics category, convert names to uppercase
        List<String> expensiveElectronicsNames = products.stream()
            .filter(product -> product.getPrice() > 1000 && product.getCategory().equalsIgnoreCase("electronics"))
            .map(product -> product.getName().toUpperCase())
            .collect(Collectors.toList());

        System.out.println("\nProducts with price > 1000 and from electronics category (names in uppercase):");
        expensiveElectronicsNames.forEach(System.out::println);

        // 4. Count the number of electronic products
        long countElectronics = products.stream()
            .filter(product -> product.getCategory().equalsIgnoreCase("electronics"))
            .count();

        System.out.println("\nCount of electronic products: " + countElectronics);
    }
}
