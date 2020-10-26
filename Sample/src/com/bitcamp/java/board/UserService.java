package com.bitcamp.java.board;

/*
 * 회원 정보를 다루는 기능을 구현한다.
 * 저장소를 가지고 있다. User[]
 * CRUD(Create, Retrieve, Update, Delete) 구현
 */

public class UserService {
	private User[] list;
	private int useq;
	
	public UserService() {
		list = new User[5]; // 최대 유저수 5명
		useq = 0;
	}
	
	public void join(User user) { // 회원가입
		if(list != null && user != null && useq < list.length) {
			list[useq] = user;
			++useq;
		}
	}

	public boolean login(String id, String pw) { // 로그인
		boolean result = false;
		// 배열, 리스트 여러개가 저장된 구조의 반복
		for(User user : list) {
			if(user != null) { // (중요)foreach 형태 국룰...
				if(user.id.equals(id) && user.pw.equals(pw)) {
					result = true;
					break;
				}
			}
		}
		return result;
	}

	public void logout() { // 로그아웃. 절차상 더미로...
		
	}
	
}
