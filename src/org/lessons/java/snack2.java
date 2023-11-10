package org.lessons.java;

import java.util.Iterator;
import java.util.Random;

public class snack2 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		String[] nomi = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
		String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
		
		int nomiLength = nomi.length;
		int cognomiLength =cognomi.length;
		
		int value = 0;
		
		if (nomiLength > cognomiLength) {
			value = nomiLength;
		}else if (nomiLength < cognomiLength) {
			value = cognomiLength;
		}else {
			value = nomiLength;
		}
		
		
		
		for (int i = 0; i < value; i++) {
			
			int randomNomi = rnd.nextInt(0, nomiLength);
			int randomCognomi = rnd.nextInt(0, cognomiLength);
			
			String fullName = nomi[randomNomi] + " " + cognomi[randomCognomi];
			
			System.out.println(fullName);
		}

	}

}
