package level2;

public class GCD {
	public int solution(int[] arr) {
		int answer = arr[0];
		for (int i = 1; i < arr.length; i++) {
			answer = (answer * arr[i]) / gcd(answer, arr[i]);
		}
		return answer;
	}

	public int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public static void main(String[] args) {
		GCD gcd = new GCD();
		int[] arr = { 2, 6, 8, 14 };
		System.out.println(gcd.solution(arr));

	}

}
