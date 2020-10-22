package com.bitcamp.java;

// 전역변수와 지역변수

public class Ex01 {
	int global = 10; //전역변수
	public static void main(String[] args) {
		// 변수: 1개
		int num = 0; // int 자료형, num 이란 변수명으로 변수 선언, 0이란 값으로 초기화
		//num = 100L; //L: long 타입으로 초기화
		System.out.println(num); // 변수 num 출력
		
		int local = 100;
		
		System.out.println(local); // 지역변수 출력
	}
}