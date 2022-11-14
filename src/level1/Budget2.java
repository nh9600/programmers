package level1;

import java.util.Arrays;

public class Budget2 {
	public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);

		for (int i = 0; i < d.length; i++) {
			budget -= d[i];
			if (budget < 0) {
				break;
			}
			answer++;
		}
		return answer;

	}

	public static void main(String[] args) {
		Budget2 bd = new Budget2();
		int[] d = { 1, 3, 2, 5, 4 };
		int budget = 9;
		System.out.println(bd.solution(d, budget));
	}

}
