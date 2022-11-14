package level0;

import java.util.Arrays;

public class TreatmentOrder {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copy = Arrays.copyOf(emergency, emergency.length);
        
        Arrays.sort(emergency);
        for(int i = 0 ; i<emergency.length ; i++ ) {
        	
        }
        return answer;
    }
    
    public static void main(String[] args) {
		TreatmentOrder to = new TreatmentOrder();
		int[] emergency	 = { 3, 76, 24};

		System.out.println(to.solution(emergency));
	}

}
