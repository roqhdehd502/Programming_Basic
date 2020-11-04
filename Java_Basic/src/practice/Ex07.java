package practice;

public class Ex07 {

	public static void main(String[] args) {
		byte su1;
		su1 = 100;
		su1 += 1; // su1 + 1는 안된다...(su1은 byte, 1은 int)
		System.out.println(su1++);
		System.out.println(su1);
	}
}