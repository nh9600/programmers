package level1;

public class NumericStringEnglishWords {
	    public int solution(String s) {

	    //String[]  num= {"0","1","2","3","4","5","6","7","8","9"};
	    String[] word= {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
	        for (int i = 0 ; i <10 ; i++){
	            s = s.replaceAll(word[i] , Integer.toString(i)); //영어자리를 숫자로 교체
	        }
	        return Integer.parseInt(s);
	    }
	
	public static void main(String[] args) {
		NumericStringEnglishWords nsew = new NumericStringEnglishWords();
		String eng = "one4seveneight";
		System.out.println(nsew.solution(eng));
	}
}
