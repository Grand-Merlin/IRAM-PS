import java.util.Scanner;

public class Ex1_16 {

	public static void main(String[] args) {
		//Variables locales
		int stock = 100;
		int choiceNbr = 0;
		Scanner sc = new Scanner(System.in);
		//Instructions 
		do {
			System.out.println("Entrez le nombre d’unités consommées");
			choiceNbr = sc.nextInt();
			if(choiceNbr <= stock && choiceNbr > 0) {
				stock -= choiceNbr;
				System.out.println("Nombre d’unités en stock " + stock);
			}else {
				System.out.println("saisie incorrecte");
			}
		} while(stock > 0);//fin do while
			System.out.println("Stock à 0 unités");
			
	}

}
