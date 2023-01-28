package level2;

public class ExpressionOfNum {
	public int solution(int n) {
		int answer = 0;
		int m = 1;
		while(n>0) {
			if(n%m==0) {
				answer+=1;
			}
			n-=m;
			m+=1;
		}
		return answer;
	}

	public static void main(String[] args) {
		ExpressionOfNum en = new ExpressionOfNum();
		int n = 15;
		System.out.println(en.solution(n));
	}

}
