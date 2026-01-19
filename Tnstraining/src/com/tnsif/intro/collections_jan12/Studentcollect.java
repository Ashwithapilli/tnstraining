package com.tnsif.intro.collections_jan12;
import java.util.ArrayList;
import java.util.Collections;
public class Studentcollect {

	public static void main(String[] args) {
		ArrayList<Student> ob = new ArrayList<Student>();
		Student st = new Student(101, "Ashwi", 100.0);
		ob.add(st);
		st = new Student(102, "Mai", 57.0);
		ob.add(st);
		st = new Student(103, "Sita", 90.0);
		ob.add(st);
		st = new Student(104, "Raj", 89.0);
		ob.add(st);
		System.out.println("before sorting");
		System.out.println(ob);
		System.out.println("after sorting");
		Collections.sort(ob);
		System.out.println(ob);
		

	}

}
