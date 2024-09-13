import java.util.Scanner;

public class WhileNumPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = scanner.nextInt();
		System.out.print("Enter X: ");
		int x = scanner.nextInt();
		int value = 0;
		int i = 1;
		scanner.close();
		while (i <= num) {
			int j = 1;
			while (j <= i) {
				System.out.print(value + "\t");
				value += x;
				j++;
			}

			System.out.println();
			i++;
		}
	}

}
