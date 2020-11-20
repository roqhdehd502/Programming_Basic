package practiceTwo;

import java.util.Scanner;

public class AgeMain {
	private static int nai;
	private static String name;
	private static String restart;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isCmd = true;
		int a = 1;
		
		while (isCmd) {
			switch (a) {
			case 1:
				System.out.println("당신의 이름을 입력해주세요.");
				name = scanner.nextLine();
			case 2:
				System.out.println("당신의 나이를 입력해주세요.");
				nai = scanner.nextInt();
			case 3:
				Age age = new Age(name, nai); // 이름, 나이 정보 받기
				age.setInfo();
			case 4:
				System.out.println("다시 시작하시겠습니까? [Y/N]");
				System.out.print("--->");
				restart = scanner.nextLine(); // 왜 안먹는거야 ㅡㅡ
			case 5:
				if ((restart == "Y") || (restart == "y")) {
					isCmd = false;
				} else if ((restart == "N") || (restart == "n")) {
					isCmd = true;
				}
			}
			break;
		}
	}
}