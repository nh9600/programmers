package level2;

public class JadenCase {
    public String solution(String s) {
    	String answer = "";
        char[] c = s.toLowerCase().toCharArray();
        c[0] = Character.toUpperCase(c[0]);
        for(int i = 0 ; i< c.length ; i++) {
        	if(c[i] == ' ') {
        		c[i+1] = Character.toUpperCase(c[i+1]);
        	}
        	answer += c[i];
        }
        return answer;
    }

	public static void main(String[] args) {
		JadenCase jc = new JadenCase();
		String s = "3people unFollowed me";
		System.out.println(jc.solution(s));

	}

}
