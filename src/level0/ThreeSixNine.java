package level0;

public class ThreeSixNine {
    public int solution(int order) {
        int answer = 0;
  
        while(order > 0) {
        	if(order%10==3 ||order%10==6 || order%10==9) {
        		answer++;
        	}
        	order = order/10; 
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
    	ThreeSixNine tsn = new ThreeSixNine();
    	int order = 29423;
    	System.out.println(tsn.solution(order));
    	
		
	}

}
