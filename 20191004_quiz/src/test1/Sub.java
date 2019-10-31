package test1;

public class Sub implements Ical {
	
	
	
	
	private int a, b; // 인수 선언
	
	Sub (int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int cal() {   // 메서드 만들기	
		return a - b;
	}

	
	
	 	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}



}
