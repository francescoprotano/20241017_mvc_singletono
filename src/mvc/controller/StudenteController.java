package mvc.controller;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mvc.StudenteCRUD;
import mvc.exception.NotFoundError;
import mvc.view.StudenteView;
import no_mvc.Studente;

public class StudenteController {
	
	
	private Scanner input;
	
	public StudenteController(Scanner input) {
		this.input = input;
	}
	
	
	public void insert() {
		
		Studente model = new Studente();
		StudenteView view = new StudenteView(input);
		view.insert(model);
		
		StudenteCRUD.getInstance().insert(model);
		
		
		view.print(model);
		
		
		
	}
	public void findAll() {
		
		StudenteView view = new StudenteView(input);
		
		view.findAll(StudenteCRUD.getInstance().findAll());
		
		
	}
	
	
	public void findByMatricola() {
		
		
		
		
		StudenteView view = new StudenteView(input);
		Studente model = new Studente();
		view.findByMatricola(model);
		
		String matricola = model.getMatricola();
		
		
		
		Studente studenteTrovato;
		try {
			studenteTrovato = StudenteCRUD.getInstance().findByMatricola(matricola);
			view.print(studenteTrovato);
		} catch (NotFoundError e) {
			view.printNotFound();
		}
		
		
		
	}
 public void findByMatricola2() {
		
		
		
		
		StudenteView view = new StudenteView(input);
		String matricola = view.findByMatricola2();
		
		
		
		Studente studenteTrovato;
		try {
			studenteTrovato = StudenteCRUD.getInstance().findByMatricola(matricola);
				
			view.print(studenteTrovato);
			
			
		} catch (NotFoundError e) {
			view.printNotFound();
		}
		
		
		
	}


}
