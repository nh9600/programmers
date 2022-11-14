package level1;

import java.util.Arrays;

public class Budget {
	public int solution(int[] d, int budget) {
		int answer = 0;
		int sum = 0;
		Arrays.sort(d);
		
		for (int i = 0; i < d.length; i++) {
			if (sum + d[i] > budget) {
				break;
			}else {
				sum += d[i];
				answer++;
			}	
		}
		return answer;

	}

	public static void main(String[] args) {
		Budget bd = new Budget();
		int[] d = { 1, 3, 2, 5, 4 };
		int budget = 9;
		System.out.println(bd.solution(d, budget));
	}

}
