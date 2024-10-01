import java.util.ArrayList;
import java.util.Collections;

public class SortUsingComparator {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		al.add(5);
		al.add(6);
		al.add(1);
		al.add(10);
		al.add(8);

		Collections.sort(al, (al1, al2) -> {

			if (al1 > al2) {

				return -1;
			} else if (al1 < al2) {
				return 1;

			} else
				return 0;

		});
		System.out.println(al);

	}

}
