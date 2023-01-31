package level2;

import java.util.Arrays;

public class PhoneNumList {
	public boolean solution(String[] phoneBook) {
		Arrays.sort(phoneBook);
		for (int i = 0; i < phoneBook.length - 1; i++) {
			if (phoneBook[i + 1].startsWith(phoneBook[i])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421" };
		PhoneNumList pn = new PhoneNumList();
		System.out.println(pn.solution(phone_book));
	}
}
