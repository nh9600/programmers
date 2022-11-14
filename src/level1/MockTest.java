package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class MockTest {
	public int[] solution(int[] answers) {
		int[] answer = {};
		int[] first = { 1, 2, 3, 4, 5 };
		int[] second = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] shird = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int firstCnt = 0;
		int secondCnt = 0;
		int shirdCnt = 0;
		
		for(int i =0; i<answers.length; i++){
            if(first[i%first.length] == answers[i]) firstCnt++; 
            if(second[i%second.length] == answers[i]) secondCnt++;
            if(shird[i%shird.length] == answers[i]) shirdCnt++;
        }
		
		int max = Math.max(Math.max(firstCnt, secondCnt),shirdCnt); // max값 구하기
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max==firstCnt) list.add(1); //max값이랑 같으면 넣는다.
        if(max==secondCnt) list.add(2);
        if(max==shirdCnt) list.add(3);
        
        answer = new int[list.size()]; //list길이 만큼 정수 배열 생성 
        
        for(int i =0; i<answer.length; i++) { 
        	answer[i] = list.get(i);//ArrayList를 정수 배열에 삽입
        }
		
		return answer;

	}

	public static void main(String[] args) {
		MockTest mt = new MockTest();
		int[] answers = { 1, 2, 3, 4, 5 };
		int[] answers2 = {1,3,2,4,2};
		System.out.println(Arrays.toString(mt.solution(answers2)));
	}
}
