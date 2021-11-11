import java.util.Scanner;

public class Ex1_17 {

	public static void main(String[] args) {
		
		getUserSpecificInput("Voici une question / A pour Annuler, V pour valider, Q pour quitter le programme", "AVQ");

	}
	public static String getUserSpecificInput(String question, String expectedAnswers) {
		//Variables locales 
		String choice;
		Scanner sc = new Scanner(System.in);
		//Instructions 

		do {
			System.out.println(question);

			choice = sc.next(); 

			if(choice.contains(expectedAnswers)) {
				System.out.println("Erreur de saisie, votre choix doit être parmi " + expectedAnswers + " , une seule lettre seulement");
				return "";
			}else {
				return choice;
			}//fin si

		}while (choice.contains(expectedAnswers) == false);//test push
	}//fin getUserSpecificInput



	 

}
