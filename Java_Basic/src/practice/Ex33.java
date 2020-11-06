package practice;

public class Ex33 {
	static int a = 1234; // 전역 변수

	// 메소드
	public static void main(String[] args) { // 메소드(메인)
		Ex33 me = new Ex33();
		
		System.out.println(a); // 전역변수 출력
		func01(); // 메소드를 호출
		
		int c = func02(); // 메소드를 호출
		System.out.println(c); // 호출한 메소드를 통해 출력
		
		System.out.println(me);
	}
	
	private static int func02() {
		int b = 10;
		return b;
	}

	private static void func01() { // 메소드(참조)
		System.out.println("첫 번째 출력");
	}
}