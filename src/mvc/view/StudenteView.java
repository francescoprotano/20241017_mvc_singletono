package mvc.view;

import java.util.List;
import java.util.Scanner;

import no_mvc.Studente;

public class StudenteView {
	private Scanner input;
	
	public StudenteView(Scanner input) {
		this.input = input;
	}
	
	
	
	public void insert(Studente model) {

		
		System.out.println("Digita matricola:");//anche questa finisce nella view
		String matricola = input.nextLine();//anche questa finisce nella view
		
		System.out.println("Digita nome:");//anche questa finisce nella view
		String nome = input.nextLine();//anche questa finisce nella view
		
		System.out.println("Digita cognome:");//anche questa finisce nella view
		String cognome = input.nextLine();//anche questa finisce nella view
		
		
		model.setCognome(cognome);
		model.setMatricola(matricola);
		model.setNome(nome);
		
		
		
		
		
	}
	
	public void print(Studente model) {
		
		System.out.println(model.getCognome() + ", " + model.getNome());
		
	}
	
	public void findAll(List<Studente> dati) {
		
		for(Studente model : dati) {
			print(model);
			
		}
		
		
	}
	
	
	public void findByMatricola(Studente model) {
		String matricola = input.nextLine();//questa finisce nella view
		model.setMatricola(matricola);
		
		
		
	}
	
	public String findByMatricola2() {
		Scanner input = new Scanner(System.in);//questa finisce nella view
		String matricola = input.nextLine();//questa finisce nella view
		
		return matricola;
		
	}
	
	
	public void printNotFound() {
		System.out.println("non trovato");
		
	}



}
