package level1;

public class PrimeNum {
    public int solution(int n) {
        int cnt = 0;
        for(int i=2;i<=n;i++) {
        	for(int j=1;j<i;j++) {
        		if(i/j==0) {
        			cnt++;
        		}
        	}
        }
        return cnt;
    }

	public static void main(String[] args) {
		PrimeNum pn = new PrimeNum();
		int n = 10;
		System.out.println(pn.solution(n));
	}

}
