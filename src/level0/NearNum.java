package level0;

import java.util.Arrays;

public class NearNum {
	
    public int solution(int[] array, int n) {
        int answer = 0;
        Arrays.sort(array);
        for(int i = 1 ; i < array.length ; i++){
            if(Math.abs(n-array[0]) > Math.abs(n-array[i])){//근삿값 찾기 
                array[0] = array[i];
            }
        }
        answer = array[0];
        return answer;
    }
    
    public static void main(String[] args) {
		NearNum nn = new NearNum();
		int[] array = { 3, 10, 28 };
		int n = 20; 
		System.out.println(nn.solution(array, n));
		
	}

}
