package no_mvc;

import java.util.Scanner;

public class NoMvcTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digita matricola:");
		String matricola = input.nextLine();
		
		System.out.println("Digita nome:");
		String nome = input.nextLine();
		
		System.out.println("Digita cognome:");
		String cognome = input.nextLine();
		
		
		Studente model = new Studente(matricola , nome,cognome);
		
		
		System.out.println(model.getCognome());
		
		input.close();
		
		

	}

}
