package level0;

public class HindingNumCalculator2 {
    public static int solution(String my_string) {
        int answer = 0;
        String num = "";

        for (char ch : my_string.toCharArray()) {

            if (Character.isDigit(ch)) {
                num += ch;
            } else {
                if (!num.equals("")) {
                    answer += Integer.parseInt(num);
                    num = "";
                }
            }
        }

        // 마지막에 숫자로 끝나는 경우
        if (!num.equals("")) {
            answer += Integer.parseInt(num);
        }

        return answer;
    }
    
    public static void main(String[] args) {
    	String my_string = "aAb1B2cC34oOp";
    	System.out.println(solution(my_string));
    }
}
