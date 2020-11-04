package practice;

public class Ex14 {
	public static void main(String[] args) {
		// 7단만 출력
		System.out.println("구구단 7단을 출력합니다.");
		System.out.println("-------------------");
		
		for(int i=1; i<=9; i++) {
			System.out.println("7 * " + i + " =\t" + 7*i);
		}
		
		System.out.println("-------------------");
		System.out.println("7단 출력이 완료되었습니다.");
		/*
		 * 2단부터 9단까지 출력
		System.out.println("구구단을 2단부터 9단까지 출력합니다.");
		System.out.println("----------------------------");
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " =\t" + i*j);
			}
			System.out.println("----------------------");
		}
		
		System.out.println("구구단 출력이 완료되었습니다.");
		*/
	}
}