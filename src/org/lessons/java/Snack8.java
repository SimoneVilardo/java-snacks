package org.lessons.java;

import java.util.Scanner;

public class Snack8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci qualcosa: ");
		String string = in.nextLine();
		
		char[] caratteri = string.toLowerCase().toCharArray();

        for (int i = 0; i < caratteri.length; i++) {
            if (caratteri[i] == 'a') {
            	caratteri[i] = 'o';
            } else if (caratteri[i] == 'o') {
            	caratteri[i] = 'a';
            }
        }

        String risultato = new String(caratteri);

        System.out.println("Stringa modificata: " + risultato);

	}

}
