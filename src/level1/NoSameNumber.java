package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class NoSameNumber {
	public int[] solution(int[] arr) {
		int[] answer = {};
		int temp = -1; //나올 수 없는 값 
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (temp != arr[i]) {  
				temp = arr[i]; //일단 첫 번째 번호는 삽입하고 비교
				list.add(temp); 
			}
		}
		
		answer = new int[list.size()]; 
		for (int i = 0; i < list.size(); i++) { //ArrayList 값을Array 에 삽입 
			answer[i] = list.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		NoSameNumber mt = new NoSameNumber();
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		int[] arr2 = { 4, 4, 4, 3, 3 };
		System.out.println(Arrays.toString(mt.solution(arr2)));
	}
}
