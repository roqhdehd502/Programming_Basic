package practiceTwo;

public class ReculsivePowerOfTwo {

	public static void main(String[] args) {
		System.out.println("2의 5승: " + PowerOfTwo(5));
		System.out.println("2의 7승: " + PowerOfTwo(7));
	}

	private static int PowerOfTwo(int n) {
		return (int) Math.pow(2, n);
	}
}