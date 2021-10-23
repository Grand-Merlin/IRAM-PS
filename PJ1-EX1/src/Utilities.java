import java.util.Scanner;

public class Utilities {
	
	/**
	 * Retourne une saisie sur base d'une question pass�e en parametre
	 * @param input une question
	 * @return la saisie
	 */
	public static double getUser_DoubleInput(String input) {
		//Variable locales
		double saisie = 0;
		Scanner sc = new Scanner(System.in);
		//Instruction
		System.out.println(input);
		saisie = sc.nextDouble();
		return saisie;
	}//fin getUser_doubleInput
	
	/**
	 * Calcule le prix NET pour un prix BRUT et un taux de TVA donn�
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
	 * Calcule le montant de TVA pour un prix NET et un taux de TVA donn�
	 * @param NetPrice
	 * @param vat
	 * @return montant de TVA = NET * (taux de TVA/(100 + taux de TVA)
	 */
	public static double vatCostCompute (double NetPrice, double vat) {
		
		//instruction
		return NetPrice * (vat/(100 + vat));
	}// fin vatCostCompute

}
