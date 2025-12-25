package com.tnsif.intro.condition;
import java.util.Scanner;
public class Mysac {

	public static void main(String[] args) {
		Scanner sac=new Scanner(System.in);
		System.out.println("Enter number:" );
        int a=sac.nextInt();
        if(a%2==0) {
			System.out.println("Even");
		}
		else {
		System.out.println("Odd");


	}

}
}