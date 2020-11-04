package practice;

public class Ex21 {
	public static void main(String[] args) { // 그래서 강사이름이
		int[] arr1 = {1, 3, 5, 7};
		
		int[] arr2 = {1, 3, 5, 7};
		int[] arr3 = arr2; // 배열의 얕은복사
		arr3[0] = 0; // 서로 다른 이름의 배열명으로 선언했지만 요소를 같은 한 곳을 참조하기 때문에 대입하면 서로 영향이 생긴다.
		
		int[] arr4 = new int[4];
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
		System.out.println("---------------------------");
		
		for(int i=0; i<arr1.length; i++) { // 얕은 복사 확인 (arr2[0] == arr3[0])
			System.out.println(arr2[i]);
		}
		System.out.println("---------------------------");
		
		for (int i=0; i < arr1.length; i++) { // 배열의 깊은 복사
			arr4[i] = arr1[i];
		}
		arr4[0] = 10; // 해당 객체와 인스턴스 변수까지 복사했으므로 서로 독립적인 배열이 된다.
		System.out.println(arr1[0]); // arr4[0] != arr1[0]
	}
}