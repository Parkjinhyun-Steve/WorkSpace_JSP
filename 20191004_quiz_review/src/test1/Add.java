package test1;

public class Add {	
	// quiz1
	
	// 1. add class 생성
	// 1. 정수형 멤버변수 2개 선언하시오.	
	// 1. 두개의 멤버변수를 더해서 정수형으로 리턴 되는 메소드 cal을 생성하시오.
	// 1. 멤버변수 2개는 프라이빗으로 변경하시오. get.. set.. 생성하시오.
	// 1. 기본생성자와 int a, int b를 변수로 받는 생성자를 작성하시오.	
	// implements Ical { 사용하시오.
	
	// 2. sub class 생성
	// 2. 정수형 멤버변수 2개 선언하시오.
	// 2. 두개의 멤버변수를 빼서 정수형으로 리턴 되는 메소드 cal을 생성하시오.
	// 2. 멤버변수 2개는 프라이빗으로 변경하시오. get.. set.. 생성하시오.	
	
	private int a, b;
		
	public int getA() {
		return a;	}
	public void setA(int a) {
		this.a = a;	}
	public int getB() {
		return b;	}
	public void setB(int b) {
		this.b = b;	}
	
	int cal() {
		return a + b;
	}
	
	// 기본생성자
	Add () { }
	
	// int a, int b를 파라메터로 가지는 생성자
	Add (int a, int b) {
		this.a = a;
		this.b = b;
	}
	
}
