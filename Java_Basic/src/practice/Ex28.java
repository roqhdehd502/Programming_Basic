package practice;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 주민번호 검사기
 * run > java Ex28 123456-1234567
 * 당신은 올해 00세 남성입니다.
 * 
 * run > java Ex28 1234561234567
 * 주번먼호 형식에 맞춰 작성하세요.(ex. 123456-1234567)
 * 
 * run > java Ex28 12345a-1234567
 * 숫자가 아닌 문자를 입력하셨습니다.
 * 
 * Issue. while문에서 분기점 추가해야함(잘못된 입력값이 일어났음에도 연산을 통해 값이 나옴)
 */

public class Ex28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		while (true) {
			System.out.println("당신의 주민등록번호를 입력하세요.");
			System.out.println("ex) 123456-1234567");
			String num = scanner.next(); // 주민등록번호 입력
			
			char[] arr = num.toCharArray(); // 입력받은 String 타입을 char 타입 배열로 선언 및 초기화
			char[] temp = new char[2]; // 주민번호 뒷자리 첫 번째 번호 확인
			temp[0] = arr[0];
			temp[1] = arr[1];
			String temp2 = new String(temp);
			int year = Integer.parseInt(temp2); // 연도 계산 목적으로 변수 선언 및 초기화
			
			if (arr.length != 14) { // 입력한 주민번호 길이 검사
				System.out.println("주민등록번호 입력이 잘못되었습니다. 다시 작성하세요.");
			}
			else if (arr[6] != '-') { // 입력한 주민번호 중간에 '-' 검사
				System.out.println("주민등록번호 입력이 잘못되었습니다. 다시 작성하세요.");
			}
			for (int i=0; i<arr.length; i++) { // 입력한 주민번호에 숫자외 여부 검사
				if (!('0' <= arr[i] && arr[i] <= '9'|| arr[i] == '-')) {
					System.out.println("주민등록번호 입력이 잘못되었습니다. 다시 작성하세요.");
				}
			}
			
			
			
			
			
			if(arr[7] == '1' || arr[7] == '2') { // 1900년대 출생자일때
				year += 1900;
			} else if(arr[7] == '3' || arr[7] == '4') { // 2000년대 출생자일때
				year += 2000;
			}
			
			int age = cal.get(Calendar.YEAR)-year+1; // 세는 나이 계산(현재년도기준)
			if (arr[7] == '1' || arr[7] == '3') {
				System.out.println("당신은 올해 " + age + "세이며 남자입니다.");
			} else {
				System.out.println("당신은 올해 " + age + "세이며 여자입니다.");
			}
			break;		
		}
		scanner.close();
	}
}