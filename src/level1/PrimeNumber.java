package level1;

public class PrimeNumber {
	public int solution(int[] nums) {
		int answer = 0;
		int hap = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					hap = nums[i] + nums[j] + nums[k];
					if(isAnswer(hap)) {
						answer++;
					}
				}
			}
		}
		return answer;
	}

	public boolean isAnswer(int num) {
		for (int i = 2; i < num; i++) { 
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		PrimeNumber pm = new PrimeNumber();
		int[] nums = { 1, 2, 3, 4 };

		System.out.println(pm.solution(nums));

	}
}
