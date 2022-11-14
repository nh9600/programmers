package level0;

public class FindNum {
    public int solution(int num, int k) {
        int answer = 0;
        String tempNum = Integer.toString(num);
        String tempK = Integer.toString(k);
        if(tempNum.indexOf(tempK)!=-1) {
        	return tempNum.indexOf(tempK)+1;
        }else {
        	return tempNum.indexOf(tempK);
        }
    }
    
    public static void main(String[] args) {
		FindNum fn = new FindNum();
		int num = 29183; 
		int k = 1;
		System.out.println(fn.solution(num, k));
	}
}
