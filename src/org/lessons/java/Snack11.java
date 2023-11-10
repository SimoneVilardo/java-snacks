package org.lessons.java;

import java.util.Random;

public class Snack11 {

public static void main(String[] args) {
		
		final int totaleNumeri = 10;
		
		Random rnd = new Random(100);
		
		
		int[] numeri = new int[totaleNumeri];
		for (int x=0; x<numeri.length; x++) {
			
			numeri[x] = rnd.nextInt(0, 101);
			System.out.println("numero[" + x + "]: " + numeri[x]);
		}
		
		
		int numeroMassimo = Integer.MIN_VALUE;
		for (int x=0; x<numeri.length; x++) {
			
			int valoreNumerico = numeri[x];
			if (valoreNumerico > numeroMassimo) {
				
				numeroMassimo = valoreNumerico;
			}
		}
		
		
		int numeroMinimo = Integer.MAX_VALUE;
		for (int x=0; x<numeri.length; x++) {
			
			int value = numeri[x];
			if (value < numeroMinimo) {
				
				numeroMinimo = value;
			}
		}
		
		
		int mediaNumeri = 0;
		for (int x=0; x<numeri.length; x++) {
			
			int value = numeri[x];
			mediaNumeri += value;
		}
		mediaNumeri /= numeri.length;
		
		
		System.out.println("numero massimo: " + numeroMassimo);
		System.out.println("numero minimo: " + numeroMinimo);
		System.out.println("media dei numeri: " + mediaNumeri);
	}

}
