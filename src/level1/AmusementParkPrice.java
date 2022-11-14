package level1;

public class AmusementParkPrice {
	public long solution(int price, int money, int count) {
		long total = 0;
		long total1 = 0;
		
		for (int i = 0; i < count; i++) {
			total += price;
			total1 += total; 
		}
		return total1 - money;
	}

	public static void main(String[] args) {
		AmusementParkPrice app = new AmusementParkPrice();
		int price = 3;
		int money = 30;
		int count = 4;
		System.out.println(app.solution(price, money, count));
	}
}
