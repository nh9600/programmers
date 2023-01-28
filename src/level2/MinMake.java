package level2;

import java.util.Arrays;

public class MinMake {
	public int solution(int[] A, int[] B) {
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		int b = B.length-1;

		for (int i = 0; i < B.length; i++) {
			answer += A[i] * B[b];
			b--;
		}
		return answer;
	}

	public static void main(String[] args) {
		MinMake mm = new MinMake();
		int[] A = { 1, 4, 2 };
		int[] B = { 5, 4, 4 };
		System.out.println(mm.solution(A, B));
	}
}
