package practiceTwo;

import java.util.Scanner;

public class BMI_Test {
	
	static double H = 1; // 키
	static double W = 1; // 몸무게

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in); // 입력 클래스인 scanner 호출(Call by Reference)
		
		formula(H, W); // BMI를 계산하는 formula 메소드 호출
		
		while (true) {
			System.out.println("당신의 키를 입력하세요.[m]");
			System.out.println("ex) 180");
			H = scanner.nextDouble();
			
			System.out.println("당신의 몸무게를 입력하세요.[kg]");
			System.out.println("ex) 80");
			W = scanner.nextDouble();
			
			if ((H < 3) && (W <= 0)) { // 유효성 검사 어케한다냐...
				System.out.println("올바르지 않은 입력값입니다. 다시 입력해주십시오.");
				continue;
			} else {
				System.out.println("당신의 BMI 수치는 다음과 같습니다.");
				System.out.println("BMI: " + formula(H, W));
				break;
			}
		} // main Method While
	} // main Method

	private static double formula(double height, double weight) { // BMI를 계산하는 formula 메소드 선언
		height /= 100; // m 단위로 환산
		double cal = weight/(height*height); // BMI 공식 = Weight[kg] / Height[m]^2
		return Math.round(cal*10)/10.0; // 소수 점 첫 째 자리로 반올림하여 리턴
	} // formula Method
	
} // Class
