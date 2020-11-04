package practice;

public class Ex18 {

	public static void main(String[] args) {
		int[] a = new int[5]; // 배열 선언 및 초기화(배열의 크기 지정)
		
		for (int i=0; i<a.length; i++) { // 배열의 번호는 0부터 시작하니 유의할 것!
			a[i] = ((2*i)-1)+2; // 등차수열
			System.out.println("홀수 출력합니다:\t" + a[i]);
		}
	}
}