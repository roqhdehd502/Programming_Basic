package practiceTwo;

public class Triangle {
	int width;
	int height;
	
	public void setWidth(int width) {
		this.width = width; // this.인수명 = 전역변수명
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return (width*height)/2;
	}
}
