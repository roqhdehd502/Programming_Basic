package practice;

/*
 * 다음의 합을 구하시오.
 * : 1/2 + 2/3 + 3/4 + 4/5 + ... + 9998/9999 + 9999/10000 = ?
 * 
 * logic. 본 수열은 다음과 같은 규칙을 지닌다.
 * : 1/2 + 2/3 + ... + n/(n+1) + ... + 9998/9999 + 9999/10000 = ?
 */

public class Example06 {
	public static void main(String[] args) {
		double sum = 0;
		double i = 1;
		
		while (i<10000) {
			sum += (i/(i+1));
			i++;
		}
		System.out.println("답: " + sum);
		/*
		for (double i=1; i<10000; i++) {
			sum += (i/(i+1));
		}
		System.out.println(sum);
		*/
	}
}