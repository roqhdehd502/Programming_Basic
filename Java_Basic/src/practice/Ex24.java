package practice;

import java.util.Random;

public class Ex24 {

	public static void main(String[] args) {
		// 난수발생
		Random random = new Random();
		
		int a = 0;
		
		for (int i=0; i<=100; i++) {
			a = random.nextInt(10);
			System.out.println(a);
		}	
	}
}