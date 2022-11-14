package level1;

import java.util.ArrayList;
import java.util.Collections;

public class StringDescending {
	public String solution(String s) {
		String answer = "";
		ArrayList<String> little = new ArrayList<String>();
		ArrayList<String> big = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			if(!Character.isUpperCase(s.charAt(i))) {
				little.add(s.substring(i,i+1));
			}else {
				big.add(s.substring(i,i+1));
			}
		}
		
		Collections.sort(little, Collections.reverseOrder());
		System.out.println(little);
		Collections.sort(big, Collections.reverseOrder());
		System.out.println(big);
		
		for(int i=0;i<little.size();i++) {
			answer += little.get(i);
		}
		for(int i=0;i<big.size();i++) {
			answer += big.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		StringDescending strD = new StringDescending();
		String s = "ZbdasdcdDASDefg";
		System.out.println(strD.solution(s));
	}

}
