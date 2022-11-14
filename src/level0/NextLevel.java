package level0;

public class NextLevel {
	public int solution(int[] common) {
		int answer = 0 ; 
		if (common[1]-common[0] == common[2]-common[1]) {
			return common[common.length - 1] + common[1]-common[0];
		} else if(common[0] *2 == common[1]) {
			return common[common.length - 1] * common[1]/common[0];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		NextLevel nl = new NextLevel();
		// int[] common = { 1, 2, 3, 4 };
		int[] common = { 2, 4, 8 };
		System.out.println(nl.solution(common));
	}

}
