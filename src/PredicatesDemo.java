import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesDemo {

    public static void main(String[] args) {

        // List of products
        List<PredicatesProduct> products = Arrays.asList(
                new PredicatesProduct("Laptop", 1200, "electronics", "A"),
                new PredicatesProduct("Phone", 900, "electronics", "B"),
                new PredicatesProduct("Table", 150, "furniture", "A"),
                new PredicatesProduct("Headphones", 80, "electronics", "B"),
                new PredicatesProduct("Book", 30, "stationary", "C")
        );

        // List of responses
        List<Response> responses = Arrays.asList(
                new Response("Success", 200, "JSON"),
                new Response("Client Error", 400, "JSON"),
                new Response("Server Error", 500, "HTML"),
                new Response("Bad Request", 400, "XML"),
                new Response("OK", 200, "JSON")
        );

        // 1. Predicate for products with price greater than 1000
        Predicate<PredicatesProduct> priceGreaterThan1000 = p -> p.price > 1000;
        System.out.println("Products with price greater than 1000:");
        products.stream().filter(priceGreaterThan1000).forEach(System.out::println);

        // 2. Predicate for products in electronics category
        Predicate<PredicatesProduct> isElectronics = p -> "electronics".equalsIgnoreCase(p.category);
        System.out.println("\nProducts in electronics category:");
        products.stream().filter(isElectronics).forEach(System.out::println);

        // 3. Products with price greater than 100 in electronics category
        System.out.println("\nProducts with price greater than 100 and in electronics category:");
        products.stream().filter(priceGreaterThan1000.negate().and(p -> p.price > 100).and(isElectronics)).forEach(System.out::println);

        // 4. Products with price greater than 100 or in electronics category
        System.out.println("\nProducts with price greater than 100 or in electronics category:");
        products.stream().filter(p -> p.price > 100 || "electronics".equalsIgnoreCase(p.category)).forEach(System.out::println);

        // 5. Products with price less than 100 and in electronics category
        Predicate<PredicatesProduct> priceLessThan100 = p -> p.price < 100;
        System.out.println("\nProducts with price less than 100 and in electronics category:");
        products.stream().filter(priceLessThan100.and(isElectronics)).forEach(System.out::println);

        // 6. Predicate for responses with status code 400
        Predicate<Response> statusCodeIs400 = r -> r.statusCode == 400;
        System.out.println("\nResponses with status code 400:");
        responses.stream().filter(statusCodeIs400).forEach(System.out::println);

        // 7. Predicate for responses with response type JSON
        Predicate<Response> responseTypeIsJSON = r -> "JSON".equalsIgnoreCase(r.responseType);
        System.out.println("\nResponses with response type JSON:");
        responses.stream().filter(responseTypeIsJSON).forEach(System.out::println);

        // 8. Responses with status code 400 and response type JSON
        System.out.println("\nResponses with status code 400 and response type JSON:");
        responses.stream().filter(statusCodeIs400.and(responseTypeIsJSON)).forEach(System.out::println);

        // 9. Responses with status code 400 or response type JSON
        System.out.println("\nResponses with status code 400 or response type JSON:");
        responses.stream().filter(statusCodeIs400.or(responseTypeIsJSON)).forEach(System.out::println);

        // 10. Responses with status code not 400 and response type JSON
        System.out.println("\nResponses with status code not 400 and response type JSON:");
        responses.stream().filter(statusCodeIs400.negate().and(responseTypeIsJSON)).forEach(System.out::println);
    }
}
