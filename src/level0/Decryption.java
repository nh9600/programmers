package level0;

public class Decryption {
    public String solution(String cipher, int code) {
        String answer = "";
        int chipherLength = cipher.length();
        while(chipherLength > 0) {
        	answer = cipher.substring(code);
        	break;
        }
        return answer;
    }
    
    public static void main(String[] args) {
    	Decryption d = new Decryption();
    	
    	String cipher = "dfjardstddetckdaccccdegk";
    	int code = 4; 
    	System.out.println(d.solution(cipher, code));
	}

}
