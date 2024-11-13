package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", 
				"J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio",
				"Luis", "Pardis Zarei", "Martina Maccherone", 
				"Rachel Zeilic"};
		String nomeInvitato = "";
		System.out.println("Benvenuto a casa Ferragnez! Inserisci il tuo nome così che possa controllare la lista degli invitati.");
		Scanner scan = new Scanner(System.in);
		nomeInvitato = scan.nextLine();
		Boolean isInvited = false; 
		
		/* metodo con il ciclo For
		for (int i = 0; i < invitati.length; i++) {
	
			if (nomeInvitato.equalsIgnoreCase(invitati[i])) {
				isInvited = true;
				break;
			}
		}
		*/
		
		// metodo con il while
		int i = 0;
		while (i < invitati.length) {
			if (nomeInvitato.equalsIgnoreCase(invitati[i])) {
				isInvited = true;
				break;
			}
			i++;
		}

		if (isInvited == true) {
			System.out.println("Ciao " + nomeInvitato + " , puoi entrare!");
		}
		else {
			System.out.println("Mi dispiace " + nomeInvitato + " , non sei sulla lista e non puoi entrare!");
		}
		
	}

}

