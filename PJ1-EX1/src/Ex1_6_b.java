import java.util.Scanner;

public class Ex1_6_b {

	public static void main(String[] args) {
		
		double dbNetPrice = 0.0;
		double dbVat = 0.0;
		
		//instruction
		dbNetPrice = getUserNetPriceInput();
		dbVat = 21.0;
		
		System.out.println("Pour un prix net de " + dbNetPrice + "€, et une TVA de " 
							+ dbVat + "%, le coût de la TVA s'éleve à " + vatCostCompute(dbNetPrice, dbVat) + " €");

	}
	
	public static double vatCostCompute (double NetPrice, double vat) {
		
		//instruction
		return NetPrice * (vat/(100 + vat));
	}// fin vatCostCompute
	
	public static double getUserNetPriceInput() {
		//variable locale
		double netPrice = 0.0;
		//instruction
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un prix net");
		netPrice = sc.nextInt();
		return netPrice;
		
		
	}// fin getUserNetPriceInput

}
