import java.util.Scanner;

public class DoWhileThreePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int num = sc.nextInt();

		System.out.print("Enter X: ");
		int x = sc.nextInt();
		sc.close();
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
