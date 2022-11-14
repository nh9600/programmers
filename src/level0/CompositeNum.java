package level0;

public class CompositeNum {
    public int solution(int n) {

        if(n%2==0) {
        	return n/2;
        }else {
        	return (n/2)+1;
        }
    }
    public static void main(String[] args) {
		CompositeNum cn = new CompositeNum();
		int n = 15;
		System.out.println(cn.solution(n));
	}

}
