
/*public class Ex1_18 {

	static String INPUT_STOCK_MSG = "Entrez le nombre initialement en stock";
	static String INPUT_MSG = "Entrez le nombre d�unit�s consomm�es.";
	static String ERR_INPUT = "Erreur de saisie";
	static String INFO_MSG = " Nombre d�unit�s en stock : ";
	static String NUL_STOCK_MSG = "Stock � 0";
	
	public static void main(String[] args) {
		int input =0;    
		int currentStock =Utilities.getUser_IntInput(INPUT_STOCK_MSG,0,ERR_INPUT); 

		while (currentStock > 0) {	
			//saisie utilisateur nombre d�unit�s consomm�es
			input = Utilities.getUser_IntInput( INPUT_MSG + INFO_MSG + currentStock, 0,
					                             currentStock,ERR_INPUT, ERR_INPUT);	
			currentStock -=  input;					
		}

		System.out.println(NUL_STOCK_MSG);

	}//fin main

}*/
