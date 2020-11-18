package practiceTwo;

public class SimpleOperation {

	public static void main(String[] args) {
		//simpleOpr(7, 3);
		//abs(7, 3);
		//starPrint(7);
		double r = 2.4; // 반지름 r값 선언 및 초기화
		System.out.println("원 둘레(" + r + "): " + Math.round(calCircleRound(r)*10000)/10000.0); // 소수점 4자리 수까지 출력
		System.out.println("원 면적(" + r + "): " + Math.round(calCircleArea(r)*10000)/10000.0);
	}
	
	private static double calCircleRound(double a) { // 원 둘레
		return 2*Math.PI*a;
	}
	
	private static double calCircleArea(double a) { // 원 면적
		return Math.PI*(a*a);
	}
	/*
	private static void starPrint(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("별 ");
			}
			System.out.println();
		}
	}
	*/
	/*
	private static void abs(int n, int m) {
		System.out.println(Math.abs(n - m));
	}
	*/
	/*
	private static void simpleOpr(int n, int m) {
		System.out.println("덧셈 결과: " + (n + m));
		System.out.println("뺄셈 결과: " + (n - m));
		System.out.println("곱셈 결과: " + (n * m));
		System.out.println("나눗셈 결과: " + (n / m));
		System.out.println("나눗셈의 나머지: " + (n % m));
	}
	*/

}
