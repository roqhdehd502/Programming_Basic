package practiceTwo;

import java.util.Random;

public class Sevenseven {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(100); // 정수형 변수 num 선언 및 0~100 난수로 초기화
		
		System.out.println("임의의 정수 num은 " + num + "입니다.\n");
		
		if (num == 77) { // 판별식
			System.out.println("77이 맞습니다."); // 조건이 만족될 때 출력
		} else {
			System.out.println("77이 아닙니다."); // 조건이 만족되지 못할 때 출력
		}
		
		if (num % 2 == 0) { // 나눈것의 나머지
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
		
		if ((num > 50) && (num < 75)) { // 두 조건 모두를 만족하고자 할 때 and 연산 사용
			System.out.println("50보다 크고 75보다 작습니다.");
		} else if (num < 50) {
			System.out.println("50보다 작습니다.");
		} else {
			System.out.println("75보다 큽니다.");
		}

	}
}