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
}
















