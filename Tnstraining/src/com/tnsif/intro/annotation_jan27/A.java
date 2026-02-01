package com.tnsif.intro.annotation_jan27;

public class A {

	
		public void show() {
			System.out.println("Parent");		
			}
	}
class B extends A{
	@Override
	public void show() {
		System.out.println("child");
	}
}

	

