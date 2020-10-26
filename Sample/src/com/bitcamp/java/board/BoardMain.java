package com.bitcamp.java.board;

import java.util.Scanner; // jav.util 패키지의 Scanner 클래스를 불러옵니다.

/*
 * 콘솔환경, 게시판
 * 게시글.[]
 * 글번호, 글제목, 내용, 작성자
 * int: 글번호 표현
 * String: 문자열 표현
 * 사용자.[]
 * 번호, 이름, 아이디, 암호
 * 
 * 여러 함수들이 공통 사용할 변수들 ?
 * - 지역, 전역, 정적 변수들의 구분
 */

public class BoardMain { // 게시판 구현 메인 클래스
	/*
	 * 실행 절차: 키보드로 입력, 모니터 출력(어디, 무엇)
	 */
	
	static Scanner kb; // 전역변수를 통해 선언(초기화x)
	static boolean loggin = false; // 해당 기능만 테스트시 true로 임시변경
	static String userName = null; // (중요)타입이 클래스인 변수를 선언할때 반드시 null로 초기화한다.(NullPointException 방지)
	
	static Content[] board; // 게시글을 요소로 하는 배열(게시판)
	static final int BOARDMAX = 10; // 최대 게시글수
	static int bseq = 0; // 보드(게시글)의 요소번호
	
	static User[] users; // 유저들을 저장하는 배열
	static final int USERMAX = 10; // 최대 유저수
	static int useq = 0; // 유저의 요소번호
	
	public static void main(String[] args) {	
		board = new Content[BOARDMAX];
		users = new User[USERMAX];
		kb = new Scanner(System.in); // Scanner 클래스를 이용해 생성자 사용. 키보드의 입력 값을 처리하는 라이브러리 사용
		
		System.out.println("어플리케이션이 시작되었습니다.");
		
		// 초기화
		final int UEXIT = 0; // 상수표현(가시성 보장으로 변수명을 대문자로 표현). 시스템의 설정값
		int cmd = 0; // 시스템의 입력값(0을 입력하면 어플래케이션을 종료하는 제어문으로 넘어감)
		
		// loggin 변수 초기화 할 것
		// userName 변수 초기화 할 것
		
		while(true) { // 반복문(논리적 상황 결정). true로 초기조건 설정시 반드시 break 조건문 필수
			// 게시글 목록
			list();
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
					registContent(userName);
				} else {
					System.out.println("로그인을 하십시오.");
				}
				break;
				
			case 2: // 하나의 글을 선택해서 상세 보기 화면
				System.out.println("글번호 : ");
				int no = kb.nextInt();kb.nextLine();
				//int no = 0;
				if (0 <= no && no < bseq) { // 사용자의 입력 유효성 검사. 사용자의 잘못된 값 입력을 방지하도록 한다.
					viewContent(no); // 수정 및 삭제. 함수 인수에 글을 식별 할 수 있는 값을 삽입
				} else {
					System.out.println("Invailed no");
				}
				break;
				
			case 3: // 회원가입
				join();
				break;
				
			case 4: // 로그인
				//String id = ""; // (중요)사용자 정의 타입의 내용이 없음을 초기화(차선 확인)
				//String pw = null; // (중요)사용자 정의 타입의 공간이 없음을 초기화(최우선 확인)
				
				System.out.println("ID : ");
				String id = kb.nextLine();
				System.out.println("PW : ");
				String pw = kb.nextLine();
				
				login(id, pw); // id와 pw를 확인
				//login();
				break;
				
			case 5: // 로그아웃
				logout();
				break;
				
			default: // case에 해당되는 값이 없을때 작동. 값을 기입하지 않는다.
				break;
			}
		} // end loop
		// 마무리(해제 혹은 정리)
		System.out.println("어플리케이션이 종료되었습니다.");
	} // main end

	private static void logout() { // 로그아웃
		loggin = false;
		userName = null;
	}

	private static void login(String id, String pw) { // 전달받은 값이 일치하는지 확인
		loggin = false; // 로그인 중첩방지를 위해 먼저 로그아웃을 하고 인증을 받는다.
		// 가져오기
		// (중요)비교(&&, ||)
		//"jang".equals(id); // 두 개의 문자열(String)의 값이 동등한지(equals) 비교. (중요)객체와 객체 혹은 클래스와 클래스끼리 비교할때만 사용한다.
		//id.equals("jang");
		//id.contains("j"); // 해당 문자열 중 특정 키워드(부분 문자열)가 포함이(contains) 되는지 확인.
		for(User user : users ) {
			if( user != null ){ // (중요)유저의 정보가 null인지 확인
				if( user.id.equals(id) ) { // 데이터타입은 .을 통해 계속 들어갈수록 달라진다.
					if(user.pw.equals(pw)) { // id와 pw가 모두 확인한게 맞을때
						// sucesss
						loggin = true;
						userName = user.name;
					}
				}
			}
		}
		//loggin = true;
	}

	private static void join() { // 사용자 등록
		System.out.println("Name : ");
		String name = kb.nextLine();
		System.out.println("ID : ");
		String id = kb.nextLine();
		System.out.println("PW : ");
		String pw = kb.nextLine();
		
		// 등록 : users[] =
		User user = new User();
		user.uid = useq+1; // 1번부터 시작
		user.name = name;
		user.id = id;
		user.pw = pw;
		
		users[useq] = user; // 주거, 등록
		++useq; // 중복 방지. 한개씩 번호를 증가하여 저장
	}

	private static void viewContent(int no) { // 게시글 보기-수정, 삭제
		// 가져오기
		Content content = board[no]; // 출력할 content를(데이터) 가져오기
		// 출력하기
		String s = "["+content.cno+"] "+content.title;
		s += "\n:"+content.name;
		s += "\n" + content.text;
		
		System.out.println(s);
	}

	private static void registContent(String userName) { // 게시글 1개를 입력받아 저장(등록)
		// 글번호: 자동 증가
		System.out.println("Title : ");
		String title = kb.nextLine(); // 처음부터 끝까지 문자열을 읽는다. 입력과 출력은 한 줄씩 이루어지도록 구현한다.(버퍼)
		System.out.println("Text : ");
		String text = kb.nextLine();
		// 등록
		Content content = new Content();
		content.cno = bseq+1; // 선택사항. 1번부터 시작하게 하기
		content.title = title;
		content.name = userName;
		content.text = text;
		
		if(board != null && bseq < board.length) {
			board[bseq] = content;
			++bseq;
		}
	}

	private static void list() { // 게시글 목록, 출력, 번호, 계획, 작성자
		if(bseq == 0) {
			System.out.println("등록된 글이 없습니다.");
			return;
		}
		for(int i=0; i<bseq; ++i) {
			String str = "[" + i + "]\t";
			str += board[i].title + "\t";
			str += board[i].name;
			System.out.println(str);
		}
	}
}