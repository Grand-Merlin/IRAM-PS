import java.util.Scanner;

public class Ex1_16 {

	public static void main(String[] args) {
		//Variables locales
		int stock = 100;
		int choiceNbr = 0;
		Scanner sc = new Scanner(System.in);
		//Instructions 
		do {
			System.out.println("Entrez le nombre d�unit�s consomm�es");
			choiceNbr = sc.nextInt();
			if(choiceNbr <= stock && choiceNbr > 0) {
				stock -= choiceNbr;
				System.out.println("Nombre d�unit�s en stock " + stock);
			}else {
				System.out.println("saisie incorrecte");
			}
		} while(stock > 0);//fin do while
			System.out.println("Stock � 0 unit�s");
			
	}

}
