package practiceTwo;

public class WhileMoon {

	public static void main(String[] args) {
		/*
		// 1부터 100까지 짝수의 개수와 홀수의 개수 구하기
		int i = 1;
		int cnt1 = 0; // 홀
		int cnt2 = 0; // 짝
		while (i <= 100) {
			if (i % 2 == 1) {
				cnt1++;
			} else {
				cnt2++;
			}
			i++;
		}
		System.out.println("홀수의 개수: " + cnt1);
		System.out.println("짝수의 개수: " + cnt2);
		*/

		/*
		// 1부터 100까지 2의 배수이자 3의 배수인 개수 구하기
		int i = 1;
		int cnt = 0;
		while (i <= 100) {
			if ((i % 2 == 0) && (i % 3 == 0)) {
				cnt++;
			}
			i++;
		}
		System.out.println("2의 배수이자 3의 배수인 개수: " + cnt);
		*/
		/*
		// 2단부터 9단까지 구구단 출력
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " =\t" + i*j);
			}
		}
		*/
		/*
		// 2단부터 9단까지 짝수단만 구구단 출력
		for (int i = 2; i <= 9; i+=2) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " =\t" + i*j);
			}
		}
		*/
		/*
		// 2단부터 9단까지 결과값이 홀수인것만 구구단 출력
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if ((i*j) % 2 == 1) {
					System.out.println(i + " x " + j + " =\t" + i*j);
				}
			}
		}
		*/
		/*
		// 팩토리얼 구현
		int fac = 1;
		for (int i = 1; i <= 10; i++) {
			fac *= i;
			System.out.println("곱과정: " + fac);
		}
		System.out.println(fac);
		*/
		/*
		// 별찍기
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("★ ");
			}
			System.out.println();
		}
		*/
		/*
		// 계단식으로 별찍기
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("★ ");
			}
			System.out.println();
		}
		*/
		/*
		// 역계단식으로 별찍기
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				if (i < (j+1)) {
					System.out.print("★");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		/*
		// 오른쪽으로 정렬하여 계단식으로 별찍기
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("★");
				}
			}
			System.out.println();
		}
		*/

		// 피라미드로 별찍기
		int min = 1;
		int max = 5;
		for (int i = min; i <= max; i++) {
			for (int j = max; j >= min; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("별 ");
				}
			}
			System.out.println();
		}

	} // Main Method
} // Class