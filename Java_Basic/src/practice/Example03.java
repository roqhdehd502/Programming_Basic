package practice;

/*
 * 1~10까지의 짝수를 출력하고 그 합을 구하시오.
 * 
 * logic. 짝수는 2n의 성질을 지닌다.
 */

public class Example03 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=2; i<=10; i+=2) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("------------------");
		System.out.println("총 합계는 " + sum);
	}
}