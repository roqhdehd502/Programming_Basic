package practiceTwo;

import java.util.Scanner;

public class GradeMain {
	private static int kor, eng, math;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("본 프로그램은 당신의 평균 성적을 계산하는 프로그램 입니다.");
		System.out.println();
		System.out.println("당신의 국어 성적을 기입하세요.");
		kor = scanner.nextInt();
		System.out.println("당신의 영어 성적을 기입하세요.");
		eng = scanner.nextInt();
		System.out.println("당신의 수학 성적을 기입하세요.");
		math = scanner.nextInt();
		
		Grade grade = new Grade(kor, eng, math); // 국, 영, 수
		grade.setGrade(); // 평균 성적 출력
		
		System.out.println("프로그램이 종료되었습니다.");
		scanner.close();
	}
}