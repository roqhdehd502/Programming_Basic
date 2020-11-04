package practice;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("switch문 실행합니다.");
		int su1 = 1;
		
		// switch문(분기 조건)
		switch (su1) { // 초기 조건식
		case 3: // 분기문(숫자로 기입할 것)
			System.out.println("3 입니다.");
			break;
		case 2:
			System.out.println("2 입니다");
			break;
		case 1:
			System.out.println("1 입니다.");
			break;
		default: // 선택사항
			System.out.println("1~3 사이값이 아닙니다.");
			break;
		}
		
		System.out.println("switch문 실행완료합니다.");
	}

}
