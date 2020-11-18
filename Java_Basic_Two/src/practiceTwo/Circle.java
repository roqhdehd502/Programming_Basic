package practiceTwo;

public class Circle {
	double x1, x2, y1, y2;
	
	public double distance(double x1, double x2, double y1, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		
		return Math.sqrt(Math.pow(Math.abs(x2-x1), 2) + Math.pow(Math.abs(y2-1), 2));
	}

}