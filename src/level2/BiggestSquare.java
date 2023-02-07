package level2;

public class BiggestSquare {
	
    public int solution(int [][]board)
    {
      int answer = 0;
      int height = board.length; 
      int width = board[0].length;
      int[][] map = new int[height + 1][width + 1];
 
 	// 배열 복사
    for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
        	//System.out.println(board[i][j]);
            map[i + 1][j + 1] = board[i][j];
            //System.out.println(map[i + 1][j + 1]);
        }
    }
 
    for (int i = 1; i <= height; i++) {
        for (int j = 1; j <= width; j++) {
            if (map[i][j] != 0) { // 1이상 
            	
            	//, 위쪽(↑), 왼쪽(←), 왼쪽상단(↖︎)의 최솟값 구한 후, 자신의 위치에서 +1
                map[i][j] = Math.min(Math.min(map[i - 1][j], map[i][j - 1]), map[i - 1][j - 1]) + 1;
                System.out.println(map[i][j]);
                answer = Math.max(answer, map[i][j]); // 최대값 갱신
            }
        }
    }
 
    //정사각형 넓이
    return answer * answer;
    }

	public static void main(String[] args) {
		BiggestSquare bs = new BiggestSquare();
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		System.out.println(bs.solution(board));

	}

}
