package practiceTwo;

public class Age {
	private int nai;
	private String name;
	
	public Age(String name, int nai) {
		this.name = name;
		this.nai = nai;
	}
	
	private void getInfo() {
		System.out.println("이름은 " + name + "이고 나이는 " + nai + "세입니다.");
		System.out.println();
	}
	
	public void setInfo() {
		getInfo();
	}
}