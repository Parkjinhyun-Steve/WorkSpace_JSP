package test1;

public class Pstar {
	
	void print(Ical add){  // print ��� �޼���(�Լ�) ����  // ���� ���� ���� ������ void
		
		int sum = add.cal();  // ���� ����
		
		for (int i=0; i<=sum; i++) {
			System.out.print(" * ");			
		}	
		
	}	

}
