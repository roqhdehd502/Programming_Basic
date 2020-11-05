package practice;

/* 
 * 다음을 출력하세요.
 * 1 2 3 
 * 2 3 4
 * 3 4 5
 */

public class Example09 {
	public static void main(String[] args) {
		int a = 1;
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=3; j++) {
				System.out.print(a + " ");
				a++;
			}
			a = i+1;
			System.out.println();
		}
	}
}