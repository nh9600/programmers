package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class NaturalNumReverse {
	public int[] solution(long n) {
		int[] answer = new int[(int)(Math.log10(n)+1)];

		for(int i=0;i<answer.length;i++) {
			answer[i] = (int) (n % 10);
			n = n / 10;
		}
		return answer;
	}

	public static void main(String[] args) {
		NaturalNumReverse nnr = new NaturalNumReverse();
		long n = 12345;
		System.out.println(Arrays.toString(nnr.solution(n)));
	}

}
