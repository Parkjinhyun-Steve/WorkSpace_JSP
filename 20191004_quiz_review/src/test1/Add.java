package test1;

public class Add {	
	// quiz1
	
	// 1. add class ����
	// 1. ������ ������� 2�� �����Ͻÿ�.	
	// 1. �ΰ��� ��������� ���ؼ� ���������� ���� �Ǵ� �޼ҵ� cal�� �����Ͻÿ�.
	// 1. ������� 2���� �����̺����� �����Ͻÿ�. get.. set.. �����Ͻÿ�.
	// 1. �⺻�����ڿ� int a, int b�� ������ �޴� �����ڸ� �ۼ��Ͻÿ�.	
	// implements Ical { ����Ͻÿ�.
	
	// 2. sub class ����
	// 2. ������ ������� 2�� �����Ͻÿ�.
	// 2. �ΰ��� ��������� ���� ���������� ���� �Ǵ� �޼ҵ� cal�� �����Ͻÿ�.
	// 2. ������� 2���� �����̺����� �����Ͻÿ�. get.. set.. �����Ͻÿ�.	
	
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
	
	// �⺻������
	Add () { }
	
	// int a, int b�� �Ķ���ͷ� ������ ������
	Add (int a, int b) {
		this.a = a;
		this.b = b;
	}
	
}
