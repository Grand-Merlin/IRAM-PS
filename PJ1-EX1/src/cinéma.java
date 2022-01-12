import java.text.DecimalFormat;

public class cinéma {

	//Constantes globales
	public static String[] MOVIE = {"Coco", "Star Wars", "L'expérience interdite", "Wonder", "Le crime de l'orient Express"};
	public static double[] PRICES = {9.50, 13.20, 10.50, 10.50, 12.00};
	public static int[][] ACTIVITY = {{1, 2 , 200}, {2, 3, 150}, {3, -1, 250}, {4, 0, 100}, {5, -1, 150}, {6, 1, 350}, {7, -1, 400}, {8, 4, 500}};
	public static String NOT_ENOUGTH_PLACE = "Nombre de places trop important ";
	public static String COMPLETE_MOVIE = "Film complet ";
	public static String CHOICE_MOVIE = "Choississez votre film par son identifiant : ";
	public static String RECAP_PRICE = "Merci d'avoir commandé ";
	public static String ASK_NBR_OF_PLACES = "Nombre de place(s) pour";
	public static String ERROR_MOVIE = "Saisie incorrecte, l’identifiant doit se trouver entre 0 et ";
	public static String ERROR_PLACES ="Saisie incorrecte, le nombre de place doit se trouver entre 0 et ";
	public static boolean CHECK_COMMAND = false;


	public static void main(String[] args) {
		//Variables locales

		int nbrOfCommandPlaces = -1;
		int numOfMovie = 0;
		double pricesOfCommand = 0.00;
		boolean numOfMovieOk = false;
		//Instructions
		do {
			CHECK_COMMAND = false;
			showRecap();
			do {
				try {
					numOfMovie = Utilities.getUser_IntInput(CHOICE_MOVIE, 0, MOVIE.length - 1);
					numOfMovieOk = true;
				}catch(Exception e) {
					System.out.println(ERROR_MOVIE + (MOVIE.length - 1));
				}//FIN ESSAYER
			}while(!numOfMovieOk);
			if(checkEnougthPlaceInTheater(numOfMovie)) {
				do {
					try {
						nbrOfCommandPlaces = Utilities.getUser_IntInput(ASK_NBR_OF_PLACES + " " + MOVIE[numOfMovie]);
					}catch(Exception e) {
						for(int i = 0; i < ACTIVITY.length; i++) {
							if(numOfMovie == ACTIVITY[i][1]) {
								System.out.println(ERROR_PLACES + (ACTIVITY[i][2]));
								nbrOfCommandPlaces = -1;
							}//FIN SI
						}//FIN POUR
					}//FIN ESSAYER
					ACTIVITY  = computeRemainingPlaces(nbrOfCommandPlaces, numOfMovie);
					if(CHECK_COMMAND) {
						pricesOfCommand = computePrices(nbrOfCommandPlaces, numOfMovie);
						if(nbrOfCommandPlaces != -1) {
							showRecapCommand(pricesOfCommand, nbrOfCommandPlaces, numOfMovie);
						}//FIN SI
					}//FIN SI
				}while(!CHECK_COMMAND);
			}//FIN SI
		}while(!checkEnougthPlacesInEntireCinema());
		showRecap();
	}//FIN MAIN


	public static int[][] computeRemainingPlaces(int nbrOfCommandPlaces, int numOfMovie){
		//Variables locales
		//Instructions
		if(nbrOfCommandPlaces != -1) {
			for(int i = 0; i < ACTIVITY.length; i++) {
				if(ACTIVITY[i][1] == numOfMovie){
					if(ACTIVITY[i][2] - nbrOfCommandPlaces < 0) {
						System.out.println(NOT_ENOUGTH_PLACE);
					}else {
						CHECK_COMMAND = true;
						ACTIVITY[i][2] -= nbrOfCommandPlaces;
					}//FIN SI
				}//FIN SI
			}//FIN POUR
		}//FIN SI
		return ACTIVITY;
	}//FIN computeRemainingPlaces


	public static double computePrices(int nbrOfCommandPlaces, int numOfMovie) {
		//Variables locales
		//Instructions
		for(int i = 0; i < ACTIVITY.length; i++) {
			if(ACTIVITY[i][1] == numOfMovie) {
				return nbrOfCommandPlaces * PRICES[ACTIVITY[i][1]];
			}//FIN SI
		}//FIN POUR
		return 0;
	}//FIN computePrices

	public static void showRecap() {
		//Variables locales
		//Instructions
		for(int i = 0; i < ACTIVITY.length; i++) {
			if(ACTIVITY[i][1] != -1) {
				System.out.println(Utilities.placeNumberRank(50, Integer.toString(ACTIVITY[i][1]) + (ACTIVITY[i][2] == 0? " C ": "   ") + "Salle : " + Integer.toString(ACTIVITY[i][0])+ "   " + MOVIE[ACTIVITY[i][1]], Integer.toString(ACTIVITY[i][2])));
			}//FIN SI
		}//FIN POUR
	}//FIN showRecap


	public static boolean checkEnougthPlacesInEntireCinema() {
		//Variables locales
		//Instructions
		for(int i = 0; i < ACTIVITY.length; i++) {
			if(ACTIVITY[i][1] != -1) {
				if(ACTIVITY[i][2] != 0) {
					return false;
				}//FIN SI
			}//FIN SI
		}//FIN POUR
		return true;
	}//FIN checkEnougthPlaces



	public static void showRecapCommand(double pricesOfCommand, int nbrOfCommandPlaces, int numOfMovie) {
		//Variables locales
		DecimalFormat df = new DecimalFormat("0.00");
		//Instructions
		System.out.println(RECAP_PRICE + nbrOfCommandPlaces + (nbrOfCommandPlaces == 1? " ticket":" tickets") + " pour " + MOVIE[numOfMovie] + " – prix " + df.format(pricesOfCommand) + " €");
	}//FIN shoxRecapCommand


	public static boolean checkEnougthPlaceInTheater(int numOfMovie) {
		//Variables locales
		//Instructions
		for(int i = 0; i < ACTIVITY.length; i++) {
			if(ACTIVITY[i][1] == numOfMovie) {
				if(ACTIVITY[i][2] == 0) {
					System.out.println(COMPLETE_MOVIE);
					return false;
				}//FIN SI
			}//FIN SI
		}//FIN POUR
		return true;
	}//FIN checkEnougthPlaceInTheater 
}
