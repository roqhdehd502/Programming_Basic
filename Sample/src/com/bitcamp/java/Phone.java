package com.bitcamp.java;

public class Phone {
	// fields: 전역변수 선언만(기본형, 참조형)
	private String number; // 특별한 일이 없을땐 private 접근제한자로...
	
	
	// methods: 전역변수 호출 및 지역변수 선언/호출
	public void setNumber(String no) { // Setter
		if (no == null || no.isEmpty()) { // String의 유효성 검사
			// +, -, 숫자와 같은 기호
		}
		number = no;
	}
	
	public void call() { // 특별한 일이 없을땐 public 접근제한자로...
		System.out.println("call : ");
	}
	
	public String getNumber() {
		return number;
	}
	/*
	public void setNumber(String number) {
		this.number = number; // this: 메소드의 인수가 아닌 필드의 전역변수를 의미한다.
	}
	*/
}