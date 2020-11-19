package practiceTwo;

public class TriangleMain {

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		
		triangle.setWidth(10);
		triangle.setHeight(10);
		
		int area = triangle.getArea();
		
		System.out.println(area);
	}

}