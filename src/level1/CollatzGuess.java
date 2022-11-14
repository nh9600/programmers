package level1;

public class CollatzGuess {
	public int solution(int num) {
		int cnt = 0;
		long longNum = num;
		
		while (longNum != 1) {
			if (longNum % 2 == 0) {
				longNum = longNum / 2;
			} else {
				longNum = longNum * 3 + 1;
			}
			cnt++;
		}
		if (cnt >= 500) {
			return -1;
		}
		return cnt;
	}

	public static void main(String[] args) {
		CollatzGuess cg = new CollatzGuess();
		int n = 626331;
		System.out.println(cg.solution(n));
	}

}
