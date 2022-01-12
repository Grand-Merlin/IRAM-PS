
public class pendu {

	//Constantes globales
	public static String WELCOM_MESS = "------Bonjour, bienvenue sur le jeu du pendu------";
	public static String[] DICTIONNARY = {"ROSIE", "DORIANE", "FRANCOIS", "KAYAK", "MEEKO", "CIRQUE",
			"COUCHE","SCIENCE","VAMPIRE","ARTIFICE","GUIDON","INVESTISSEMENT","DESSERT","ORCHESTRE",
			"CLIN","COULEUR","COUDE","AVIONS","ABROGATION","RACCOURCI","DERRIÈRE","COUVERT","MONTAGNE","VASE",
			"PREMIER","DEVIN","CITROUILLE","ARCHE","OASIS","BALEINE","SUIVRE","COASSEMENT","EPERONS", "DOIGT",
			"ESCORTE","NOVICE","HALETER","LAC","PANIER","OBJECTIFS","AMEUBLEMENT","GRENADE","BANLIEUE","BARRE",
			"PENSER","CLIMATISATION","AVIONS","TROLLEYBUS","PIPI","PROMETTRE","TOILE","SONDAGE","FOUDRE","MER",
			"BRANCHER","APPAREIL","FRIT","GARGANTUESQUE","MODIFIER","SONDAGE","MAMMIFÈRE","VISITEUR",
			"COFFRE","MOLAIRE"};
	
	public static int NBR_OF_TRY = 6;
	public static String MESS_NBR_OF_TRY = "Nombre d'essais restant : ";
	public static String LETTER_ALREADY_USE_MESS = "Lettre déja utilisée";

	public static void main(String[] args) {
		//Variables locales
		String word = "";
		String letter = "";
		String hideWord = "";
		int[] indexOfLetter;
		int countOfLetterFind = 0;
		String[] letterAlreadyUse;
		//Instructions
		System.out.println(WELCOM_MESS);
		word = chooseWordInDico();
		hideWord = computeHideWord(word);
		letterAlreadyUse = new String[] {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"};
		do {
			System.out.println(MESS_NBR_OF_TRY + NBR_OF_TRY);
			showGallows();
			System.out.println(hideWord);
			do {
				letter = Utilities.getUser_StringInput("Entrez une lettre");
			}while(checkIfLetterAlreadyUse(letterAlreadyUse, letter));
			letterAlreadyUse = completeLetterAlreadyUse(letterAlreadyUse, letter);

			if(checkIfLetterIsInWord(letter, word)){
				indexOfLetter = computeIndexOfLetterInWord(letter, word);
				hideWord  = revealLetterInHideWord(hideWord, letter, indexOfLetter);
				countOfLetterFind = computeNbrOfLetterFind(countOfLetterFind, indexOfLetter);
			}else{
				NBR_OF_TRY = computeTry();
			}//FIN SI
		}while(!computeIfWin(word, countOfLetterFind) && !computeGameOver());
		showGallows();
		System.out.println(word);
		System.out.println("Vous avez "+ (computeIfWin(word, countOfLetterFind)? "gagné":"perdu"));

	}//FIN main


	public static String chooseWordInDico() {
		//Variables locales
		int random = 0;
		//Instructions
		random = Utilities.randInt(0, DICTIONNARY.length - 1);
		for(int i = 0; i < DICTIONNARY.length; i++) {
			return DICTIONNARY[random];
		}//FIN POUR
		return "";
	}//FIN chooseWordInDico


	public static int computeTry() {
		//Variables locales
		//Instructions
		NBR_OF_TRY -= 1;
		return NBR_OF_TRY;
	}//FIN computeTry


	public static String computeHideWord(String word) {
		//Variables locales
		String hideWord = "";
		//Instructions
		for(int i = 0; i < word.length(); i++) {
			hideWord += "_";
		}//FIN POUR
		return hideWord;
	}//FIN hideWord


	public static boolean checkIfLetterIsInWord(String letter, String word) {
		//Variables locales
		//Instructions
		for(int i = 0; i < word.length(); i++) {
			if(letter.equals(word.substring(i, (i + 1)))) {
				return true;
			}//FIN SI
		}//FIN POUR
		return false;
	}//FIN checkIfLetterIsInWord


	public static int[] computeIndexOfLetterInWord(String letter, String word) {
		//Variables locales
		int[] sameLetterIndex;
		int count = 0;
		//Instructions
		sameLetterIndex = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		for(int i = 0; i < word.length(); i++) {
			if(letter.equals(word.substring(i, (i + 1)))) {
				sameLetterIndex[count] = i;
				count++;
			}//FIN SI
		}//FIN POUR
		return sameLetterIndex;
	}//FIN computeIndexOfLetterInWord


	public static int computeNbrOfLetterFind(int countOfLetterFind, int[] indexOfLetter) {
		//Variables locales
		//Instructions
		for(int i = 0; i < indexOfLetter.length; i++) {
			if(indexOfLetter[i] != -1) {
				countOfLetterFind += 1;
			}//FIN SI
		}//FIN POUR
		return countOfLetterFind;
	}//FIN computeNbrOfLetterFind


	public static String revealLetterInHideWord(String hideWord, String letter, int[] indexOfLetter) {
		//Variables locales
		//Instructions
		for(int i = 0; i < indexOfLetter.length; i++) {
			do {
				if(indexOfLetter[i] != -1) {
					hideWord = hideWord.substring(0, indexOfLetter[i]) + letter + hideWord.substring(indexOfLetter[i] + 1);
				}//FIN SI
			}while(indexOfLetter[i] == indexOfLetter.length);
		}//FIN POUR
		return hideWord;
	}//FIN revealLetterInHideWord


	public static boolean computeIfWin(String hideWord, int nbrOfFindLetter) {
		//Variables locales
		//Instructions
		if(nbrOfFindLetter == hideWord.length()) {
			return true;
		}//FIN SI
		return false;
	}//FIN computeIfWin


	public static boolean computeGameOver() {
		//Variables locales
		//Instructions
		if(NBR_OF_TRY == 0) {
			return true;
		}//FIN SI
		return false;
	}//FIN computeGameOver

	public static String[] completeLetterAlreadyUse(String[] letterAlreadyUse, String letter) {
		//Variables locales
		//Instructions
		for(int i = 0; i < letterAlreadyUse.length; i++) {
			if(letterAlreadyUse[i] == "-1") {
				letterAlreadyUse[i] = letter;
				return letterAlreadyUse;
			}//FIN SI
		}//FIN POUR
		return letterAlreadyUse;
	}//FIN isLetterAlreadyUse


	public static boolean checkIfLetterAlreadyUse(String[] letterAlreadyUse, String letter) {
		//Variables locales
		//Instructions
		for(int i = 0; i < letterAlreadyUse.length; i++) {
			if(letterAlreadyUse[i].equals(letter)) {
				System.out.println(LETTER_ALREADY_USE_MESS);
				return true;
			}//FIN SI
		}//FIN POUR
		return false;
	}//FIN checkIfLetterAlreadyUse
	
	public static void showGallows() {
		System.out.println("_________");
		System.out.println(" |/     |");
		System.out.println(" |" + (NBR_OF_TRY == 5 || NBR_OF_TRY < 5?"      O":""));
		System.out.println(" |" + (NBR_OF_TRY == 4?"      |":"") + (NBR_OF_TRY == 3?"     /|":"") + (NBR_OF_TRY == 2 || NBR_OF_TRY < 2?"     /|\\":""));
		System.out.println(" |" + (NBR_OF_TRY == 1?"     /":"") + (NBR_OF_TRY == 0?"     / \\":""));
		System.out.println("_|_");
	}//FIN showGallows 
}
