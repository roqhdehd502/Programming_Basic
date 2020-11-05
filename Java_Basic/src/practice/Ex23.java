package practice;

public class Ex23 {

	public static void main(String[] args) {
		// 문자열 -> 10진수 정수
		String msg = "12345";
		System.out.println(msg+10); // 1234510로 출력
		
		int su= Integer.parseInt(msg);
		System.out.println(su+10); // 12355로 출력
		
	}

}
