package com.tnsif.intro.inheritance;

public class heirar {
	public void ant() {
		System.out.println("Main class");
		}
}

class Ban extends heirar{
	public void ban() {
		System.out.println("Child of main");
	}
}
class Cat extends heirar{
	public void cn() {
		System.out.println("Derived from main");
	}
}
