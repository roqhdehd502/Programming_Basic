package com.bitcamp.java;

// 메소드의 선언과 호출 그리고 조건문과 캐스팅

public class Ex02 {
	public static void main(String[] args) { //generate 함수를 호출하는 함수
		int ran = generate();
		boolean result = isDuplicated(ran); // 생성난 난수 중복 배제
		
		if(result) { // 조건문(중복 판별 분기)
			System.out.println("숫자가 중복되었습니다."); // 조건식이 true(중복됨)
		} else {
			System.out.println("3자리 정수: " + ran); // 조건식이 false(중복되지 않음)
		}
	}

	private static int generate() { // 선언하는 함수(난수)
		//int num = 0; // 난수생성. 수학 공식: ~난수법 -> 함수
		//num = 123;
		int max = 999;
		int min = 100; 
		int random_float = (int)(Math.random() * (max-min+1)) + min; // random(난수생성) 함수. 100부터 999까지 난수생성
		/*
		random_float = random_float + min; // Minimum 설정
		random_float = random_float % (max-min+1); // Maximum 설정
		*/
		System.out.println(random_float);
		
		return random_float;
	}
	
	private static boolean isDuplicated(int n) { // 선언하는 함수(자리의 난수가 중복인지 판별)
		boolean result = false;
		int p100 = n / 100; // 100의 자리 수
		int p10 = (n / 10) % 10; // 10의 자리 수
		int p1 = n % 10; // 1의 자리 수
		
		if((p100 == p10) || (p100 == p1) || (p10 == p1)) { // 각 자리의 값이 같을때의 판별 (다중 조건시, 논리연산자 이용)
			result = true;
		}
		/*
		if(p100 == p10) {
			result = true;
		}
		if(p100 == p1) {
			result = true;
		}
		if(p10 == p1) {
			result = true;
		}
		*/
		
		return result;
	}
}
