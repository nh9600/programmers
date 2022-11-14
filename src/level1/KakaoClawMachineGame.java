package level1;

import java.util.Stack;

public class KakaoClawMachineGame {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>(); //바구니
		for (Integer move : moves) {
			int moveIndex = move - 1; //0부터
			for (int i = 0; i < board.length; i++) {
				int k = board[i][moveIndex]; //첫줄부터 확인
				if (k == 0)
					continue;
				if (!stack.empty() && stack.peek() == k) {//비어있지 않거나 상단에 있는 값이 k와 같다면
					stack.pop();//상단 값 제거
					answer++;//삭제된 값 세기
				} else {
					stack.push(k);//아니라면 값 넣기
				}
				board[i][moveIndex] = 0;//집었던 자리는 0으로 변경
				break;//한줄 끝났으니 다음줄
			}
		}
		return answer * 2;//2개씩 터지니까 *2
	}

	public static void main(String[] args) {
		KakaoClawMachineGame kcmg = new KakaoClawMachineGame();
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		System.out.println(kcmg.solution(board, moves));
	}

}
