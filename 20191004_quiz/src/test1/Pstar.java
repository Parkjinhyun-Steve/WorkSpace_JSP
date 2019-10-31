package test1;

public class Pstar {
	
	void print(Ical add){  // print 라는 메서드(함수) 생성  // 리턴 값이 없기 때문에 void
		
		int sum = add.cal();  // 변수 생성
		
		for (int i=0; i<=sum; i++) {
			System.out.print(" * ");			
		}	
		
	}	

}
