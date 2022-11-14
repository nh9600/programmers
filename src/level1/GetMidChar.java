package level1;

public class GetMidChar {
	public String solution(String s) {
		String answer = "";
		int strLength = s.length();
		
/*		if(strLength % 2 ==0) { 
			answer= s.substring(strLength/2-1,strLength/2+1);
		}else {
			answer = s.substring(strLength/2,strLength/2+1);
		}*/
		
		return s.substring((s.length()-1)/2, s.length()/2+1);
	}

	public static void main(String[] arg) {
		GetMidChar gmc = new GetMidChar();
		String s = "abcde";
		System.out.println(gmc.solution(s));
	}
}
