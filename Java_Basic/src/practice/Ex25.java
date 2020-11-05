package practice;

public class Ex25 {

	public static void main(String[] args) {
		// 문자열
		String st1 = "java";
		String st2 = new String("java"); // call by reference (생성자)
		String st3 = "java";
		
		System.out.println("st1==st2: " + (st1==st2)); // false
		System.out.println("st1==st3: " + (st1==st3)); // true
		System.out.println("st2==st3: " + (st2==st3)); // false
		
		System.out.println("-----------------------");
		
		int[] arr1 = {1, 3, 5 ,7};
		int[] arr2 = {1, 3, 5 ,7};
		int[] arr3 = arr1; // call by value (얕은 복사)
		System.out.println("arr1==arr2: " + (arr1==arr2)); // false
		System.out.println("arr1==arr3: " + (arr1==arr3)); // true
		System.out.println("arr2==arr3: " + (arr2==arr3)); // false
	}
}