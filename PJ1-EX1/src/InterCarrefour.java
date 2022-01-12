public class InterCarrefour {

	//Constantes globales
	public static int NBR_OF_WINNER = 500;
	public static int FIRST_WIN = 5;
	public static int SECOND_WIN = 2;
	public static int LENGTH_OF_TICKET = 8;
	public static int PROBABILITY_FIRST_WIN = 1;
	public static int PROBABILITY_SECOND_WIN = 1;
	public static int TICKET_NO_PLAY = -1;
	public static String MESS_AWAITING = "Numéro validé, attention tirage au sort en cours...";
	public static String MESS_LOSE = "Pas de chance, vous n'avez pas gagné ! Revenez nous voir pour tenter votre chance";
	public static String END_MESS = " ----------- Merci de votre visite à bientôt ------- ";
	public static String WIN_MESS_FIRST = "Bravo vous avez gagné un bon d'achat de " + FIRST_WIN + "€ !";
	public static String WIN_MESS_SECOND = "Bravo vous avez gagné un bon d'achat de " + SECOND_WIN + "€ !";
	public static String INVALID_TICKET = "Ce numéro n’est pas valide, vous trouverez votre numéro à " + LENGTH_OF_TICKET + (LENGTH_OF_TICKET > 1? " chiffres":" chiffre") + " sur le ticket de caisse";
	public static String WELCOM_MESS = "Tentez votre chance et entrez votre numéro de ticket ";
	public static String ALREADY_USE_MESS = "Ce numéro a déjà été utilisé, vous ne pouvez jouer qu’une seule fois";



	public static void main(String[] args) {
		//Variables locales
		String[]numbersToPlay;
		int[] activityNumbers;
		String numTicket = "";
		int gain = 0;
		//Instructions
		numbersToPlay = new String[NBR_OF_WINNER];
		numbersToPlay = initialNumbersToPlay(numbersToPlay);
		numbersToPlay = generateNumbersToPlay(numbersToPlay);
		activityNumbers = new int [NBR_OF_WINNER];
		activityNumbers = initialActivityNumbers(activityNumbers);
		do {
			do {
				numTicket = Utilities.getUser_StringInput(WELCOM_MESS);
				if(numTicket.length() < LENGTH_OF_TICKET || numTicket.length() > LENGTH_OF_TICKET) {
					System.out.println(INVALID_TICKET);
				}//FIN SI
			}while(numTicket.length() < LENGTH_OF_TICKET || numTicket.length() > LENGTH_OF_TICKET);
			if(!Utilities.isInTabString(numbersToPlay, numTicket)) {
				System.out.println(MESS_LOSE + "\n\n" + END_MESS);
			}else {
				if(!alreadyUseTicket(activityNumbers, numbersToPlay, numTicket)) {
					gain  = computeGain();
				}else {
					System.out.println(ALREADY_USE_MESS + "\n\n" + END_MESS);
				}//FIN SI
				activityNumbers = majActivityNumbers(numTicket, gain,activityNumbers, numbersToPlay);
			}//FIN SI 
		}while(!ckeckAllTicketPlay(activityNumbers));
	}//FIN main



	public static String[] generateNumbersToPlay(String[] numbersToPlay) {
		//Variables locales
		String random = "";
		//Instructions
		for(int i = 0; i < numbersToPlay.length; i++) {
			random = generateRandomStringOfNumber(numbersToPlay);
			if(!Utilities.isInTabString(numbersToPlay, random)) {
					numbersToPlay[i] = random;
				}else {
					i--;
			}//FIN SI
		}//FIN POUR
		return numbersToPlay;

	}//FIN generateNumbersToPlay



	public static int[] majActivityNumbers(String numTicket, int gain, int[] activityNumbers, String[]numbersToPlay) {
		//Variables locales
		//Instructions
		for(int i = 0; i < numbersToPlay.length; i++) {
			if(numTicket.equals(numbersToPlay[i]) ) {
				activityNumbers [i] = gain;
			}//FIN SI
		}//FIN POUR
		return activityNumbers;
	}//FIN majActivityNumbers



	public static String[] initialNumbersToPlay(String[]numbersToPlay) {
		//Variables locales
		//Instructions
		for(int i = 0; i < numbersToPlay.length; i++) {
			numbersToPlay[i] = "-1";
		}//FIN POUR
		return numbersToPlay;
	}//FIN initialActivityNumbers
	
	
	public static int[] initialActivityNumbers(int[]activityNumbers) {
		//Variables locales
		//Instructions
		for(int i = 0; i < activityNumbers.length; i++) {
			activityNumbers[i] = TICKET_NO_PLAY;
		}//FIN POUR
		return activityNumbers;
	}//FIN initialActivityNumbers


	public static int computeGain() {
		//Variables locales
		//Instructions
		if(Utilities.randInt(1, PROBABILITY_FIRST_WIN) == Utilities.randInt(1, PROBABILITY_FIRST_WIN)) {
			System.out.println(MESS_AWAITING + "\n" + WIN_MESS_FIRST + "\n\n" + END_MESS);
			return FIRST_WIN;
		}//FIN SI
		if(Utilities.randInt(1, PROBABILITY_SECOND_WIN) == Utilities.randInt(1, PROBABILITY_SECOND_WIN)) {
			System.out.println(MESS_AWAITING + "\n" + WIN_MESS_SECOND + "\n\n" + END_MESS);
			return SECOND_WIN;
		}else{
			System.out.println(MESS_AWAITING + "\n" + MESS_LOSE + "\n\n" + END_MESS);
			return 0;
		}//FIN SI
	}//FIN computeGain



	public static boolean ckeckAllTicketPlay(int[]activityNumbers) {
		//Variables locales
		//Instructions
		for(int i = 0; i < activityNumbers.length; i++) {
			if(activityNumbers[i] == TICKET_NO_PLAY) {
				return false;
			}//FIN SI
		}//FIN POUR
		return true;
	}//FIN ckeckAllTicketPlay



	public static String generateRandomStringOfNumber(String[] numbersToPlay) {
		//Variables locales
		String finalString = "";
		//Instructions
		do {
			finalString += Integer.toString(Utilities.randInt(0, 9));
		}while(finalString.length() < LENGTH_OF_TICKET );
		return finalString;
	}//FIN generateRandomStringOfNumber



	public static boolean alreadyUseTicket(int[]activityNumbers, String[]numbersToPlay, String numTicket) {
		//Variables locales
		//Instructions
		for(int i = 0; i < numbersToPlay.length; i++) {
			if(numbersToPlay[i].contains(numTicket)) {
				if(activityNumbers[i] == TICKET_NO_PLAY) {
					return false;
				}//FIN SI
			}//FIN SI
		}//FIN POUR
		return true;
	}//FIN alreadyUseTicket

}
