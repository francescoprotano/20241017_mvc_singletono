package mvc;

import java.util.Scanner;

import mvc.controller.StudenteController;

public class Programma {

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		StudenteController controller = new StudenteController(input);
		
		String scelta = null;
		
		
		do {
			System.out.println("1) digita 1 per inserisci studente");
			System.out.println("2) digita 2 per mostra tutti");
			System.out.println("3) digita 3 per ricerca per matricola");
			System.out.println("99) digita 99 per uscire");
			
			
			scelta = input.nextLine();
			switch(scelta) {
			
				case "1":
					controller.insert();
					break;
				case "2":
					controller.findAll();
					break;
				case "3":
					controller.findByMatricola();
					break;
				case "99":
					break;
				default:
					System.out.println("Scelta non valida");
					
			}
			
			
			
			
			
		} while(!scelta.equals("99"));
		
		
		input.close();
		
		
		
		
		
		
		
	}

}
