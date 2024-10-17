package test;

public class Tempo {

	private static int GIORNI=0;
	
	public static void main(String[] args) {
	
		
			int g = giorniPassati();
			
			System.out.println(g);
			System.out.println(giorniPassati());
			System.out.println(giorniPassati());

	}
	
	public static int giorniPassati() {
		
		int numero =(int) (Math.random()* 100);
		
		int add =0;
		
		if(numero<33) {
			add = 1;
		}
		if(numero>=33 && numero<66) {
			add = 2;
		}
		if(numero>=66) {
			add = 3;
		}
		GIORNI += add;
		return GIORNI;
		
	}
	
	

}
