package level2;

public class TargetNum {
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers,target,0,0);
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int idx, int sum){
        if(idx == numbers.length){
            if(sum == target) {
            	answer++; 
            }
        }else{
        	// 더하기
            dfs(numbers, target, idx+1, sum+numbers[idx]);
            System.out.println(sum+numbers[idx]);
            // 빼기
            dfs(numbers, target, idx+1, sum-numbers[idx]);
        }   
    }
	
	
	public static void main(String[] args) {
		TargetNum tn = new TargetNum();
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		System.out.println(tn.solution(numbers, target));
	}
}
