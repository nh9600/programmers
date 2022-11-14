package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length]; //3개 생성

        for(int i = 0 ; i< commands.length; i++) { //3
        	List<Integer> arrInt = new ArrayList<Integer>(); 
        	for(int j = commands[i][0]-1; j<commands[i][1]; j++) { //시작
        		System.out.println(commands[i][0]-1);
        		arrInt.add(array[j]);
        	}
        	Collections.sort(arrInt); //정렬
        	answer[i] = arrInt.get(commands[i][2]-1); //끝
        }
        return answer;
    }
    public static void main(String[] args) {
		KthNumber kn = new KthNumber();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		System.out.println(Arrays.toString(kn.solution(array, commands)));
	}
}
