package practiceTwo;

public class IfReit {

	public static void main(String[] args) {
		int num = 120;
		int n1 = 5;
		int n2 = 7;
		
		if ((num > 0) && ((num % 2) == 0)) { // 조건문 연산
			System.out.println("양수이면서 짝수"); // 조건에 만족할 시 내부 로직 실행
		}
		
		if (n1 == n2) {
			System.out.println("n1 == n2 is true");
		} else { // if 조건문에 만족하지 못할시 실행
			System.out.println("n1 == n2 is false");
		}
		System.out.println("--------------");
		
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		System.out.println("--------------");
		/*
		if (num % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}
		*/
		
		if ((num % 2 == 0) && (num % 3 == 0)) {
			System.out.println("2의 배수이자, 3의 배수입니다.");
		}
		System.out.println("--------------");
	}
}