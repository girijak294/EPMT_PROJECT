import java.util.Scanner;

public class ForLoopEvenPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		System.out.print("Enter X: ");
		int x = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(x + " ");
				x = x + 2;

			}

			System.out.println();

		}
	}

}
