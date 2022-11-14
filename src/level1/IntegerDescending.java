package level1;

import java.util.Arrays;

public class IntegerDescending {
	public long solution(long n) {
		String num = String.valueOf(n); 
		String strNum = "";
		char[] arr = new char[num.length()]; //한글자씩  char[]에 넣기
		for (int i = 0; i < num.length(); i++) {
			arr[i] += num.charAt(i);
		}
		Arrays.sort(arr); // 정렬
		
		for (int i = arr.length - 1; i >= 0; i--) { //내림차순 시작
			strNum += arr[i];
		}
		long answer = Long.parseLong(strNum); //Long으로 형변환
		return answer;

	}

	public static void main(String[] args) {
		IntegerDescending id = new IntegerDescending();
		int n = 118372;
		System.out.println(id.solution(n));

	}
}
