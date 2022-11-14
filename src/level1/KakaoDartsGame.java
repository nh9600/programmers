package level1;

public class KakaoDartsGame {
    public int solution(String dartResult) {
        int answer = 0;
        char[] chars = dartResult.toCharArray();
        for(int i =0; i<chars.length;i++) {
        	switch (chars[i]) {
			case '*':

			default:
				break;
			}
        }
        return answer;
    }

	public static void main(String[] args) {
		KakaoDartsGame kdg = new KakaoDartsGame();
		String dartResult = "1S2D*3T";
		System.out.println(kdg.solution(dartResult));
	}

}
