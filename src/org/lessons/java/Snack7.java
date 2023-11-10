package org.lessons.java;

import java.util.Scanner;

public class Snack7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci i secondi: ");
		String strSecondi= in.nextLine();
		int intSecondi = Integer.valueOf(strSecondi);
		
		in.close();
		
		int ore = intSecondi / 3600;
        int secondiRimanenti = intSecondi % 3600;
        int minuti= secondiRimanenti / 60;
        int secondi = secondiRimanenti % 60;

        String strTempo = String.format("%02d:%02d:%02d", ore, minuti, secondi);

        System.out.println("Il tempo convertito è: " + strTempo);
	}

}
