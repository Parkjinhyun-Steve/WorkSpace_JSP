package test1;

public class Run {

	public static void main(String[] args) {
		
		Add add1 = new Add();
		add1.setA(5);
		add1.setB(6);
		int addresult1 = add1.cal();
		System.out.println(addresult1);
		
		Add add2 = new Add(5, 6);
		int addresult2 = add2.cal();
		System.out.println(addresult2);
	
		
		Sub sub1 = new Sub();
		sub1.setA(7);
		sub1.setB(5);
		int subresult1 = sub1.cal();
		System.out.println(subresult1);
		
		Sub sub2 = new Sub(7,5);
		int subresult2 = sub2.cal();
		System.out.println(subresult2);
		
		
		
		
	}

}
