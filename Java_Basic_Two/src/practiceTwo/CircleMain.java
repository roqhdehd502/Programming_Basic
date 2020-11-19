package practiceTwo;

import java.util.Scanner;

/*
 * 위치와 크기가 서로 다른 두 원을 대조합니다.
 * '원이 만나거나 겹치면 중첩, 그 외엔 만나지않는다' 라고 표기
 */

public class CircleMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle circle = new Circle();
		
		System.out.println("원 1의 x좌표를 기입하세요.");
		double x1 = scanner.nextDouble();
		System.out.println("원 1의 y좌표를 기입하세요.");
		double y1 = scanner.nextDouble();
		System.out.println("원 1의 반지름을 기입하세요.");
		double rad1 = scanner.nextDouble();
		
		System.out.println("원 2의 x좌표를 기입하세요.");
		double x2 = scanner.nextDouble();
		System.out.println("원 2의 y좌표를 기입하세요.");
		double y2 = scanner.nextDouble();
		System.out.println("원 2의 반지름을 기입하세요.");
		double rad2 = scanner.nextDouble();
		
		circle.getPosition(x1, x2, y1, y2, rad1, rad2);
		circle.setCir();
		
		scanner.close();
	}
}