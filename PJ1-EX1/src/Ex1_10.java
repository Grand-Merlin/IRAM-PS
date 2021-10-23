import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1_10 {

	public static void main(String[] args) {
		//Variables locales
		double dbPrixBrut = 0.0;
		double dbTva = 0.0;
		DecimalFormat d = new DecimalFormat("0.00");
		//Instructions
		dbTva = getVatChoice();
		if (dbTva != -1.0) {
			dbPrixBrut = Utilities.getUser_DoubleInput("Entrer un prix BRUT");
			System.out.println("Pour un prix BRUT de " + dbPrixBrut + ", le prix NET est de " 
					+ d.format(Utilities.computeNetPrice(dbPrixBrut, dbTva))
					+ " € (TVA " + dbTva +" %)");
		}//fin if

	}//fin main
	
	/**
	 * renvoie le taux de TVA choisi 
	 * @return le taux de TVA ou -1
	 */
	public static double getVatChoice() {
		//Variables locales
		int choix = 0;
		Scanner sc = new Scanner (System.in);
		//Instructions
		System.out.println("Pour un taux de TVA de 6% tapez 1, 2 pour 12% et 3 pour 21%");
		choix = sc.nextInt();
		
		if(choix < 1 || choix > 3) {
			System.out.println("Saisie du taux incorrecte");
			return -1.0;
		}//fin if
		else if(choix == 1) {
			return 6.0;
		}//fin else if
		else if(choix == 2) {
			return 12.0;
		} 
		else {
			return 21.0;
		}//end if
			
	}//fin getVatChoice
}
