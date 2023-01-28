package level2;

public class ProperBarket {
    boolean solution(String s) {
    	boolean answer = true;
        String[] str = s.split("");
        int left = 0;
        int right = 0;
        
        if(str[0].equals(")")){
        	return false;
        }else {
        	for(int i = 0 ; i<s.length();i++) {
        		if(str[i].equals("(")) {
        			left++;
        		}else {
        			right++;
        		}
        	}
        }
        return answer = (left==right) ? true : false;
    }
    
    public static void main(String[] args) {
		ProperBarket pb = new ProperBarket();
		String s = "(()(";
		System.out.println(pb.solution(s));
		
	}

}
