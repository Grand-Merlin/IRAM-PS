
public class Ex1_16v2 {

	public static void main(String[] args) {
		//Variables locales
		int stock = 100;
		int choiceNbr = 0;
		//Instructions
		do {
			choiceNbr = Utilities.getUser_IntInput("Entrez le nombre d�unit�s consomm�es",0 ,stock);
				//stock -= choiceNbr;
				System.out.println("Nombre d�unit�s en stock " + stock);
		}while(stock > 0);
		System.out.println("Stock � 0 unit�s");
		
	}
}
