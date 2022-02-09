package com.carlos.zookeeper1;

public class GorillaTest {
	
	public static void main(String[] args) {
		
		// Mammal Test		
		Mammal m1 = new Mammal();
		System.out.println(m1.displayEnergy());	
		
		// Gorilla Test
		Gorilla Koko = new Gorilla();
		System.out.println("******** Koko *********");
		Koko.displayEnergy();
		Koko.throwSomething();
		Koko.throwSomething();
		Koko.throwSomething();
		Koko.displayEnergy();
		Koko.eatBananas();
		Koko.eatBananas();
		Koko.displayEnergy();		
		Koko.climb();
		Koko.displayEnergy();										
	}	

}
