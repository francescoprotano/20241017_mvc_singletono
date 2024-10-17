package mvc.controller;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mvc.view.StudenteView;
import no_mvc.Studente;

public class StudenteController {
	
	private List<Studente> dati = new ArrayList<Studente>();
	
	public void insert() {
		
		Studente model = new Studente();
		StudenteView view = new StudenteView();
		view.insert(model);
		
		dati.add(model);
		
		
		view.print(model);
		
		
		
	}
	public void findAll() {
		
		StudenteView view = new StudenteView();
		view.findAll(dati);
		
		
	}
	
	
	public void findByMatricola() {
		
		
		
		
		StudenteView view = new StudenteView();
		Studente model = new Studente();
		view.findByMatricola(model);
		
		String matricola = model.getMatricola();
		
		Studente studenteTrovato = null;
		for(Studente s : dati) {
			if(s.getMatricola().equals(matricola)) {
				studenteTrovato = s;
				break;
			}
		}
		
		
		if(studenteTrovato!=null) {
		
			view.print(studenteTrovato);
		} else {
			view.printNotFound();
		}
		
	}
 public void findByMatricola2() {
		
		
		
		
		StudenteView view = new StudenteView();
		String matricola = view.findByMatricola2();
		
		
		
		Studente studenteTrovato = null;
		for(Studente s : dati) {
			if(s.getMatricola().equals(matricola)) {
				studenteTrovato = s;
				break;
			}
		}
		
		
		if(studenteTrovato!=null) {
		
			view.print(studenteTrovato);
		} else {
			view.printNotFound();
		}
		
	}


}
