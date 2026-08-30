package level0;

public class HindingNumCalculator {
    public static int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (c >= '0' && c <= '9') {
                answer += c - '0';
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
    	String my_string = "aAb1B2cC34oOp";
    	System.out.println(solution(my_string));
    }
}
