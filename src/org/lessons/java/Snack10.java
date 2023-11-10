package org.lessons.java;

import java.util.Scanner;

public class Snack10 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserisci il primo numero: ");
		int numeroUno = in.nextInt();
		
		System.out.print("Inserisci il secondo numero: ");
		int numeroDue = in.nextInt();
		
		in.close();
		
		int numeroMinore = 0;
		int numeroMaggiore = 0;
		
		if (numeroUno > numeroDue) {
			numeroMinore = numeroDue;
			numeroMaggiore = numeroUno;
		}else {
			numeroMinore = numeroUno;
			numeroMaggiore = numeroDue;
		}
		
		System.out.println("Il numero Maggiore è: " + numeroMaggiore);
		System.out.println("Il numero Minore è: " + numeroMinore);
		
		int c = 0;
		
		for (int i = numeroMinore; i <= numeroMaggiore; i++) {
			c += i;
		}
		System.out.println(c);
	}

}
