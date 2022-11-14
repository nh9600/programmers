package level1;

public class TwoSum {
	public long solution(int a, int b) {
		long answer = 0;
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		for (int i = min; i <= max; i++) {
			if(max != min) {
				answer += i;
			}else {
				return a;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int a = 3;
		int b = 3;
		System.out.println(ts.solution(a, b));
	}
}
