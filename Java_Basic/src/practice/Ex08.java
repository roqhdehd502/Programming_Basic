package practice;

public class Ex08 {
	public static void main(String[] args) {
		double a = 5;
		int b = 2;
		
		System.out.println(a/b); // int->double로 오토캐스팅 되어 연산
		System.out.println(a%b);
		System.out.println("---------------------");
		System.out.println(a>b); // 오토캐스팅 되어 bool 연산
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println("---------------------");
		System.out.println(true&&true); // AND 연산
		System.out.println(true&&false);
		System.out.println(false&&false);
		System.out.println(true||true); // OR 연산
		System.out.println(true||false);
		System.out.println(false||false);
		System.out.println(!true); // NOT 연산
		System.out.println(!false);
	}
}