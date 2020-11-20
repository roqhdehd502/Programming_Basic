package practiceTwo;

public class Bill {
	private int money;
	private int oman = 0;
	private int man = 0;
	private int ochun = 0;
	private int chun = 0;
	private int coin = 0;
	
	public Bill(int money) {
		this.money = money;
	}
	
	private void getOman() {
		for (int i = 50000; i > money; i+=50000) {
			if ((money % i) > 50000) {
				oman++;
			}
		}
	}
	
	private void getMan() {
		getOman();
		
		for (int j = 10000; j > money; j+=10000) {
			if ((money % j) > 10000) {
				man++;
			}
		}
	}
	
	private void getOchun() {
		getMan();
		
		for (int k = 5000; k > money; k+=5000) {
			if ((money % k) > 5000) {
				ochun++;
			}
		}
	}
	
	private void getChun() {
		getOchun();
		
		for (int l = 1000; l > money; l+=1000) {
			if ((money % l) > 1000) {
				chun++;
			} else {
				coin = money;
			}
		}
	}
	
	private void getExchange() {
		getOman();
		getMan();
		getOchun();
		getChun();
		
		System.out.println();
		System.out.println("환전결과는 다음과 같습니다.");
		System.out.println("-------------------");
		System.out.println("5만원 권: " + oman + "장");
		System.out.println("1만원 권: " + man + "장");
		System.out.println("5천원 권: " + ochun + "장");
		System.out.println("1천원 권: " + chun + "장");
		System.out.println("잔돈: " + coin + "원");
	}
	
	public void setExchange() {
		getExchange();
	}
}