import java.util.Scanner;

public class TwoPyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = input.nextInt();

		int star = 1;
		int space = n - 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
			star = star + 2;
			space = space - 1;
		}
		n = n - 1;
		int newstar = star - 4;
		int newspace = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= newspace; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= newstar; j++) {
				System.out.print("*");
			}
			System.out.println();
			newstar = newstar - 2;
			newspace = newspace + 1;
		}
		input.close();
	}
}