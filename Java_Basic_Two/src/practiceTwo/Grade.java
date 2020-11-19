package practiceTwo;

public class Grade {
	int num;
	
	public void getGrade(int num) {
		this.num = num;
		
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
}
