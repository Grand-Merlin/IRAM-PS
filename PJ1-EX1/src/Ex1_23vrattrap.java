
public class Ex1_23vrattrap {

	//Constantes globales
	public static int Stocks [][] = {{1,56,200,55}, {2,42,200,60},{3,62,200,125} ,{4,45,200,150},{5,25,200,140},{6,72,200,86},{7,40,200,47},{8,48,200,80},{9,24,150,126},{10,36,200,164},{11,15,100,85},{12,25,80,23}};
	public static String Names [] = {"Spa Reine","Bru Plate","Bru légèrement pétillante","Pepsi", "Spa Orange","Schweppes Tonic","Schweppes","Agrumes","Lipton Ice Tea","Lipton Ice Tea Pêche","Jus d'orange Looza","Cécémel","Red Bull"};

	public static void main(String[] args) {
		//Constantes locales
		final int FIRST_RANK = 35, SECOND_RANK = 40, THIRD_RANK = 45;
		//Variables locales
		String strToPrint = "";
		//Instructions
		for(int i = 0; i < Names.length - 1; i++) {
			strToPrint = Names[i];
			strToPrint = placeNumberRank(FIRST_RANK, strToPrint,Integer.toString(Stocks[i][1]));
			strToPrint = placeNumberRank(SECOND_RANK, strToPrint,Integer.toString(Stocks[i][2]));
			strToPrint = placeNumberRank(THIRD_RANK, strToPrint,Integer.toString(Stocks[i][3]));
			System.out.println(strToPrint);
		}//FIN POUR



	}
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
