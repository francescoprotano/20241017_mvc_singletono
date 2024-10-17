package mvc;

import java.util.ArrayList;
import java.util.List;

import mvc.exception.NotFoundError;
import no_mvc.Studente;

public class StudenteCRUD {
	
	
	private List<Studente> dati = new ArrayList<Studente>();
	private static StudenteCRUD instance = null;
	
	
	private StudenteCRUD() {
		
	}
	
	
	public static StudenteCRUD getInstance() {
	
		if(instance==null) {
			instance = new StudenteCRUD();
		}
		
		return instance;
	}
	
	public void insert(Studente model) {
		dati.add(model);
	}
	
	public List<Studente> findAll() {
		return dati;
	}
	
	public Studente findByMatricola(String matricola) throws NotFoundError {
		
		
		Studente studenteTrovato = null;
		for(Studente s : dati) {
			if(s.getMatricola().equals(matricola)) {
				studenteTrovato = s;
				break;
			}
		}
		
		
		if(studenteTrovato==null) {
			throw new  NotFoundError();
		}
		
		return studenteTrovato;
		
	}
	
	
	

}
