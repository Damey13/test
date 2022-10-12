
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfDiagonal {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> Arr = new ArrayList<ArrayList<Integer>>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the matrix");
		int size = input.nextInt();
		System.out.println("Enter the elements of the matrix");
		for (int i = 0; i < size; i++) {
			Arr.add(new ArrayList<Integer>());

			for (int j = 0; j < size; j++) {
				Arr.get(i).add(input.nextInt());
			}
		}
		int temp = 0;
		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size; j++) {
				if (j == i || j == size - i - 1) {
					temp = temp + Arr.get(i).get(j);
				}
			}
		}

		System.out.println(temp);
		input.close();

	}

}
