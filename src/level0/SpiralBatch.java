package level0;

import java.util.Arrays;

public class SpiralBatch {
    public static int[][] solution(int n) {
    	
        int[][] answer = new int[n][n];
        int num = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;//경계값

        while (top <= bottom && left <= right) {
            // 위쪽 줄: 왼쪽 -> 오른쪽
            for (int i = left; i <= right; i++) answer[top][i] = num++;
            top++;

            // 오른쪽 줄: 위 -> 아래
            for (int i = top; i <= bottom; i++) answer[i][right] = num++;
            right--;

            // 아래쪽 줄: 오른쪽 -> 왼쪽
            for (int i = right; i >= left; i--) answer[bottom][i] = num++;
            bottom--;

            // 왼쪽 줄: 아래 -> 위
            for (int i = bottom; i >= top; i--) answer[i][left] = num++;
            left++;
        }

        return answer;
    }
    
    public static void main(String[] args) {
        System.out.println(
                Arrays.deepToString(solution(5))
            );
    }
}
