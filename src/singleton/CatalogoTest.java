package singleton;

import java.util.List;

public class CatalogoTest {

	public static void main(String[] args) {
		CatalogoVirtuale catalogo = CatalogoVirtuale.dammiIstanza();
		System.out.println(catalogo);
		
		CatalogoVirtuale catalogo2 = CatalogoVirtuale.dammiIstanza();
		System.out.println(catalogo2);
		
		
		catalogo2.insert(new Prodotto());
		catalogo.insert(new Prodotto());
		
		List<Prodotto> prodotti = catalogo2.findAll();
		System.out.println(prodotti.size());
		
		CatalogoVirtuale.dammiIstanza().insert(new Prodotto());
		System.out.println(prodotti.size());
		
		prodotti = CatalogoVirtuale.dammiIstanza().insert(new Prodotto()).insert(new Prodotto())
		.insert(new Prodotto()).findAll();
		
		
	}

}
