package com.bitcamp.java.board;

/*
 * 게시글 정보를 다루는 기능을 구현한다.
 * 저장소를 가지고 있다. Content[]
 * CRUD(Create, Retrieve, Update, Delete) 구현
 */

public class ContentService {
	private Content[] list; // = null
	private int bseq;
	
	public ContentService() { // 생성자: 반환형은 적지 않음, 클래스명과 동일한 함수형
		// 멤버 초기화: 배열 생성하려면 요소의 자료형, 길이가 있어야 한다.
		list = new Content[10];
		bseq = 0;
	}
	
	public Content[] getAll() { // 지금까지 저장한 리스트 반환
		if (bseq==0) {
			return null;
		}
		Content[] result = new Content[bseq];
		// copy? Call by value 인지, Call by reference 인지 판단.
		for(int i=0; i<bseq; ++i) {
			result[i] = list[i]; // copy
		}
		return result;
	}

	public void save(Content registContent) { // 리스트 저장
		if(registContent != null && bseq < list.length) { // 오버플로우 방지
			list[bseq] = registContent;
			++bseq;
		}
	}

	public int getTotal() { // 현재 저장된 게시글의 개수 [번호]
		return bseq; 
	}

	public Content getContentByIndex(int no) { // 배열 요소번호 꺼내기
		return list[no];
	}
		
}