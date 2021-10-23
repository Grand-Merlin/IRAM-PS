import java.util.Scanner;

public class Ex1_9 {

	public static void main(String[] args) {
		//Variables locales
		final int NUMMAX = 20;
		int intNumTable = 0;
		//Instructions
		intNumTable = getAndCheckTableNumber(NUMMAX);
		if(intNumTable != -1) {
			System.out.println("Vous avez entré le numéro de table " + intNumTable);
		}
	}//fin main
	
	public static int getAndCheckTableNumber(int totalTable) {
		//Variables locales
		
		int numTable = 0;
		Scanner sc = new Scanner(System.in);
		//Instructions
		System.out.println("Entrez le numéro de table");
		numTable = sc.nextInt();
		
		if(numTable < 1) {
			System.out.println("Saisie incorrecte ! Le N° de table doit être supérieur ou égal à 1");
			return -1;
		}
		else if (numTable > totalTable) {
			System.out.println("Saisie incorrecte ! Le N° table le plus élevé est " + totalTable + " Contactez l’administrateur du programme si vous souhaitez augmenter ce nombre");
			return -1;
		} else return numTable;
		
	}


}
