import java.util.Scanner;

public class Ex1_11 {

	public static void main(String[] args) {
		//Variables locales
		final int NUM_MAX = 1, NUM_MIN = 4;
		final double dblDrink_1 = 3.0, dblDrink_2 = 3.0, dblDrink_3 = 2.8, dblDrink_4 = 2.9;
		final String drink_1 = "Eau plate", drink_2 = "Coca-cola", drink_3 = "Bière pression", drink_4 = "Café long";
		final double PCT_REMISE_HAPPY_HOUR = 50.0;
		int choixConso = -1;
		double dblDrink = 0.0;
		boolean bDrinkChoiceOk = false;
		double discount = 0.0;
		String drinkName = "";
		//Instructions
		choixConso = getUser_intInput("Entrez le N° de consommation", 1, 4);
		switch(choixConso) {
			case 1:
				dblDrink = dblDrink_1;
				drinkName = drink_1;
				bDrinkChoiceOk = true;
				break;
			case 2:
				dblDrink = dblDrink_2;
				drinkName = drink_2;
				bDrinkChoiceOk = true;
				break;
			case 3:
				dblDrink = dblDrink_3;
				drinkName = drink_3;
				bDrinkChoiceOk = true;
				break;
			case 4:
				dblDrink = dblDrink_4;
				drinkName = drink_4;
				bDrinkChoiceOk = true;
				break;
			default:
				System.out.println("N° non référencé");
		}//fin switch
		if (bDrinkChoiceOk) {
			if (checkAnswer("Happy Hour? Y/N","y") == true) {
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
	
	public static boolean checkAnswer(String txtQuestion, String txtReponse) {
		//Variables locales
		String answer;
		Scanner sc = new Scanner(System.in);
		//Instructions
		System.out.println(txtQuestion);
		answer = sc.next();
		return (answer.equals(txtReponse));
	}//fin checkAnswer

}
