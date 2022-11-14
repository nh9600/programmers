package level2;

public class NextLargeNum {
	 public int solution(int n) {
	      String nBi = Integer.toBinaryString(n); 
	      int myCount = countOne(nBi);
	      
	      for(int i = n+1; ; i++){
	          String mBi = Integer.toBinaryString(i);
	          int count = countOne(mBi); //1의 갯수가 같은지 확인
	          if(count == myCount) //1의 같이 같으면 리턴
	               return i;
	      }
	  }
	  public int countOne(String nBi){ //다음 큰 수 확인
	      char[] args = nBi.toCharArray();
	      int count = 0;
	      for(char k : args){
	          if(k == '1') count++;
	      }
	      return count;
	  }
		
	public static void main(String[] args) {
		NextLargeNum nln = new NextLargeNum();
		int n = 78;
		System.out.println(nln.solution(n));
	}

}
