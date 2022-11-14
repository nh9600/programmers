package level0;

import java.util.ArrayList;

public class Fraction {
	public static void main(String[] args) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int num1 = 2;
		int num2 = 4;
		int denum1 = 1;
		int denum2 = 3;
		
		//분자
		int topNum = num1 * denum2 + num2 * denum1;
		//분모
		int botNum = num1 * num2;
		//최대공배수
		int maxNum = 0;
		//약분
		for (int i = 1; i <= topNum; i++) {
			if (topNum % i == 0 && botNum % i == 0) {
				maxNum = i;
			}
		}
		answer.add(topNum/maxNum);
		answer.add(botNum/maxNum);
		
		answer.toArray();
		System.out.println(answer.toString());
	}

}
