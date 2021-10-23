import java.util.Scanner;

public class Ex1_7_c {

	public static void main(String[] args) {
		
		//Variables locales
				double dbVat = 0.0;
				double dbGrossPrice = 0.0;
				//Instructions
				dbVat = Utilities.getUser_DoubleInput("Entrez le taux de TVA");
				dbGrossPrice = Utilities.getUser_DoubleInput("Entrez le prix BRUT");
				System.out.println("Pour un prix BRUT de " + dbGrossPrice + " €, et un taux de TVA de " + dbVat 
									+ " %, le prix Net est de " + computeNetPrice(dbGrossPrice, dbVat) + " €");

			}//fin main

			public static double computeNetPrice(double grossPrice, double vat) {
				//Variable locale
				//Instruction
				return grossPrice * (1 + (vat/100));
			}//fin computeNetPrice
}
