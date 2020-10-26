package com.bitcamp.java.board;

public class Content { // 게시글
	
	int cno;
	String title;
	String text;
	String name;
	
	@Override // 기존에 이미 구현된 함수를 교체(다시 만든다)하는 경우(@: Annotation)
	public String toString() { // toString()은 기존에 있던 메소드
		String s = "Content{ [" + cno + "]";
		s += "title: " + title;
		s += "text: " + text;
		s += "name: " + name + "} \n";
		return s;
	}
	
}