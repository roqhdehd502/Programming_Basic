package practice;

/*
 * 다음을 출력하세요.
 * ★
 * ★ ★
 * ★ ★ ★
 */

public class Example10 {
	public static void main(String[] args) {
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("★ ");
			}
			System.out.println("");
		}
	}
}