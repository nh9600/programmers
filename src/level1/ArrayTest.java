package level1;

import java.sql.Array;
import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		array[2] = 0;
		System.out.println(Arrays.toString(array));
		
	}

}
