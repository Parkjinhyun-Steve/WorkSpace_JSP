package test1;

public class Add implements Ical {	
	// quiz1
	// 정수형 멤버변수 2개
	// 두개의 멤버변수를 더해서 정수형으로 리턴 되는 메소드 cal을 만드시오
	
	private int a, b;
	
	Add(int a, int b){  // 생성자
		this.a = a;
		this.b = b;	
	}		
	
	public int cal() {  // 메서드 생성
		int sum;
		sum = a + b;
		return sum;		
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
