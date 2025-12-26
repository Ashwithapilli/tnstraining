package com.tnsif.intro.constr;

public class Student {
	int sid=101;
	String sname="Ashwi";
	Student(){
		System.out.println("The student name:"+sname);
		}
	Student(int a){
		System.out.println("Marks "+a+" got to "+sname);
	}
	Student(int a,int b){
		System.out.println("value1 "+a+" value2 "+b);
		
		
	}

}
