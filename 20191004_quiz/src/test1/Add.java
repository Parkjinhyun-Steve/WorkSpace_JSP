package test1;

public class Add implements Ical {	
	// quiz1
	// ������ ������� 2��
	// �ΰ��� ��������� ���ؼ� ���������� ���� �Ǵ� �޼ҵ� cal�� ����ÿ�
	
	private int a, b;
	
	Add(int a, int b){  // ������
		this.a = a;
		this.b = b;	
	}		
	
	public int cal() {  // �޼��� ����
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
