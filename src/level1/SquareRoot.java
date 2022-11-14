package level1;

public class SquareRoot {
	public long solution(long n) {
		long answer = 0;
		double base = Math.sqrt(n);
		if (base % 1 > 0) {
			answer = -1;
		} else
			answer = (long) Math.pow(base + 1, 2);
		return answer;
	}

	public static void main(String[] args) {
		SquareRoot sr = new SquareRoot();
		long n = 16;
		System.out.println(sr.solution(n));
	}

}
