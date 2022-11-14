package level1;

import java.util.Arrays;

public class HighLowOfLotto {
	public int[] solution(int[] lottos, int[] win_nums) {
		
		int same = 0;
		int zero = 0;
		int hap = 0;

		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0) {
				zero++;
			}
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					same++;
				}
			}
		}
		hap = same + zero;
		int[] answer = {Math.min(7 - hap, 6), Math.min(7 - same, 6)};
	
		return answer;
	}

	public static void main(String[] args) {
		HighLowOfLotto lotto = new HighLowOfLotto();
		int[] lottos = { 44, 1, 0, 0, 31, 25 };
		int[] win_nums = { 31, 10, 45, 1, 6, 19 };

		System.out.println(Arrays.toString(lotto.solution(lottos, win_nums)));
	}
}
