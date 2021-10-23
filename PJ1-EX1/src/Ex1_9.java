import java.util.Scanner;

public class Ex1_9 {

	public static void main(String[] args) {
		//Variables locales
		final int NUMMAX = 20;
		int intNumTable = 0;
		//Instructions
		intNumTable = getAndCheckTableNumber(NUMMAX);
		if(intNumTable != -1) {
			System.out.println("Vous avez entr� le num�ro de table " + intNumTable);
		}
	}//fin main
	
	public static int getAndCheckTableNumber(int totalTable) {
		//Variables locales
		
		int numTable = 0;
		Scanner sc = new Scanner(System.in);
		//Instructions
		System.out.println("Entrez le num�ro de table");
		numTable = sc.nextInt();
		
		if(numTable < 1) {
			System.out.println("Saisie incorrecte ! Le N� de table doit �tre sup�rieur ou �gal � 1");
			return -1;
		}
		else if (numTable > totalTable) {
			System.out.println("Saisie incorrecte ! Le N� table le plus �lev� est " + totalTable + " Contactez l�administrateur du programme si vous souhaitez augmenter ce nombre");
			return -1;
		} else return numTable;
		
	}


}
