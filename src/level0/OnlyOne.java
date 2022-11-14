package level0;

import java.util.Arrays;

public class OnlyOne {
	public String solution(String s) {
		int cnt = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			for (int j = 0; j < s.length(); j++) {
				if (temp == s.charAt(j)) {//값 하나씩 비교 
					cnt++;
				}
			}
			if(cnt == 1) {
				sb.append(temp);
			}
			cnt = 0; //0으로 초기화
		}
		char[] cTemp = sb.toString().toCharArray();
		Arrays.sort(cTemp);//정렬 
		
		sb = new StringBuffer();//초기화 
		
		for(int i = 0 ; i < cTemp.length ; i ++) {
			sb.append(cTemp[i]);
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		OnlyOne oo = new OnlyOne();
		String s = "abdc";
		System.out.println(oo.solution(s));
	}

}
