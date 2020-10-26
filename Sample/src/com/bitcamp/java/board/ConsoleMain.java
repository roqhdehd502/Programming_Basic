package com.bitcamp.java.board;

import java.util.Scanner;

/*
 * 자바 문법을 활용한 게시판 구현하기
 * 1. 사용자 환경(UI) main 함수에서 처리
 * 2. 게시글 관리(Content) - service, 게시글 없으면 없다고 출력해....
 * 3. 회원 관리(User) - service
 * (Necessary)4. 검색기능- 작성자 등 추가해..... 특정자 검색해서 출력
 */

public class ConsoleMain {
	
	static Scanner kb;
	
	public static void main(String[] args) {
		kb = new Scanner(System.in); // 주입(Injection)
		ContentService ctservice = new ContentService(); // 게시글 서비스 클래스
		UserService usrservice = new UserService(); // 유저 서비스 클래스
		int cmd;
		final int UEXIT = 0;
		boolean loggin = false;
		String userName = ""; // null로 초기화해도 무방
		
		while(true) { // 반복문(논리적 상황 결정). true로 초기조건 설정시 반드시 break 조건문 필수
			// 게시글 목록
			Content[] contents = ctservice.getAll();
			if(contents != null) { // get한 게시글 정보의 유효성검사
				list(contents);
			} else {
				System.out.println("등록된 게시글이 없습니다.");
			}
			System.out.println("[1]write [2]view [3]join [4]login [5]logout [0]Exit");
			// 선택(이벤트)에 따라서 실행한다.(이벤트 핸들러)
			cmd = kb.nextInt(); kb.nextLine(); // int 타입의 입력값. (중요)키보드 버퍼에 의해 엔터값이 남는 것을 방지하기 위해 한번 더 넘긴다.
			if(cmd == UEXIT) { // 사용자가 종료를 선택했을때
				break;
			}
			// 실행 결과 출력
			switch (cmd) { // 조건문(상수(값)에 의해 분기 결정)
			case 1: // 상수값 1개만, 변수 또는 식 불가. case마다 break 조건을 설정하지 않으면 순차적으로 출력
				if(loggin) { // 글쓰기시 반드시 로그인을 해야한다.
					ctservice.save(registContent(userName));
				} else {
					System.out.println("로그인을 하십시오.");
				}
				break;
				
			case 2: // 하나의 글을 선택해서 상세 보기 화면
				System.out.println("글번호 : ");
				int no = kb.nextInt();kb.nextLine();
				//int no = 0;
				if (0 <= no && no < ctservice.getTotal()) { // 사용자의 입력 유효성 검사. 사용자의 잘못된 값 입력을 방지하도록 한다. ctservice.getTotal(): 
					Content content = ctservice.getContentByIndex(no);
					System.out.println(content); // 수정 및 삭제. 함수 인수에 글을 식별 할 수 있는 값을 삽입. 객체명을 전달하면 객체명.toString()이 전달.
				} else {
					System.out.println("Invailed no");
				}
				break;
				
			case 3: // 회원가입
				System.out.println("ID : ");
				String id = kb.nextLine();
				System.out.println("PW : ");
				String pw = kb.nextLine();
				System.out.println("Name : ");
				String name = kb.nextLine();
				User user = new User();
				
				user.id = id;
				user.pw = pw;
				user.name = name;
				usrservice.join(user);
				break;
				
			case 4: // 로그인
				//String id = ""; // (중요)사용자 정의 타입의 내용이 없음을 초기화(차선 확인)
				//String pw = null; // (중요)사용자 정의 타입의 공간이 없음을 초기화(최우선 확인)
				
				System.out.println("ID : ");
				id = kb.nextLine();
				System.out.println("PW : ");
				pw = kb.nextLine();
				
				
				
				//loggin = (usrservice.login(id, pw)) ? true : false; // 조건연산자 : 삼항연산자(선택적 대입 처리)
				if(usrservice.login(id, pw)) {// id와 pw를 확인. 실행할 조건(내용)이 여러개
					loggin = true;
					userName = id;
				} else {
					loggin = false;
					userName = null;
				}
				break;
				
			case 5: // 로그아웃
				loggin = false;
				userName = null;
				usrservice.logout();
				break;
				
			//default: // case에 해당되는 값이 없을때 작동. 값을 기입하지 않는다.
				//break;
			}
		} // end loop
		kb.close(); // Scanner 종료. 닫은 후에는 사용할 수 없다.
	}
	
	private static Content registContent(String userName) {
		Content content = new Content();
		content.name = userName;
		System.out.println("Title >");
		content.title = kb.nextLine();
		System.out.println("Text >");
		content.text = kb.nextLine();
		
		return content;
	}

	private static void list(Content[] board) { // 게시글 목록, 출력, 번호, 계획, 작성자
		/*
		if(bseq == 0) {
			System.out.println("등록된 글이 없습니다.");
			return;
		}
		*/
		String str = "List \n";
		for(int i=0; i<board.length; ++i) { //bseq(ctservice.getTotal()) 안되면 board.length로 대체
			str += "[" + i + "]\t"; // 증가연산으로 하여 리스트들을 하나하나 적재한다.
			str += board[i].title + "\t";
			str += board[i].name + "\n";
		}
		System.out.println(str);
	}
}