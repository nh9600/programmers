package level1;

public class PressKeypad {
	public String solution(int[] numbers, String hand) {
		StringBuilder sb = new StringBuilder();
		int leftIndex = 10; // '*' => 10으로 치환
		int rightIndex = 12; // '#' => 12로 치환

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				sb.append("L");
				leftIndex = numbers[i];//왼손 위치를 저장	
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {	
				sb.append("R");
				rightIndex = numbers[i];//오른손 위치를 저장
			} else { // Center
				//int leftLength = getLength(leftIndex, numbers[i]); 
				//int rightLength = getLength(rightIndex, numbers[i]);
				int x = leftIndex - numbers[i];
				int y = rightIndex - numbers[i];
				System.out.println(x);
				System.out.println(y);
				if(x < 0 && y < 0 ) {
					if(x > y) {
						sb.append("L");
					}else if(x < y) {
						sb.append("R");
						}else {
							if(hand.equals("right")) {
								sb.append("R");
							}else {
								sb.append("L");
					}
				}
			}else {
				if(x > y) {
					sb.append("R");
				}else if(x < y) {
					sb.append("L");
				}else {
					if(hand.equals("right")) {
						sb.append("R");
					}else {
						sb.append("L");
				}
				}
			}}
		}
			return sb.toString();

		
	}

	public static void main(String[] args) {
		int[] number = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		PressKeypad cf = new PressKeypad();
		System.out.println(cf.solution(number, "right"));
	}

}
