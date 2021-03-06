package practiceTwo;

import java.util.Scanner;

public class BillMain {
	static private int money;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("지폐의 액수를 입력해주세요.");
			money = scanner.nextInt();
			
			Bill bill = new Bill(money);
			bill.setExchange();
			
			System.out.println("다시 시작 하시겠습니까? [Y/N]");
			char restart = scanner.next().charAt(0);
			
			if ((restart == 'Y') || (restart == 'y')) {
				continue;
			} else if ((restart == 'N') || (restart == 'n')) {
				break;
			}
			scanner.close();
		}
	}
}