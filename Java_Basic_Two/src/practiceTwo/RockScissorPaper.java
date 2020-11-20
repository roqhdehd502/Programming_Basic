package practiceTwo;

import java.util.Random;

public class RockScissorPaper {
	public static String what;

	public RockScissorPaper(String what) {
		this.what = what;
	}
	
	public String getWhat() {
		return what;
	}
	
	public void setWhat(String what) {
		this.what = what;
	}

	private void getResult() {
		Random random = new Random();
		
		int com = random.nextInt(3) + 1; // 1=="바위", 2=="가위", 3=="보"
		
		switch (com) {
		case 1: // 컴퓨터가 바위를 낼 때
			if (what.equals("바위")) {
				System.out.println("바위 나왔습니다. 비김");
			} else if (what.equals("가위")) {
				System.out.println("바위 나왔습니다. 짐");
			} else {
				System.out.println("바위 나왔습니다. 이김");
			}
			break;
		case 2: // 컴퓨터가 가위를 낼 때
			if (what.equals("바위")) {
				System.out.println("가위 나왔습니다. 이김");
			} else if (what.equals("가위")) {
				System.out.println("가위 나왔습니다. 비김");
			} else {
				System.out.println("가위 나왔습니다. 짐");
			}
			break;
		case 3: // 컴퓨터가 보를 낼 때
			if (what.equals("바위")) {
				System.out.println("보 나왔습니다. 짐");
			} else if (what.equals("가위")) {
				System.out.println("보 나왔습니다. 이김");
			} else {
				System.out.println("보 나왔습니다. 비김");
			}
			break;
		}
	}
	
	public void setResult() {
		getResult();
	}
}