package level1;

public class PhoneNumHide {
	public String solution(String phone_number) {
        String answer = "";
        
        int len = phone_number.length()-4;
        for(int i=0;i<len;i++) { answer += "*"; }
        String str = phone_number.substring(phone_number.length()-4,phone_number.length());

        return answer += str;
    }

	public static void main(String[] args) {
		PhoneNumHide pnh = new PhoneNumHide();
		String phone_number = "01033334444";
		System.out.println(pnh.solution(phone_number));
	}

}
