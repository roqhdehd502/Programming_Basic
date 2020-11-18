package practiceTwo;

public class BitwiseOperator {

	public static void main(String[] args) {
		byte n1 = 13;
		byte n2 = 7;
		byte n3 = (byte)(n1 & n2);
		System.out.println(n3);
		System.out.println("--------------");
		
		byte m1 = 5;
		byte m2 = 3;
		byte m3 = -1;
		
		byte r1 = (byte)(m1 & m2);
		byte r2 = (byte)(m1 | m2);
		byte r3 = (byte)(m1 ^ m2);
		byte r4 = (byte)(~m3);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}
}