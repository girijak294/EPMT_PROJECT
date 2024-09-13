
public class PartyResult {

	public static int party(int tea, int candy) {
		if (tea < 5 || candy < 5) {
			return 0;
		}

		if (tea >= 2 * candy || candy >= 2 * tea) {
			return 2;
		}

		return 1;
	}

	public static void main(String[] args) {
		int tea = 10;
		int candy = 3;

		int result = party(tea, candy);
		System.out.println("Party result: " + result);
	}
}
