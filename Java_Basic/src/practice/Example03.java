package practice;

/*
 * 1~10까지의 짝수를 출력하고 그 합을 구하시오.
 * 
 * logic. 짝수는 2n의 성질을 지닌다.
 */

public class Example03 {
	public static void main(String[] args) {
		int sum = 0; // 등차급수 변수 sum 선언 및 초기화
		for(int i=2; i<=10; i+=2) { // i를 2부터 2씩 증가하여 짝수를 출력한다.
			System.out.println(i); // 반복문에 의해 짝수 출력
			sum += i; // 반복문에 의해 등차급수하기
		}
		System.out.println("------------------");
		System.out.println("총 합계는 " + sum);
	}
}