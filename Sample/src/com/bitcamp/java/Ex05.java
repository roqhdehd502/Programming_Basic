package com.bitcamp.java;

public class Ex05 { // Call by Reference 및 Value
	public static void main(String[] args) {
		Phone myphone1;
		myphone1 = new Phone();
		// 새 전화기를 받아서 번호를 등록
		// 함수를 호출한다. -> 객체에게 요청한다.
		myphone1.setNumber("01012345678"); // 해당 정보를 저장한다
		myphone1.call();
		System.out.println(myphone1); // 인스턴스명을 전달(주소)
		
		Phone myphone2;
		myphone2 = new Phone();
		System.out.println(myphone2); // 인스턴스명을 전달(주소). 주소는 다르지만 참조는 myphone과 같다.
		
		myphone2.equals(myphone1); // 객체간의 비교. 내장된 함수
		
		if(myphone1 == myphone2) {
			// 참조가 같으면... 객체 자체는 1개이며 이름만 2개
		} else {
			// 참조가 다르면... 객체는 2개
			// field는 같은가/다른가
		}
	}

	public static void main01(String[] args) {
		// 클래스의 객체(Instance) 생성 
		Phone myphone = new Phone(); // myphone: 인스턴스 명, new Phone(): 생성자
		// 객체명(Instance's name).member
		myphone.call();
		// 멤버 변수: 속성, Field
		// 멤버 함수: 기능(행위)
	}
}