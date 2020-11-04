package practice;

public class Ex15 {

	public static void main(String[] args) {
		int su = 1; // su 변수 선언 및 초기화
		
		// while문
		while (su<=9) { // 조건(Bool 연산), true가 될 동안 반복
			System.out.println("7 * " + su + " =\t" + 7*su++);
			//break; // 무한루프에 조심하자...
		}
	}
}