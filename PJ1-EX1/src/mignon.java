import java.text.DecimalFormat;

public class mignon {

	//Constantes globales
	public static String[][] WEEKS = {{"03/12/2021","09/12/2021"},{"10/12/2021", "16/12/2021"}, {"17/12/2021", "23/12/2021"}, {"24/12/2021", "30/12/2021"}, {"31/12/2021", "06/01/2022"}};
	public static int[][] DATAS = {{205,13238}, {220,13426}, {221,11034}, {147,9522}, {140,6435}};
	public static String RED = "RED";
	public static String ORANGE = "ORANGE";
	public static String GREEN = "GREEN";
	public static String DATEFROM = "DateFrom";
	public static String DATETO = "DateTo";
	public static String CASES = "Cases";
	public static String ADMISSIONS = "Admissions";
	public static String STATUS = "Status";


	public static void main(String[] args) {
		//Variables locales
		double tendanceCase = 0.0;
		DecimalFormat df;
		double tendanceAdmission = 0.0;
		String one = "";
		String two = "";
		String three = "";
		String four = "";
		//Instructions
		df = new DecimalFormat("0.00");
		one = placeNumberRank(30, DATEFROM, DATETO);
		two = placeNumberRank(45, one, CASES);
		three = placeNumberRank(65, two, ADMISSIONS);
		four = placeNumberRank(75, three, STATUS);

		System.out.println(four);

		for(int i = 1; i < WEEKS.length; i++) {
			one = placeNumberRank(30, WEEKS[i][0], WEEKS[i][1]);
			tendanceCase = computeTendanceCase(i);
			two = placeNumberRank(45, one,(tendanceCase > 0?"+":"") + df.format(tendanceCase) + " % ");//cette ternaire est ideal pour afficher le signe car il n'y a que deux choix possible et c'est plus lisible qu'un if
			tendanceAdmission = computeTendanceAdmission(i);
			three = placeNumberRank(65, two,(tendanceAdmission > 0?"+":"") + df.format(tendanceAdmission) + " % ");
			four = placeNumberRank(75, three, computeStatus(tendanceCase, tendanceAdmission));
			System.out.println(four);
		}//FIN POUR //la boucle for est ici un meileur choix pour pour parcourir un tableau car on connait la longueur de celui-ci
		System.out.println();
	}//FIN main
	/**
	 * Cette fonction calcule, en poucentage, si le nombre de cas est en hausse ou en baisse
	 * @param indexCase
	 * @return
	 */

	public static double computeTendanceCase(int indexCase) {
		//Variables locales
		double numerateur = 0.0;
		double denominateur = 0.0;
		//Instructions
		numerateur = DATAS[indexCase][1] - DATAS[indexCase - 1][1];
		denominateur = DATAS[indexCase - 1][1];
		return (numerateur/denominateur) * 100;
	}//FIN computeTendanceCase

	/**
	 * Cette fonction, calcule, en pourcentage si le nombre d'admission est en hausse ou en baisse
	 * @param indexAdmission
	 * @return
	 */

	public static double computeTendanceAdmission(int indexAdmission) {
		//Variables locales
		double numerateur = 0.0;
		double denominateur = 0.0;
		//Instructions
		numerateur = DATAS[indexAdmission][0] - DATAS[indexAdmission - 1][0];
		denominateur = DATAS[indexAdmission - 1][0];
		return (numerateur/denominateur) * 100;
	}//FIN computeTendanceAdmission

	/**
	 * cette fonction retourne un status particulier suivant que les tandence des cas et des admission, augmente, diminue ou stagne
	 * @param tendanceCase
	 * @param tendanceAdmission
	 * @return
	 */

	public static String computeStatus(double tendanceCase, double tendanceAdmission) {
		//Variables locales
		//Instructions
		if(tendanceCase < 0 && tendanceAdmission < 0) {
			return GREEN;
		}else if(tendanceCase > 0 && tendanceAdmission > 0){
			return RED;
		}else if(tendanceCase >= 0 || tendanceAdmission >= 0) {
			return ORANGE;
		}else {
			return "";
		}//FIN SI	//le if, else if est ici un meilleur choix car plusieurs condition sont possibles 
	}//FIN computeStatus

	public static String placeNumberRank(int rank, String namesString, String stocksString) {
		//Variables locales
		String space = " ";
		int nbrOfSpace = 0;
		String finalString ="";
		//Instructions
		nbrOfSpace = rank - (namesString.length() + stocksString.length());

		for(int i = 0; i < nbrOfSpace; i++) {
			finalString = finalString.concat(space);
		}//FIN POUR
		return namesString.concat(finalString).concat(stocksString);

	}//FIN placeNumberRank

}
