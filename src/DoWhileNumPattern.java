import java.util.Scanner;

public class DoWhileNumPattern {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = scanner.nextInt();

		System.out.print("Enter X: ");
		int x = scanner.nextInt();
		scanner.close();

		int value = 0;
		int i = 1;

		do {
			int j = 1;
			do {
				System.out.print(value + "\t");
				value += x;
				j++;
			} while (j <= i);

			System.out.println();
			i++;
		} while (i <= num);
	}
}
