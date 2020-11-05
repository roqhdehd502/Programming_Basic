package practice;

/*
 * 구구단을 출력하세요.
 * 2x1=2  3x1=3  4x1=4 ...  9x1=9
 * 2x2=4  3x2=6  4x2=8 ...  9x2=18
 * ...
 * 2x9=18 3x9=27 4x9=36 ... 9x9=81
 */

public class Example13 {
	public static void main(String[] args) {
		for (int i= 1; i<=9; i++) {
			for (int j = 2; j<=9; j++) {
				System.out.print(j + " x " + i + " =\t" + (j*i)+ "\t");
			}
			System.out.println("");
		}
	}
}