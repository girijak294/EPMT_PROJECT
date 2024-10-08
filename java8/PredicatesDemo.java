import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesDemo {

	public static void main(String[] args) {

		List<PredicatesProduct> al = new ArrayList<>();
		al.add(new PredicatesProduct("Laptop", 1200, "electronics", "A"));
		al.add(new PredicatesProduct("Table", 1100, "furniture", "B"));
		al.add(new PredicatesProduct("Headphones", 270, "electronics", "A"));
		al.add(new PredicatesProduct("Phone", 900, "electronics", "A"));
		al.add(new PredicatesProduct("Book", 800, "stationary", "C"));

		List<Response> bl = new ArrayList<>();
		bl.add(new Response("Success", 200, "JSON"));
		bl.add(new Response("Client Error", 400, "JSON"));
		bl.add(new Response("Server Error", 500, "HTML"));
		bl.add(new Response("Bad Request", 400, "XML"));
		bl.add(new Response("OK", 200, "JSON"));

		Predicate<PredicatesProduct> p = pr -> pr.getPrice() > 1000;
		System.out.println("Products with price greater than 1000:");
		for (PredicatesProduct product : al) {

			if (p.test(product)) {

				System.out.println(product);
			}

		}

		Predicate<PredicatesProduct> pp = cat -> cat.getCategory().equalsIgnoreCase("electronics");
		System.out.println("Products electronic category are");
		for (PredicatesProduct product : al) {
			if (pp.test(product))
				System.out.println(product);
		}
		
		System.out.println("Combined and check");
		for(PredicatesProduct product: al) {
			
			if(p.and(pp).test(product)) {
				
				System.out.println(product);
			}
		}
		
		System.out.println("Combined or check ");
		for(PredicatesProduct product: al) {
			
			if(p.or(pp).test(product)) {
				
				System.out.println(product);
			}
		}
		
		// Predicate to check if the status code is 400
        Predicate<Response> stcode = response -> response.getStatusCode() == 400;

        // Predicate to check if the response type is JSON
        Predicate<Response> restype = response -> "JSON".equalsIgnoreCase(response.getResponseType());
        System.out.println("negate response check ");
        for(Response r: bl) {
        	
        	if(stcode.negate().and(restype).test(r)) {
        		System.out.println(r);
        		
        	}
        }
		
		
		

	}
}
