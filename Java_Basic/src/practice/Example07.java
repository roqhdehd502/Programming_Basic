package practice;

/*
 * 다음을 출력하세요.
 * ★ ★ ★
 * ★ ★ ★
 * ★ ★ ★
 */

public class Example07 {
	public static void main(String[] args) {
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print("★ ");
			}
			System.out.println();
		}
	}
}