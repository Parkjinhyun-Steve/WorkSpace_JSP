package test1;

public class Sub implements Ical {
	
	
	
	
	private int a, b; // �μ� ����
	
	Sub (int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public int cal() {   // �޼��� �����	
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
