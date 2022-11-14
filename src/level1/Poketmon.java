package level1;

import java.util.Arrays;

public class Poketmon {
	public int solution(int[] nums) {
		Arrays.sort(nums);
		int temp = 0;
		int cnt = 0;
		
		for (int num : nums) {
			if (temp != num) {
				temp = num;
				cnt++;
			}
		}
		int test = nums.length / 2;

		return cnt>test ? test : cnt;

	}

	public static void main(String[] args) {
		Poketmon poketmon = new Poketmon();
		int[] nums = { 3,3,3,2,2,2};
		System.out.println(poketmon.solution(nums));
	}
}
