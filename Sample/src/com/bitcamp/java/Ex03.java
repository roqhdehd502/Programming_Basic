package com.bitcamp.java;
// 분기문과 반복문

public class Ex03 {
	public static void main(String[] args) { // 메인 및 호출 함수
		//doFor01();
		//doFor02();
		gugudan(5);
	}
	
	private static void gugudan(int cols) { // 반복문(구구단)
		/*
		for(int i=1; i<=9; i++) { //세로 출력담당
			for(int j=2; j<=9; j++) { //가로 출력담당
				System.out.print(j + " * " + i + " = " + i*j + " ");
				if ((i*j) <= 9) { // 곱셈해서 나온 값이 1의 자리일경우 형태 맞추기
					System.out.print(" ");
				}
			}
			System.out.println(); //j가 9가 되면 줄바꿈
		}
		*/
		for(int dan=2; dan<10; dan+=cols) {
			for(int i=1; i<=9; ++i) {
				for(int k=0; k<cols; ++k) { //cols에 따라 줄 수가 결정
					if( (dan+k) < 10) { // 출력하는 방식
						System.out.print(
								(dan+k) + " x " + i + " = " + ((dan+k)*i) + "\t");
					}
				}
				System.out.println();
			}
		}
		/*
		int cnt = 0;
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + " ");
				cnt++;
				if(cnt == 9) {
					System.out.println();
					cnt = 0; // 각 항 단위의 개수
				}
			}
		}
		*/
	}
	
	/*
	private static void doFor01() {
	
	}
	
	private static void doFor02() { // 반복문 구현 함수
		int cnt = 0;
		for(int i=1; i<=25; i++) {
			System.out.print(i + " ");
			cnt++;
			if(cnt % 5 == 0) { // 행을 내리는 조건
				System.out.println();
			}
			//
			if(cnt == 5) {
				System.out.println();
				cnt = 0; // 각 항 단위의 개수
			}
			//
		}	
	}
	*/
}
