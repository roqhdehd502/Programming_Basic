package practiceTwo;

public class ForMoon {

	public static void main(String[] args) {
		/*
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			System.out.println(i + " 번째 합 과정: " + sum);
		}
		System.out.println();
		System.out.println("총합 출력: " + sum);
        */
		/*
		for (int i = 1; i <= 9; i++) {
			if (((3*i) % 2) == 0) {
				System.out.println("3 x " + i + " =\t" + (3*i));
			}
		}
		*/
		int sum1 = 0; //홀
		int sum2 = 0; //짝
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				sum1 += i;
				System.out.println("홀합: " + sum1);
			} else {
				sum2 += i;
				System.out.println("짝합: " + sum2);
			}
		}
		System.out.println();
		System.out.println("홀수들의 합: " + sum1);
		System.out.println("짝수들의 합: " + sum2);
	}
}