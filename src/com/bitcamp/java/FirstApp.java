package com.bitcamp.java; // 패키지

public class FirstApp { // 클래스
	public static void main(String args[]) { // 메소드
		int a = 10;
		int b = func(a); // 메소드 호출(func 함수)
		
		System.out.println(b); // 호출한 메소드 출력
	}
	
	public static int func(int value) { // 메소드 선언
		int sum = value + 10;
		return sum; // 메소드 반환
	}
}