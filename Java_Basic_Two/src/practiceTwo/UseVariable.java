package practiceTwo;

public class UseVariable {

	public static void main(String[] args) {
		int num1 = 15;
		//num1 = 50;
		int num2 = 20;
		
		int sum = num1 + num2;
		double avg = (double)sum / 2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println("둘의 평균은 " + avg + "입니다.");
	}
}