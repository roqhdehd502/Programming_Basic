package practiceTwo;

import java.util.Scanner;

public class AgeMain {
	private static int nai;
	private static String name;
	private static String restart;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isCmd = true;
		
		while (isCmd) {
			System.out.println("당신의 이름을 입력해주세요.");
			name = scanner.nextLine();
			
			System.out.println("당신의 나이를 입력해주세요.");
			nai = scanner.nextInt();
			
			Age age = new Age(name, nai); // 이름, 나이 정보 받기
			age.setInfo(); // 이름 나이 정보 출력
			
			System.out.println("다시 시작하시겠습니까? [Y/N]");
			restart = scanner.nextLine(); // issue line
			
			if ((restart.equals("Y")) || (restart.equals("y"))) {
				continue;
			} else if ((restart.equals("N")) || (restart.equals("n"))) {
				break;
			}
		}
	}
}