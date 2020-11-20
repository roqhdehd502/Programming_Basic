package practiceTwo;

public class Bill {
	private int money;
	
	public Bill(int money) {
		this.money = money;
	}
	
	private void getExchange() {
		int oman = 0;
		int man = 0;
		int ochun = 0;
		int chun = 0;
		int etc = 0;
		
		oman = money / 50000;
		man = money % 50000 / 10000;
		ochun = money % 50000 % 10000 / 5000;
		chun = money % 50000 % 10000 % 5000 / 1000;
		etc = money % 50000 % 10000 % 5000 % 1000;
		
		System.out.println();
		System.out.println("환전결과는 다음과 같습니다.");
		System.out.println("-------------------");
		System.out.println("오만원 : " + oman + "장");
		System.out.println("일만원 : " + man + "장");
		System.out.println("오천원 : " + ochun + "장");
	    System.out.println("일천원 : " + chun + "장");
	    System.out.println("잔 돈 : " + etc + "원");
	}
	
	public void setExchange() {
		getExchange();
	}
}