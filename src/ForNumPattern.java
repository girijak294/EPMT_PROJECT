import java.util.Scanner;

public class ForNumPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = scanner.nextInt();

		System.out.print("Enter X: ");
		int x = scanner.nextInt();
		scanner.close();
		int value = 0;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(value + "\t");
				value += x;
			}
			System.out.println();
		}
	}
}
