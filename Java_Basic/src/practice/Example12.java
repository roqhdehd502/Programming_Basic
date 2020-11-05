package practice;

/*
 * 다음을 출력하세요.
 * 1
 * 1 2
 * 1 2 3
 */

public class Example12 {
	public static void main(String[] args) {
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}
}