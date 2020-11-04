package practice;

public class Ex19 {

	public static void main(String[] args) {
		char[] arr = new char[3];
		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
		for (int i=0; i<3; i++) { // i<arr.length;로도 범위지정 가능
			System.out.println(arr[i]);
		}
		
		char[] arr2 = new char[] {'a', 'b', 'c'};
		for (int i=0; i<3; i++) {
			System.out.println(arr2[i]);
		}
		
		char[] arr3 = {'x', 'y', 'z'}; // 권장하지 않음
		for(int i=0; i<3; i++) {
			System.out.println(arr3[i]);
		}
		
		System.out.println(arr.length); // 배열의 길이(크기) 출력
	}
}