package level1;

import java.util.ArrayList;

public class TernaryFlip {
	public int solution(int n) {
		int answer = 0;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		ArrayList<Integer> temp1 = new ArrayList<Integer>();
		
		// 10진법 -> 3진법(역순)
		while (true) {
			if (n < 3) {  //n이 3보다 작으면 temp에 저장
				temp.add(n);
				break;
			}
			temp.add(n % 3); //n의 몫을 temp에 저장
			n = n / 3; //n을 3으로 나누기
		}//테스트중
		// 3진법(역순) -> 10진법
		for (int i = 0; i < temp.size(); i++) {
			//answer += (Math.pow(3, temp.size() - i - 1) * temp.get(i));
		}

		return answer;
	}
	public static void main(String[] arg ) {
		TernaryFlip tf = new TernaryFlip();
		System.out.println(tf.solution(45));
	}
}
