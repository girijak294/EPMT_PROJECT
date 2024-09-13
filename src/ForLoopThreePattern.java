import java.util.Scanner;

public class ForLoopThreePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		System.out.print("Enter X: ");
		int x = sc.nextInt();
		int count = 0;
		sc.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (count % 3 == 0)
					System.out.print(count + " ");
				count += x;
				;

			}

			System.out.println();

		}
	}

}
