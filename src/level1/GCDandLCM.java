package level1;

import java.util.Arrays;

public class GCDandLCM {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		int largeVal = 0;

		largeVal = (n < m) ? m : n;

		int i = largeVal;
		while (1 < largeVal) {
			if (n % i == 0 && m % i == 0) {
				answer[0] = i;
				answer[1] = n * m / i;
				break;
			}
			i = i - 1;
		}
		return answer;
	}

	public static void main(String[] args) {
		GCDandLCM gl = new GCDandLCM();
		int n = 2;
		int m = 5;
		System.out.println(Arrays.toString(gl.solution(n, m)));
	}

}
