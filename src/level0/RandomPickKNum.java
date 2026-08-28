package level0;

import java.util.*;

public class RandomPickKNum {

    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];

        // answer에 몇 개를 넣었는지 확인하는 변수
        int count = 0;

        // 중복 확인용
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            // 이미 나온 숫자가 아니라면
            if (!set.contains(arr[i])) {

                set.add(arr[i]);

                // answer에 추가
                answer[count] = arr[i];

                count++;

                // k개를 다 채웠으면 종료
                if (count == k) {
                    break;
                }
            }
        }

        // k개를 다 채우지 못했다면 나머지를 -1로 채움
        for (int i = count; i < k; i++) {
            answer[i] = -1;
        }

        return answer;
    }
    
    public static void main(String[] args) {
    	for(int i=1;i<=9;i++) {
    		for(int j=1;j<=9;j++) {
    			System.out.println(i+" x "+j+" = "+ (i*j));
    		}
    	}
    }
}