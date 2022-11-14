package level0;

public class CountOfSeven {

	public int solution(int[] array) {
		int answer = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
		}
		
		for(int i = 0 ; i< sb.length();i++) {
			if(sb.toString().charAt(i)=='7') {
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		CountOfSeven cs = new CountOfSeven();
		int[] array = { 7, 77, 17 };
		System.out.println(cs.solution(array));

	}

}
