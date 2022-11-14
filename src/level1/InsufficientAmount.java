package level1;

public class InsufficientAmount {
	public long solution(int price, int money, int count) {
		long temp = 0;
		long amount = 0;
		for (int i = 0; i < count; i++) {
			temp =  temp + price;
			amount += temp; 
		}
		return (amount - money<0) ? 0 : amount-money ;
	}

	public static void main(String[] args) {
		InsufficientAmount ia = new InsufficientAmount();
		int price = 3;
		int money = 30;
		int count = 4;
		System.out.println(ia.solution(price, money, count));
	}

}
