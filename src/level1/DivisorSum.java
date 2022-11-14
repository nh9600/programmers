package level1;

public class DivisorSum {
	public int solution(int n) {
		int sum = 0; 
		for (int i = 1; i <= n; i++) {
			sum += (n % i == 0) ? i : 0;
		}
		return sum;

	}

	public static void main(String[] args) {
		DivisorSum ds = new DivisorSum();
		int n = 12;
		System.out.println(ds.solution(n));
	}

}
