package practice;

public class Ex27 {

	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = new String("ABCD"); // call by reference
		byte[] arr1 = {65, 66, 67, 68};
		String str3 = new String(arr1); // call by reference
		char[] arr2 = {'A', 'B', 'C', 'D'};
		String str4 = new String(arr2); // call by reference
		
		System.out.println(str1); // ABCD
		System.out.println(str2); // ABCD
		for (int i=0; i < arr1.length; i++) {
			System.out.println(arr1[i]); // 65 66 67 68
		}
		System.out.println(arr2); // ABCD
		System.out.println(str3); // ABCD
		System.out.println(str4); // ABCD
		System.out.println("------------------");
		/*
		String arg = new String(str1);
		arg = "abcd";
		System.out.println(str1); // ABCD
		System.out.println(arg); // abcd
		*/
		char[] arr5 = str1.toCharArray();
		
		for (int i = 0; i<arr5.length; i++) {
			arr5[i] = (char)(arr5[i] + 32);
		}
		
		String msg = new String(arr5);
		System.out.println(msg);
		System.out.println(str1.toLowerCase());
	}
}