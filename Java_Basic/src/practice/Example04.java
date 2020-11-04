package practice;

/*
 * 다음을 출력하시오.
 * : 1+2+3+4+...+7+8+9+10 = ?
 */

public class Example04 {
	public static void main(String[] args) {
		int sum = 0; // 등차급수 변수 sum 선언 및 초기화
		for(int i=1; i<=10; i++) { // i를 1부터 시작하여 10까지 등차급수를 한다.
			sum += i; // 반복문에 의해 등차급수하기
		}
		System.out.println(sum);
	}
}