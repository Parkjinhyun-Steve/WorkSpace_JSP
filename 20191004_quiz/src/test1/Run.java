package test1;

public class Run {

	public static void main(String[] args) {
		
		Pstar pstar = new Pstar();
		
		Ical add = new Add(3, 4);
		Ical sub = new Sub(7, 4);		
		
		pstar.print(add);
		pstar.print(sub);
		
	}

}
