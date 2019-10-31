package controller;

import java.util.Random;

public class Love {
	
	int love () {		
		Random rd = new Random();
		int love = rd.nextInt(100)+1;
		return love;	
		
	}	
	
}
