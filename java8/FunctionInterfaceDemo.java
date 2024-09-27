import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInterfaceDemo {

    public static void main(String[] args) {

        // List of products
        List<FunctionInterfaceProduct> products = Arrays.asList(
                new FunctionInterfaceProduct("Laptop", 1200, "electronics", "A"),
                new FunctionInterfaceProduct("Phone", 900, "electronics", "B"),
                new FunctionInterfaceProduct("Table", 150, "furniture", "A"),
                new FunctionInterfaceProduct("Headphones", 80, "electronics", "B"),
                new FunctionInterfaceProduct("Book", 30, "stationary", "C")
        );

        // 1. Function to calculate the total cost of all products
        Function<List<FunctionInterfaceProduct>, Double> totalCost = productList -> 
                productList.stream().mapToDouble(p -> p.price).sum();
        System.out.println("Total cost of all products: " + totalCost.apply(products));

        // 2. Function to calculate the cost of products whose price is > 1000
        Function<List<FunctionInterfaceProduct>, Double> costOfExpensiveProducts = productList -> 
                productList.stream().filter(p -> p.price > 1000).mapToDouble(p -> p.price).sum();
        System.out.println("Cost of products with price > 1000: " + costOfExpensiveProducts.apply(products));

        // 3. Function to calculate the cost of all electronic products
        Function<List<FunctionInterfaceProduct>, Double> costOfElectronicProducts = productList -> 
                productList.stream().filter(p -> "electronics".equalsIgnoreCase(p.category))
                          .mapToDouble(p -> p.price).sum();
        System.out.println("Cost of all electronic products: " + costOfElectronicProducts.apply(products));

        // 4. Function to get all products whose price is > 1000 and belongs to electronics category
        Function<List<FunctionInterfaceProduct>, List<FunctionInterfaceProduct>> expensiveElectronics = productList -> 
                productList.stream()
                           .filter(p -> p.price > 1000 && "electronics".equalsIgnoreCase(p.category))
                           .collect(Collectors.toList());
        System.out.println("Products with price > 1000 and in electronics category: " + expensiveElectronics.apply(products));
    }
}
