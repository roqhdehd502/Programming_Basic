package practice;

public class Ex35 {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i+1;
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}
		System.out.println("------------------");
		System.out.println("그래서 arr1의 0번째 배열은 뭔데: " + arr1[0]);
	}
}