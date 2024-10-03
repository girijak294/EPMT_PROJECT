import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSort {
	public static void main(String[] args) {

		Set<Integer> numbers = new TreeSet<>((a,b) -> b.compareTo(a));

		// Adding some numbers to the TreeSet
		numbers.addAll(Arrays.asList(10, 5, 20, 8, 15));

		// Printing the sorted TreeSet
		System.out.println("Numbers in reverse order: " + numbers);
	}
}
