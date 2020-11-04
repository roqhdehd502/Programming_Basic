package practice;

public class Ex20 {

	public static void main(String[] args) {
		System.out.println("총 " + args.length + "개");
		
		for (int i=0; i<args.length; i++) {
			System.out.println(i + 1 + " 번째: " + args[i]);
		}
	}
}