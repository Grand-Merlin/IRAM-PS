import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1_11_TEST_V2 {

	public static void main(String[] args) {
		//Variables locales
		final int MINVALUE = 1;
		final int MAXVALUE = 4;
		int checkUserInput = 0;
		boolean checkAnswerOk = false;
		DecimalFormat d = new DecimalFormat("0.00");
		//Instructions
		checkUserInput = getUser_IntInput ("N°1 Eau plate\nN°2 Coca Cola\nN°3 Bière pression\nN°4 Café long\n\nEntrez le N° de consommation", MINVALUE, MAXVALUE);
		if(checkUserInput == -1) {
			System.out.println("N° non référencé");
		}//fin if
		else {
			checkAnswerOk = checkAnswer("Happy Hour ? Y/N", "y");
			if(checkAnswerOk) {
				System.out.println("Prix de la consommation : " + displayDrink(checkUserInput) + d.format(computeHappyPrice(mergeIdDrinkStartingPrice(checkUserInput))) + " €");
			}//fin if
			else {
				System.out.println("Prix de la consommation : " + displayDrink(checkUserInput) + d.format(mergeIdDrinkStartingPrice(checkUserInput)) + " €");
			}//fin else

		}//fin else

	}//fin main
	public static int getUser_IntInput(String input, int minValue, int maxValue) {
		//Variables locales
		int intInput = 0;
		Scanner sc = new Scanner(System.in);
		//Instructions
		System.out.println(input);
		intInput = sc.nextInt();
		switch(intInput) {
		case 1 : return 1;
		case 2 : return 2;
		case 3 : return 3;
		case 4 : return 4;
		default :return -1;
		}//fin switch
	}//fin getUser_IntInput
	public static boolean checkAnswer(String answer, String response) {
		//Variables locales
		String checkY;
		Scanner sc = new Scanner(System.in);
		//Instructions
		System.out.println(answer);
		checkY = sc.next();
		if(checkY.equals(response)) {
			return true;
		}//fin if
		else {
			return false;
		}//fin else
	}//fin checkAnswer
	public static double computeHappyPrice(double startingPrice) {
		//Instructions
		return startingPrice/2;
	} // fin computeHappyPrice
	public static double mergeIdDrinkStartingPrice(int idDrink) {
		//Instructions
		if(idDrink == 1) {
			return 3.0;
		}//fin if
		else if(idDrink == 2) {
			return 3.0;
		}//fin else
		else if(idDrink == 3) {
			return 2.8;
		}//fin else
		else if(idDrink == 4) {
			return 2.9;
		}//fin else
		else {
			return 0.0;
		}//fin else
	}//fin mergeIdDrinkStartingPrice
	public static String displayDrink (int intIdDrink) {
		//Instructions
		if(intIdDrink == 1) {
			return "Eau plate ";
		}//fin if
		else if(intIdDrink == 2) {
			return "Coca Cola ";
		}//fin else if
		else if(intIdDrink == 3) {
			return "Bière pression ";
		}//fin else if
		else if(intIdDrink == 4) {
			return "Café long ";
		}//fin else if
		else {
			return "";
		}//fin else
	}//fin displayDrink

}
