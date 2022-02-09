package com.carlos.zookeeper1;

public class Gorilla extends Mammal {
		
	public Gorilla() {
		
		super();
		this.name = "Gorilla";						
		// TODO Auto-generated constructor stub
	}

	public int throwSomething() {
		System.out.println("Whatch out! The Gorilla is throwing something!");
		energyLevel -= 5;	
		return energyLevel;
	}
	
	public int eatBananas() {
		System.out.println("Ooh ooh Ahh Ahh Ooh ooh Ahh Ahh!");
		return energyLevel += 10;
		
	}

	public int climb() {
		System.out.println("Look over there! The Gorilla has climbed the tree. So cool!");
		return energyLevel -= 10;
	
	}
}
