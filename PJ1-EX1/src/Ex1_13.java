
public class Ex1_13 {

	public static void main(String[] args) {
		//Variables locales
		final int NUM_MIN = 1, NUM_MAX = 4;
		final double PRICES[] = {3.00, 3.00, 2.80, 2.90};
		final String NAMES[] = {"Eau plate", "Coca-cola", "Bière pression", "Café long"};
		final double PCT_REMISE_HAPPY_HOUR = 50.0;
		
		int choixConso = -1;
		double dbDrink = 0.0;
		
		//Instructions
		choixConso = Utilities.getUser_IntInput("Entrez le N° de consommation", NUM_MIN, NUM_MAX);
		if (choixConso != -1) {
			/*if(Utilities.checkAnswer("Happy hour ? Y/N", "Y")){
				dbDrink = PRICES[choixConso - 1] * PCT_REMISE_HAPPY_HOUR/100;
			}
			else {
				dbDrink = PRICES[choixConso - 1] * 1.0;
			}*/
			
			dbDrink = PRICES[choixConso - 1] * (Utilities.checkAnswer("Happy hour ? Y/N", "Y")?PCT_REMISE_HAPPY_HOUR/100:1.0);
			//dbDrink = PRICES[choixConso - 1] * (Utilities.checkAnswer("Happy hour ? Y/N", "Y")? PCT_REMISE_HAPPY_HOUR/100 : 1.0);
			System.out.println("Prix de la consommation " + NAMES[choixConso - 1] + " : " + dbDrink + " €");
		}

	}

}
