import java.util.Scanner;

public class Ex1_7_b {

	public static void main(String[] args) {
		//Variables locales
		double dbVat = 0.0;
		double dbGrossPrice = 0.0;
		//Instructions
		dbVat = getUserVatInput();
		dbGrossPrice = getUserGrossPriceInput();
		System.out.println("Pour un prix BRUT de " + dbGrossPrice + " €, et un taux de TVA de " + dbVat 
							+ " %, le prix Net est de " + computeNetPrice(dbGrossPrice, dbVat) + " €");

	}//fin main

	public static double computeNetPrice(double grossPrice, double vat) {
		//Variable locale
		//Instruction
		return grossPrice * (1 + (vat/100));
	}//fin computeNetPrice
	
	public static double getUserGrossPriceInput() {
		//Variable locales
		double userGrossPrice = 0.0;
		Scanner sc = new Scanner(System.in);
		//Instruction
		System.out.println("Entrez le prix BRUT");
		userGrossPrice = sc.nextDouble();
		return userGrossPrice;
	} //getUserGrossPriceInput
	
	public static double getUserVatInput() {
		//Variable locale
		double userVat = 0.0;
		Scanner sc = new Scanner(System.in);
		//Instruction
		System.out.println("Entrez le taux de TVA");
		userVat = sc.nextDouble();
		return userVat;
	}//fin getUserVatInput

}
