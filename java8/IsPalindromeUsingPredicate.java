import java.util.function.Predicate;

public class IsPalindromeUsingPredicate {

	public static void main(String[] args) {

		Predicate<String> p = (str) -> {
			String s2 = "abcd";
			String concat = s2 + s2;
			if (s2.length() != str.length())
				return false;
			else
				return concat.contains(str);

		};

		System.out.println(p.test("dcba"));

	}

}
