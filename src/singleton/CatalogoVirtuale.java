package singleton;

import java.util.ArrayList;
import java.util.List;

public class CatalogoVirtuale {
	
	
	private static CatalogoVirtuale istanza=null; 
	private List<Prodotto> dati = new ArrayList<Prodotto>();

	
	
	private CatalogoVirtuale() {
		
		
	}
	
	
	
	public static CatalogoVirtuale dammiIstanza() {
		
		if(istanza==null) {
			istanza = new CatalogoVirtuale();	
		}
		
		
		
		return istanza;
		
		
		
	}
	
	public List<Prodotto> findAll(){
		return  dati;
	}
	
	public CatalogoVirtuale insert(Prodotto model){
		dati.add(model);
		
		return this;
	}
	
	
	
	
	

}
