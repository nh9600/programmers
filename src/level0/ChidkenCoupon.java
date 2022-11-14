package level0;

public class ChidkenCoupon {
	public int solution(int chicken) {
		int answer = 0;
		int temp = 0;

		while (chicken > 0) {
			temp += chicken / 10;
			answer += temp;
			chicken += chicken % 10;	
			System.out.println(chicken);
			chicken /= 10;
		}
		return answer;
	}

	public static void main(String[] args) {
		int chicken = 1081;
		ChidkenCoupon cc = new ChidkenCoupon();
		System.out.println(cc.solution(chicken));
	}

}
