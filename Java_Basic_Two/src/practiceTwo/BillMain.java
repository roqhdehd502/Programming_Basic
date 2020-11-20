package practiceTwo;

import java.util.Scanner;

public class BillMain {
	static private int money;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("지폐의 액수를 입력해주세요.");
		money = scanner.nextInt();
		
		Bill bill = new Bill(money);
		bill.setExchange();
		
		scanner.close();
	}
}