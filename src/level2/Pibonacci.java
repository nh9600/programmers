package level2;

public class Pibonacci {
    public int solution(int n) {
    	int[] p = new int[n + 1];
        p[0] = 0;
        p[1] = 1;
        for (int i = 2; i <= n; i++) {
            p[i] = (p[i - 1] + p[i - 2]) % 1234567;
        }
        return p[n];
    }

	public static void main(String[] args) {
		Pibonacci p = new Pibonacci();
		int n = 2;
		System.out.println(p.solution(n));

	}

}
