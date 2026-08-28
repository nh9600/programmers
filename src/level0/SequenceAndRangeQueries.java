package level0;

import java.util.Arrays;

public class SequenceAndRangeQueries {
	public static int[] solution(int[] arr, int[][] queries) {
	    int[] answer = new int[queries.length];

	    for (int i = 0; i < queries.length; i++) {
	        int s = queries[i][0];
	        int e = queries[i][1];
	        int k = queries[i][2];
	        
	        int min = Integer.MAX_VALUE;

	        for (int j = s; j <= e; j++) {

	            if (arr[j] > k && arr[j] < min) {
	                min = arr[j];
	            }

	        }
	        
	        if (min == Integer.MAX_VALUE) {
	            answer[i] = -1;
	        } else {
	            answer[i] = min;
	        }
	    }
	    return answer;
	}
    
    public static void main(String[] args) {
    	int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
    	int[] arr = {0, 1, 2, 4, 3};
    	System.out.println(Arrays.toString(solution(arr, queries)));
    }
}
