package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

/*
 * Solution. 배열 요소 탐색
 * 
 * Base1. 배열 a의 크기는 1 ~ 100,000, 요소의 범위는 -1,000,000 ~ 1,000,000로 랜덤 생성한다.
 * Base2. 요소는 크기와 상관없이 무작위로 생성되므로 오름차순 정렬한다.(Arrays.sort())
 * Base3. 출력하고자 하는 양의 정수는 해당 요소에 없어야 한다.(!Arrays.asList(a).equals(m))
 * 
 * Case1. 배열요소 중 양의 정수 간 불연속적인 값이 있을때(a[i]-a[i-1] >= 2)
 * : 해당 두 배열요소를 짚어내어 새로운 동적 배열에 연산값을 담는다.(b.add(a[i]-a[i-1]))
 * : 이 후 첫 번째 동적 배열의 값을 출력한다.(b.get(0))
 * Case2. 배열요소 중 양의 정수 간 연속적인 값만 나올때(a[i]-a[i-1] == 1)
 * : 해당 두 배열요소를 짚어내어 새로운 동적 배열에 연산값을 담는다.(b.add(a[i]-a[i-1]))
 * : 이 후 마지막 동적 배열의 값의 1을 더한다.(출력)(b.get(b.length-1)+1)
 * Case3. 배열요소 마지막값이 0 또는 음수일때(a[a.length-1] == 0 || a[a.length-1] < 0)
 * : 새로운 동적 배열에 숫자 1을 담는다.(b.add(1))
 * : 이 후 첫 번째 동적 배열의 값을 출력한다.(b.get(0))
 */

public class test01 {
	public static void main(String[] args) {
		Random random = new Random(); // 난수 생성 클래스 선언 및 초기화
        
		int m1 = 10; // 배열의 최대크기
		int n1 = 1; // 배열의 최소크기(건드리지마)
		int m2 = 10; // 요소의 크기 범위지정
		
		int rand1 = random.nextInt(m1) + n1; // 1 ~ 10 사이의 정수랜덤값을 추출한다.
		// (원래는)1 ~ 100000 사이의 정수랜덤값을 추출한다.
		
		int[] a = new int[rand1]; // rand2 요소들을 담을 배열(rand1의 크기만큼)
		List<Integer> b = new ArrayList<Integer>(); // 조건문에 의해 나오는 새 요소를 담을 배열(동적 크기)
		
		for(int i=0; i<a.length; i++) { // a 배열에 요소 담기
			int rand2 = random.nextInt(2*m2) - 2*m2; // -20 ~ 20 사이의 정수랜덤값을 추출한다.
			// (원래는)-1,000,000 ~ 1,000,000 사이의 정수랜덤값을 추출한다.
			a[i] = rand2; // 생성된 난수의 값을 해당 배열 번호에 넣는다.
		}
		
		Arrays.sort(a); // 난수로 생성 된 요소들 오름차순 정렬
		
		for(int i=1; i<a.length; i++) { // 정렬된 요소 탐색
			if(a[i]-a[i-1] >= 2) { // 배열요소 중 양의 정수 간 불연속적인 값이 있을때
				b.add(a[i]-a[i-1]); // 해당 값을 새로운 배열에 할당.
				System.out.println("불연속이며 네가 찾는 값은 " + b.get(0)); 
				// 새로운 배열의 첫번째 요소를 출력
				break;
			}
			if(a[i]-a[i-1] == 1) { // 배열요소 중 양의 정수 간 연속적인 값만 나올때
				b.add(a[i]-a[i-1]); // 해당 값을 새로운 배열에 할당.
				System.out.println("연속이며 네가 찾는 값은 " + b.get(b.size()-1) + 1); 
				// 마지막 동적 배열 값의 1을 더해 출력.
				break;
			}
			if(a[a.length-1] == 0 || a[a.length-1] < 0) { // 배열요소 마지막값이 0 또는 음수일때
				b.add(1); // 1을 새로운 배열에 할당.
				System.out.println("최대값이 음수이며 변환된 값은 " + b.get(0)); 
				// 새로운 배열의 첫번째 요소를 출력
				break;
			}
		}
	}
}