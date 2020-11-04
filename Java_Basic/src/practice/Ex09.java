package practice;

public class Ex09 {

	public static void main(String[] args) {
		System.out.println("ja" + "va"); // 문자열의 연산
		System.out.println("java" + 1.8); // 문자열과 숫자열을 더해도 나열해서 출력된다.
		String st1 = "java" + 1.8;
		System.out.println(st1);
		System.out.println(2000 + 20 + "년"); // 숫자 뒤 문자열을 놓으면 서로 연산한뒤 나열되어 출력되나
		System.out.println("year" + 2000 + 20); // 우선순위로 인해 두 숫자가 연산되지 않고 나열된다.
		System.out.println("year" + (2000 + 20)); // 괄호를 이용해서 연산 우선순위를 배정한다.
	}
}