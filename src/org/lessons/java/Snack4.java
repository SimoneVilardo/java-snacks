package org.lessons.java;

import java.util.Scanner;

public class Snack4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci una parola: ");
		String strUser = in.nextLine();
		
		in.close();
		
		int strLength = strUser.length();		
		String stringReverse = "";
		
		for (int i = strLength - 1; i >= 0; i--) {

            char c = strUser.charAt(i);

           stringReverse += c;

        }
		
		if (strUser.equals(stringReverse)) {
			System.out.println("La parola " + strUser + " è palindroma");
		}else {
			System.out.println("La parola non è palindroma");
		}

	}

}
