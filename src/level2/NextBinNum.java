package level2;

public class NextBinNum {
    public int solution(int n) {
        int answer = 0;
        int nextN = Integer.bitCount(n);
        int nextBn = 0;
        
        while(true) {
        	n++;
        	nextBn = Integer.bitCount(n);
        	if(nextN == nextBn) {
        		return answer = n;
        	}
        }
    }
    
	public static void main(String[] args) {
		NextBinNum nbn = new NextBinNum();
		int n = 78;
		System.out.println(nbn.solution(n));
	}
}
