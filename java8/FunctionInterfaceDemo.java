import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {

		// List of products

		List<FunctionInterfaceProduct> al = new ArrayList<>();
		al.add(new FunctionInterfaceProduct("Laptop", 1200, "electronics", "A"));
		al.add(new FunctionInterfaceProduct("Phone", 1500, "electronics", "B"));
		al.add(new FunctionInterfaceProduct("Table", 150, "furniture", "A"));
		al.add(new FunctionInterfaceProduct("Headphones", 80, "electronics", "B"));
		al.add(new FunctionInterfaceProduct("Book", 30, "stationary", "C"));

		Function<List<FunctionInterfaceProduct>, Double> f = pricelist -> {
			double cost = 0;
			for (FunctionInterfaceProduct product : pricelist) {
				cost = cost + product.getPrice();
			}
			return cost;
		};
		System.out.println("total cost of products is : " + f.apply(al));

		Function<List<FunctionInterfaceProduct>, Double> f1 = pricelist -> {

			double cost = 0;
			for (FunctionInterfaceProduct product : pricelist) {
				if (product.getPrice() > 1000) {
					cost += product.getPrice();

				}
			}
			return cost;

		};
		System.out.println("cost of all products greater than 1000 is : " + f1.apply(al));

		Function<List<FunctionInterfaceProduct>, Double> f2 = pricelist -> {
			double cost = 0;
			for (FunctionInterfaceProduct product : pricelist) {

				if (product.getCategory().equalsIgnoreCase("electronics")) {
					cost = cost + product.getPrice();
				}
			}

			return cost;
		};

		System.out.println("cost of all products with electronics category : " + f2.apply(al));

		// Write a function to get all the products whose price is > 1000/

		Function<List<FunctionInterfaceProduct>, List<FunctionInterfaceProduct>> f3 = productList -> {
			List<FunctionInterfaceProduct> newl = new ArrayList<>();
			for (FunctionInterfaceProduct p : productList) {

				if (p.getPrice() > 1000) {

					newl.add(p);
				}
			}
			return newl;
		};

		// Function to get all products belongs to electronic category

		Function<List<FunctionInterfaceProduct>, List<FunctionInterfaceProduct>> f4 = productList -> {
			List<FunctionInterfaceProduct> newl = new ArrayList<>();
			for (FunctionInterfaceProduct p : productList) {

				if (p.getCategory().equalsIgnoreCase("Electronics")) {

					newl.add(p);
				}
			}
			return newl;
		};

		System.out.println("all products with price greater than 1000  with category electronics is : " + f3.andThen(f4).apply(al));

	}
}
