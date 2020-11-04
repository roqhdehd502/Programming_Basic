package practice;

public class Example01 {
	public static void main(String[] args) {
		int num = 4; // 상품의 개수 선언 및 초기화
		String line = "----------------------------"; // 분리선 변수 선언 및 초기화
		
		String[] item = new String[num]; // 상품 이름 배열 선언 및 초기화
		item[0] = "생수";
		item[1] = "꼬깔콘";
		item[2] = "커피";
		item[3] = "아이스크림";
		
		int[] ea = new int[num]; // 상품 개수 배열 선언 및 초기화
		ea[0] = 3;
		ea[1] = 2;
		ea[2] = 4;
		ea[3] = 1;
		
		int[] price = new int[num]; // 상품 가격 배열 선언 및 초기화
		price[0] = 900;
		price[1] = 1200;
		price[2] = 300;
		price[3] = 2500;
		
		int[] sum = new int[num]; // 상품 합계가 배열 선언 및 초기화
		sum[0] = ea[0]*price[0];
		sum[1] = ea[1]*price[1];
		sum[2] = ea[2]*price[2];
		sum[3] = ea[3]*price[3];
		
		// 영수증 출력
		System.out.println(line);
		System.out.println("\t 비트편의점 (ver 0.1.0)");
		System.out.println(line);
		System.out.println("상 품\t개 수\t가 격\t계");
		System.out.println(line);
		System.out.println(item[0]+"\t"+ea[0]+"\t"+price[0]+"\t"+sum[0]);
		System.out.println(item[1]+"\t"+ea[1]+"\t"+price[1]+"\t"+sum[1]);
		System.out.println(item[2]+"\t"+ea[2]+"\t"+price[2]+"\t"+sum[2]);
		System.out.println(item[3]+"\t"+ea[3]+"\t"+price[3]+"\t"+sum[3]);
		System.out.println(line);
		System.out.println("\t\t합 계\t"+(sum[0]+sum[1]+sum[2]+sum[3]));// 연산 우선순위 잘 파악!
		System.out.println(line); 
	}
}