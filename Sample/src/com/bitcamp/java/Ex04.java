package com.bitcamp.java;

/*
 * 배열[]
 * - 자료형이 같은 여러 개의 변수들을 담는 구조.
 * - 요소: 번호(정수)로 구분
 * [0] 시작 [길이-1] 까지의 번호를(양수) 가진다. ex) int a[5]; -> a[0], a[1], a[2], a[3], a[4]
 * - 길이(개수): 최대 길이는 고정(정적), 현재 길이는 변한다.
 * 자료형 새로 만들어야 한다... 클래스형
 */

public class Ex04 {
	static final int ARRAY_MAX = 10; // 전역 및 상수를 통해 배열의 최대길이설정(정적)
	
	public static void main(String[] args) {
		int [] ar; // (중요)ar은 배열형의 정보를 저장하는 변수이다.
		ar = new int[ARRAY_MAX]; // 배열을 생성(new)
		
		for(int i=0; i < ar.length; ++i) { // 배열의 최대길이(length)까지 반복. 요소번호가 필요할때 for문 사용
			System.out.print(i + "-" + ar[i]);
		}
		System.out.println();
		
		// 번외(요소 번호가 -1일때와 0일때의 비교)
		int sp = -1; // 요소 값에 쓰이는 변수 타입은 반드시 int
		++sp; // 요소 번호가 -1 이므로 0이 되기위해서 증가연산자를 넣는다.
		ar[sp] = 1; // 요소 번호가 0이된 배열에 값 1을 넣는다.
		//ar[sp%ar.length] = 1; // 나머지 연산자(%)를 통해 오버플로우를 막는다.
		++sp;
		ar[sp] = 2;
		// sp: 마지막 추가한 번호, ++sp: 저장된 개수

		int mp = 0;
		ar[mp] = 1; // 요소 번호가 0 이므로 요소 값 1을 넣는다.
		++mp; // 요소 번호를 증가시킨다. (+1)
		ar[mp] = 2;
		++mp;
		// ++mp: 추가할 번호, mp: 저장된 개수		
		
		for(int i : ar) { // foreach: 콜론(:) 기호를 통해 범위 표현. 요소번호가 필요없을때 사용
			System.out.print(i);
		}
		System.out.println();
		
		
	}
}