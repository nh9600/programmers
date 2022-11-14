package level0;

import java.util.Arrays;

public class Max2 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        
        return Math.max(numbers[0]*numbers[1], numbers[numbers.length-1]*numbers[numbers.length-2]);
    }
    public static void main(String[] args) {
    	Max2 m = new Max2();
    	int[] numbers = {1, 2, -3, 4, -5};
    	System.out.println(m.solution(numbers));
	}

}
