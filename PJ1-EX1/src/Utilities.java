import java.util.Random;
import java.util.Scanner;

public class Utilities {

	/**
	 * Retourne une saisie sur base d'une question passée en parametre
	 * @param input une question
	 * @return la saisie
	 */
	public static double getUser_DoubleInput(String input) {
		//Variable locales
		double saisie = 0.0;
		Scanner sc = new Scanner(System.in);
		//Instruction
		System.out.println(input);
		saisie = sc.nextDouble();
		return saisie;
	}//fin getUser_doubleInput

	/**
	 * Retourne une saisie sur base d'une question passée en parametre
	 * @param input une question
	 * @return la saisie
	 */
	public static int getUser_IntInput(String input) {
		//Variable locales
		int saisie = 0;
		Scanner sc = new Scanner(System.in);
		//Instruction
		System.out.println(input);
		saisie = sc.nextInt();
		return saisie;
	}//fin getUser_IntInput


	/**
	 * Calcule le prix NET pour un prix BRUT et un taux de TVA donné
	 * @param grossPrice
	 * @param vat
	 * @return NET = BRUT * (1 + (taux de TVA/100)
	 */
	public static double computeNetPrice(double grossPrice, double vat) {
		//Variable locale
		//Instruction
		return grossPrice * (1 + (vat/100));
	}//fin computeNetPrice


	/**
	 * Calcule le montant de TVA pour un prix NET et un taux de TVA donné
	 * @param NetPrice
	 * @param vat
	 * @return montant de TVA = NET * (taux de TVA/(100 + taux de TVA)
	 */
	public static double vatCostCompute (double NetPrice, double vat) {

		//instruction
		return NetPrice * (vat/(100 + vat));
	}// fin vatCostCompute


	/**
	 * compare txtQuestion and txtReponse
	 * @param txtQuestion
	 * @param txtReponse
	 * @return
	 */

	public static boolean checkAnswer(String txtQuestion, String txtReponse) {
		//Variables locales
		String answer;
		Scanner sc = new Scanner(System.in);
		//Instructions
		System.out.println(txtQuestion);
		answer = sc.next();
		return (answer.trim().equalsIgnoreCase(txtReponse.trim().toUpperCase()));
	}//fin checkAnswer




	public static int getUser_IntInput(String input, int min, int max) {
		//Variables locales
		int saisie = 0;
		Scanner sc = new Scanner(System.in);
		//Instructions
		do {
			System.out.println(input);
			saisie = sc.nextInt();
			if(saisie < min || saisie > max) {
				System.out.println("Saisie incorrecte");
			}
		}while (saisie < min || saisie > max);
		return saisie;

	}
	public static double getUser_DoubleInput(String input, int min, int max) {
		//Variables locales
		double saisie = 0;
		Scanner sc = new Scanner(System.in);
		//Instructions
		do {
			System.out.println(input);
			saisie = sc.nextInt();
			if(saisie < min || saisie > max) {
				System.out.println("Saisie incorrecte");
			}
		}while (saisie < min || saisie > max);
		return saisie;

	}


	//surcharge de méthode getUser_intInput cette fois sans valeur maximum comme 3ème paramètre
	public static int getUser_IntInput(String msg, int min) {
		int intInput=0;
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		intInput = sc.nextInt();
		if (intInput >= min) {
			return intInput;
		}else {
			return -1;
		}
	}//fin getUser_intInput
	/**
	 * Retourne une chaine de caractere sur base d'une question posée en parametre
	 * @param msg
	 * @return
	 */
	public static String getUser_StringInput(String msg) {
		String stringInput = "";
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		stringInput = sc.next();
		return stringInput;
	}//fin getUser_StringInput


	public static String getUserSpecificInput(String msg, String expectedAnswers ) {

		String strAnswer;
		Scanner sc= new Scanner(System.in);

		do {

			System.out.println(msg);
			strAnswer= sc.next().trim().toUpperCase();
			//if only one char and if this char is in the expected answer string
			if (strAnswer.length()==1 && expectedAnswers.toUpperCase().indexOf(strAnswer)>= 0 ) {
				return strAnswer;

			}else{
				System.out.println("Erreur de saisie, votre choix doit être parmi " + expectedAnswers  + " une lettre seulement");
			}

		}while (true);//end do while
	}

	/**
	 * renvoie un nombre aléatoire entre un min et un max donné
	 */
	public static int randInt(int min, int max) {

		Random rand = new Random();
		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min)+1) + min;
		return randomNum;
	}//en randInt


	public static String getUserIntorSpecificInput(String msg ,String expectedAnswers,int min , int max ) {
		int input = 0;
		String answer = "";
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(msg);
			if (sc.hasNextInt()==true) {
				input = sc.nextInt();
				if (input<min||input>max) {
					System.out.println("Le nombre doit être compris entre " + min + " et " + max);
				}else {
					return Integer.toString(input);
				}
			}else {
				answer = sc.next().trim().toUpperCase();
				if (answer.length() == 1 && expectedAnswers.toUpperCase().indexOf(answer) >= 0) {
					return answer;
				} else {
					System.out.println("Erreur de saisie, votre choix doit être parmi " + expectedAnswers + " une lettre seulement");
				}
			}

		}while (true);
	}


	public static String getUserIntorSpecificInput(String msg ,String expectedAnswers,int min ) {
		int input = 0;
		String answer = "";
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(msg);
			if (sc.hasNextInt()==true) {
				input = sc.nextInt();
				if (input<min) {
					System.out.println("Le nombre doit être superieur a " + min);
				}else {
					return Integer.toString(input);
				}
			}else {
				answer = sc.next().trim().toUpperCase();
				if (answer.length() == 1 && expectedAnswers.toUpperCase().indexOf(answer) >= 0) {
					return answer;
				} else {
					System.out.println("Erreur de saisie, votre choix doit être parmi " + expectedAnswers + " une lettre seulement");
				}
			}

		}while (true);
	}

	/**
	 * Renvoye l'entier max trouvé dans le tableau passer en parametre
	 */
	public static int findIntMaxInTab(int arr[]) {
		//Variables locales
		int max = 0;
		//Instructions
		max = arr[0];
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i + 1] > max){
				max = arr[i + 1];
			}//FIN SI
		}//FIN POUR
		return max;
	}//FIN findMaxInTab

	public static boolean isAlreadyInTab(int x, int y , int tab[][]) {


		for(int i=0;i< tab.length;i++) {

			if (tab[i][0]==x && tab[i][1]==y) {
				return true;
			}
		}
		return false;

	}//FIN isAlreadyInTab



	public static String placeNumberRank(int rank, String namesString, String stocksString) {
		//Variables locales
		String space = " ";
		int nbrOfSpace = 0;
		String finalString ="";
		//Instructions
		nbrOfSpace = rank - (namesString.length() + stocksString.length());

		for(int i = 0; i < nbrOfSpace; i++) {
			finalString = finalString.concat(space);
		}//FIN POUR
		return namesString.concat(finalString).concat(stocksString);

	}//FIN placeNumberRank


	public static boolean isInTab(int[] tab, int num) {
		//Variables locales
		//Instructions
		for(int i = 0; i < tab.length; i++) {
			if(tab[i] == num) {
				return true;
			}//FIN SI
		}//FIN POUR
		return false;
	}//FIN isInTab
	
	public static boolean isInTabString(String[] tab, String num) {
		//Variables locales
		//Instructions
		for(int i = 0; i < tab.length; i++) {
			if(tab[i].contains(num)) {
				return true;
			}//FIN SI
		}//FIN POUR
		return false;
	}//FIN isInTab



	public static String getUser_StringInput(String input, int min, int max) {
		//Variables locales
		String saisie = "";
		Scanner sc = new Scanner(System.in);
		//Instructions
		do {
			System.out.println(input);
			saisie = sc.next();
			if(Integer.parseInt(saisie) < min || Integer.parseInt(saisie) > max) {
				System.out.println("Saisie incorrecte");
			}
		}while (Integer.parseInt(saisie) < min || Integer.parseInt(saisie) > max);
		return saisie;

	}
}
















