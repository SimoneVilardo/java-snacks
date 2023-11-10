package org.lessons.java;

import java.util.Arrays;

public class Snack9 {

	public static void main(String[] args) {
		
		int[] numeriArray = {1, 2, 3, 4, 5};
		
		int numPari = 0;
		int numDispari = 0;
		
		for (int i = 0; i < numeriArray.length; i++) {
			if (numeriArray[i] % 2 == 0) {
				numPari ++;
			}
		}
		
		for (int i = 0; i < numeriArray.length; i++) {
			if (numeriArray[i] % 2 == 1) {
				numDispari ++;
			}
		}
		
		
		int[] dispariArray = new int[numDispari];
		int[] pariArray = new int[numPari];
		
		int dispariIndex = 0;
		int pariIndex = 0;
		
		for (int i = 0; i < numeriArray.length; i++) {
			if (numeriArray[i] % 2 == 0) {
				pariArray[pariIndex] = numeriArray[i];
				pariIndex++;
			}else {
				dispariArray[dispariIndex] = numeriArray[i];
				dispariIndex++;
			}
		}
		System.out.println("Numeri dispari: " + Arrays.toString(dispariArray));
		System.out.println("Numeri pari: " + Arrays.toString(pariArray));
	}

}