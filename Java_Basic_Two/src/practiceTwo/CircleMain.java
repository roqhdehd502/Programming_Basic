package practiceTwo;

import java.util.Scanner;

/*
 * 크기가 다른 두 원을 대조합니다.
 * 원이 겹쳐있으면 중첩, 원이 떨어져있으면 만나지않는다라고 표기
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
		
		double dis = circle.distance(x1, x2, y1, y2);
		
		if ((rad2-rad1 < dis) && (rad1+rad2 > dis)) { // 판별식
			System.out.println("두 원은 두 점에서 만납니다.(중첩)");
		} else if ((rad1 + rad2 == dis) || (rad2-rad1 == dis)) {
			System.out.println("두 원은 한 점에서 만납니다.(중첩)");
		} else if ((rad2 - rad1 > dis) || (dis == 0)) {
			System.out.println("두 원은 어떠한 점에서도 만나지 않지만 포함관계입니다.(중첩)");
		} else {
			System.out.println("두 원은 만나지 않습니다.");
		}
		
		scanner.close();
	}

	
}