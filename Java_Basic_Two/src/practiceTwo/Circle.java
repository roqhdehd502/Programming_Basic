package practiceTwo;

public class Circle {
	double x1, x2, y1, y2;
	double rad1, rad2;
	
	public void setLocation(double x1, double x2, double y1, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public void setRad(double rad1, double rad2) {
		this.rad1 = rad1;
		this.rad2 = rad2;
	}
	
	public double setDis() {
		setLocation(x1, x2, y1, y2);
		return Math.sqrt(Math.pow(Math.abs(x2-x1), 2) + Math.pow(Math.abs(y2-y1), 2));
	}
	
	public void setCir() {
		setRad(rad1, rad2);
		double dis = setDis();
		
		if ((rad2-rad1 < dis) && (rad1+rad2 > dis)) { // 판별식
			System.out.println("두 원은 두 점에서 만납니다.(중첩)");
		} else if ((rad1 + rad2 == dis) || (rad2-rad1 == dis)) {
			System.out.println("두 원은 한 점에서 만납니다.(중첩)");
		} else if ((rad2 - rad1 > dis) || (dis == 0)) {
			System.out.println("두 원은 어떠한 점에서도 만나지 않지만 포함관계입니다.(중첩)");
		} else {
			System.out.println("두 원은 만나지 않습니다.");
		}
	}
}