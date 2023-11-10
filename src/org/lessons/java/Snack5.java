package org.lessons.java;

import java.util.Scanner;

public class Snack5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
        
        boolean flag = true;
        
        while (flag) {
			
        	System.out.print("inserisci qualsiasi cosa tra lettere numeri e simboli (se vuoi terminare metti '0'):");
        	String input = in.nextLine().replaceAll("\\s", "");
        	
        	if (input.equals("0")) {
				flag = false;
				System.out.println("Operazione Finita");
				break;
			}
        	
        	int lettere = 0;
        	int numeri = 0;
        	int simboli = 0;
        	
        	for (int i = 0; i < input.length(); i++) {
				
        		char caratteri = input.charAt(i);
        		
        		if (Character.isLetter(caratteri)) {
					lettere ++;
				}else if (Character.isDigit(caratteri)){
					numeri ++;
				}else {
					simboli ++;
				}
			}
        	
        	System.out.println("Quantità delle Lettere:" + lettere);
        	System.out.println("Quantità dei Numeri:" + numeri);
        	System.out.println("Quantità dei Simboli:" + simboli);
		}

	}

}
