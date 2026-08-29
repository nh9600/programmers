package level0;

import java.util.Stack;

public class ArrayMake6 {

    public static Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.add(arr[i]);

            } else if (stack.peek() == arr[i]) {
                stack.pop();
            }
            
        }

        if(stack.isEmpty()) {
        	stack.add(-1);
        }
        return stack;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0};

        System.out.println(solution(arr));
    }
}