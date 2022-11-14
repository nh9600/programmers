package level2;

public class PhoneNumList {
	public boolean solution(String[] phoneBook) {
		for (int i = 0; i < phoneBook.length - 1; i++) {
			for (int j = i + 1; j < phoneBook.length; j++) {
				if (phoneBook[i].startsWith(phoneBook[j])) {
					return false;
				}
				if (phoneBook[j].startsWith(phoneBook[i])) {
					return false;
				}
			}
		}
		return true;

	}

	public static void main(String[] args) {
		String[] phone_book = { "119", "97674223", "1195524421" };
		PhoneNumList pn = new PhoneNumList();
		System.out.println(pn.solution(phone_book));
	}
}
