package practiceTwo;

public class Grade {
	private int kor, eng, math;
	
	public Grade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getKor() {
		return kor;
	}
	
	void setKor(int kor) {
		this.kor = kor;
	}
	
	int getEng() {
		return eng;
	}
	
	void setEng(int eng) {
		this.eng = eng;
	}
	
	int getMath() {
		return math;
	}
	
	void setMath(int math) {
		this.math = math;
	}
	
	private int avg() {
		return (kor + eng + math) / 3;
	}

	private void getGrade() {
		int num = avg();
		
		if (num >= 95) {
			System.out.println("당신의 성적: " + num + "[A+]");
		} else if (num >= 90 && num < 95) {
			System.out.println("당신의 성적: " + num + "[A]");
		} else if (num >= 85 && num < 90) {
			System.out.println("당신의 성적: " + num + "[B+]");
		} else if (num >= 80 && num < 85) {
			System.out.println("당신의 성적: " + num + "[B]");
		} else if (num >= 70 && num < 80) {
			System.out.println("당신의 성적: " + num + "[C]");
		} else if (num >= 60 && num < 70) {
			System.out.println("당신의 성적: " + num + "[D]");
		} else {
			System.out.println("당신의 성적: " + num + "[F]");
		}
	}
	
	public void setGrade() {
		getGrade();
	}
}
