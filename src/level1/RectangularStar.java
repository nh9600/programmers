package level1;

import java.util.Scanner;

public class RectangularStar {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		StringBuilder sb = new StringBuilder();

/*
		IntStream.range(0, a).forEach(s -> sb.append("*")); //5
		IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
*/

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
