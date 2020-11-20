package practiceTwo;

import java.util.Scanner;

public class AgeMain {
	private static int nai;
	private static String name;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("당신의 이름을 입력해주세요.");
			name = scanner.next();
			
			System.out.println("당신의 나이를 입력해주세요.");
			nai = scanner.nextInt();
			
			Age age = new Age(name, nai); // 이름, 나이 정보 받기
			age.setInfo(); // 이름 나이 정보 출력
			
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