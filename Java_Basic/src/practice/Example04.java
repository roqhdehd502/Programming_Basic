package practice;

/*
 * 다음을 출력하시오.
 * : 1+2+3+4+...+7+8+9+10 = ?
 */

public class Example04 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}