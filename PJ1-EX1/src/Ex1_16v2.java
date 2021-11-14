
public class Ex1_16v2 {

	public static void main(String[] args) {
		//Variables locales
		int stock = 100;
		int choiceNbr = 0;
		//Instructions
		do {
			choiceNbr = Utilities.getUser_IntInput("Entrez le nombre d’unités consommées",0 ,stock);
				//stock -= choiceNbr;
				System.out.println("Nombre d’unités en stock " + stock);
		}while(stock > 0);
		System.out.println("Stock à 0 unités");
		
	}
}
