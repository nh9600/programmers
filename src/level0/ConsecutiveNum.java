package level0;

public class ConsecutiveNum {
    public int[] solution(int num, int total) {
    	int[] answer = new int[num];
		int temp = 0;
		int sum = 0;
    	while(true) {
    		for(int i = 0 ; i<num ; i++) {	
    			answer[i] = temp; 
    			System.out.println(answer[i]);
    			sum += temp;
    			temp++;
    		}
    		if(sum==total) {
    			break;
    		}
    	}
    	return answer;
    }
    
    public static void main(String[] args) {
    	ConsecutiveNum cn = new ConsecutiveNum();
    	int num = 3; 
    	int total = 12;
    	System.out.println(cn.solution(num, total));
		
	}

}
