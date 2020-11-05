package practice;

/*
 * 1~50중 4의 배수를 출력하시오.
 * 
 * logic. 4의 배수는 4n의 성질을 지닌다.
 */

public class Example05 {
	public static void main(String[] args) {
		int four = 0;
		for (int i=4; i<=50; i+=4) { // i를 4부터 4씩 증가하여 4의 배수로 반복한다.
			four = i; // 4씩 증가하는 i값을 four 변수에 담는다.
			System.out.println(four);
		}
	}
}