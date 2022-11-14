package level0;

public class NaturalNumSum {
    public int solution(String my_string) {
        int answer = 0;
        String temp= my_string.replaceAll("[^0-9]", "");
        return answer;
       
    }
    public static void main(String[] args) {
		NaturalNumSum nns = new NaturalNumSum();
		String my_string = "aAb1B2cC34oOp";
		System.out.println(nns.solution(my_string));
	}
	

}
