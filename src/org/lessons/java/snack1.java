package org.lessons.java;

import java.util.Scanner;

public class Snack1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		String strValue = in.nextLine();
		int value = Integer.valueOf(strValue);
		
		if(value % 2 == 0) {
			System.out.println(value);
		}else {
			System.out.println(value + 1);
		}

	}

}
