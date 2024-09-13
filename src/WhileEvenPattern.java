import java.util.Scanner;

public class WhileEvenPattern {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();

		System.out.print("Enter X: ");
		int x = sc.nextInt();
		sc.close();
		int value = 0;
		int i = 1;
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
