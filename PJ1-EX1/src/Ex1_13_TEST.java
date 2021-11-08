/*import java.util.Scanner;

public class Ex1_13_TEST {

	public static void main(String[] args) {
		//Variables locales
		final int NUM_MAX = 1, NUM_MIN = 4;
		final double PCT_REMISE_HAPPY_HOUR = 50.0;
		String namesTab[] = {"Eau plate","Coca Cola","Bière pression", "Café long"};
		double pricesTab[] = {3.0,3.0, 2.8, 2.9};
		int choixConso = -1;
		double dblDrink = 0.0;
		boolean bDrinkChoiceOk = false;
		double discount = 0.0;
		String drinkName = "";
		//Instructions
		choixConso = getUser_intInput("Entrez le N° de consommation", 1, 4);
		
		if(choixConso !=1) {
			dblDrink = pricesTab[choixConso - 1] * 
		} else {
			System.out.println("N° non référencé");
		}
		}	
		if (bDrinkChoiceOk) {
			if (Utilities.checkAnswer("Happy Hour? Y/N","y") == true) {
				discount = PCT_REMISE_HAPPY_HOUR/100;
			}
			else {
				discount = 1;
			}//fin si
			dblDrink *= discount;
			System.out.println("Prix de la consommation " + drinkName + " : " + dblDrink + " €");
		}//fin si
		

	}//fin main
	
	public static int getUser_intInput(String txtInvit, int min, int max) {
		//Variables locales
		int intInput = 0;
		Scanner sc = new Scanner(System.in);
		//Instructions
		System.out.println(txtInvit);
		intInput = sc.nextInt();
		if(intInput < min || intInput > max) {
			System.out.println("Saisie incorrecte");
			return -1;
		} else {
			return intInput;
		}//fin if
	}//fin getUser_intInput

}*/
