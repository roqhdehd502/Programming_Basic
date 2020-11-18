package practiceTwo;

public class PrimeNumber {
	final static int N = 50; // 지정값
	
	public static void main(String[] args) {
		isPrimeNumber(N);
	}

	private static void isPrimeNumber(int num) {
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}
}