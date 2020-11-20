package practiceTwo;

import java.util.Scanner;

public class RockScissorPaperMain {
	public static String what;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("가위바위보 중 하나를 내세요.");
			System.out.println("ex) 가위");
			what = scanner.next();
			
			RockScissorPaper rsp = new RockScissorPaper(what);
			rsp.setResult();
			
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