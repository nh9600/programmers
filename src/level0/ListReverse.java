package level0;

import java.util.Arrays;

public class ListReverse {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = num_list.length - 1, j = 0; i >= 0; i--, j++) {            
            answer[j] = num_list[i];
            }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    
    public static void main(String[] args) {
		ListReverse lr = new ListReverse();
		//int[] num_list = {1, 2, 3, 4, 5};
		int[] num_list = {1, 1, 1, 1, 1, 2};
		System.out.println(lr.solution(num_list));
	}
	

}
