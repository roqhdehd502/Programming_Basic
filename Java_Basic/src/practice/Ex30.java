package practice;

public class Ex30 {

	public static void main(String[] args) {
		String st1 = "java"; // String 문자열을 통해 "java"로 초기화
		String st2 = new String("java"); // 생성자 new를 통해 "java"로 초기화(st1과 동일)
		String st3 = "Programming";
		String st4 = st1 + st3; // st1과 st3 문자열 조합
		String st5 = st1.concat(st3); // concat() 문자열 조합 함수를 통해 st1과 st3 문자열 조합
		
		System.out.println("st1: " + st1); // java
		System.out.println("st2: " + st2); // java
		System.out.println("st3: " + st3); // Programming
		System.out.println("st4: " + st4); // javaProgrammming
		System.out.println("st5: " + st5); // javaProngramming
		System.out.println("--------------------------------");
		
		char ch = st5.charAt(2); // st5의 세 번째 문자를 분리
		System.out.println("ch: " + ch); // v
	}
}