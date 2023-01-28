package level2;

import java.util.Stack;

public class ProperBarket2 {
	boolean solution(String s) {
        boolean answer = true;
        Stack<String> stack = new Stack<String>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push("(");
            } else {
                if(stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return answer = (stack.empty()) ? true : false;
    }

	public static void main(String[] args) {
		ProperBarket2 pb = new ProperBarket2();
		String s = "(()(";
		System.out.println(pb.solution(s));

	}
}
