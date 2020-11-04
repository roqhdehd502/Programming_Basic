package practice;

/*
 * 1~50중 4의 배수를 출력하시오.
 * 
 * logic. 4의 배수는 4n의 성질을 지닌다.
 */

public class Example05 {
	public static void main(String[] args) {
		int four = 0;
		for (int i = 4; i <= 50; i+=4) {
			four = i;
			System.out.println(four);
		}
	}
}