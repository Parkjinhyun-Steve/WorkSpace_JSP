package test1;

public class Sub {
	
	private int a, b;
	
	Sub () { }
	
	public Sub(int i, int j) {
		//a = i;
		//b = j;
	}


	int cal(){
		return a-b;	
	}
	

	public int getA() {
		return a;	}
	public void setA(int a) {
		this.a = a;	}
	public int getB() {
		return b;	}
	public void setB(int b) {
		this.b = b;	}
	
	
}
