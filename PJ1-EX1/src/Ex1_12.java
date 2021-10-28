import java.util.Scanner;

public class Ex1_12 {

	public static void main(String[] args) {
		double dblVAT, dblGrossPrice = 0.0;

		dblVAT = getVATChoice();
		if (dblVAT != -1.0) {
			dblGrossPrice = Utilities.getUser_DoubleInput("Entrez le prix brut");
			System.out.println("Pour un prix brut de " + dblGrossPrice + "€, le "
					+ "prix net est de " + 
					Utilities.computeNetPrice(dblGrossPrice, dblVAT) + "€"
					+ " (TVA " + dblVAT + "%)");
		}else {
			System.out.println("Saisie du taux incorrecte");
		}//end if

	}//fin main
	static double getVATChoice() {

		final double VAT[] = {6.0, 12.0, 21.0};

		int intUserChoice=0;

		System.out.println("Pour une TVA à " + VAT[0] + "% tapez 1, "
				+ "pour " + VAT[1] + "% tapez 2 et pour " + VAT[2] + "%, tapez 3");
		Scanner sc = new Scanner (System.in);
		intUserChoice = sc.nextInt();

		/*if (intUserChoice >= 1 && intUserChoice <= VAT.length ) {
			return VAT[intUserChoice-1];
		}else {
			return -1.0;
		}//end if */

      return (intUserChoice >= 1 && intUserChoice <= VAT.length)? VAT[intUserChoice-1]:-1.0;

	}//end getVATChoice

}
