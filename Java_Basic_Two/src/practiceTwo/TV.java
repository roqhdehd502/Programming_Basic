package practiceTwo;

public class TV {
	String brand;
	int year;
	int size;
	
	public TV(String brand, int year, int size) {
		this.brand = brand;
		this.year = year;
		this.size = size;
	}

	public void show() {
		System.out.println(brand + "에서 만든 " + year + "년형 "+ size + "인치 TV");
	}
}