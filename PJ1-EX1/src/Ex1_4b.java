import java.text.DecimalFormat;

public class Ex1_4b {

	public static void main(String[] args) {

		calculNet(100, 6);
		calculNet(125.5, 21);

	}// fin main

	static void calculNet(double prixBrut, double tauxTva) {
		
		//DecimalFormat DfFormat = new DecimalFormat ("0.00");
		double prixNet = 0.0;

		prixNet = prixBrut * (1 + tauxTva / 100);

		System.out.println("Pour un prix brut de " + prixBrut + "€, le prix net est de " + prixNet + "€");
	}//fin calculNet

}// fin class
