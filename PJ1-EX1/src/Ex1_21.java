
public class Ex1_21 {

	static String Names[] = {"Spa reine","Bru plate","Bru pét",
			"Pepsi","Spa orange"};
	public static void main(String[] args) {
		//Variables locales
		int nbrConso = 0;
		int totalConso [] = arrayStock(nbrConso);
		//Instructions
		System.out.println("--Récapitulatif-- ");
		showStock(totalConso);
		
	}//fin main
	
	public static int[] arrayStock(int aNbrConso) {
		//Variables locales
		int aTotalConso [] = new int [Names.length];
		//Instructions
		for(int i = 0 ; i< Names.length; i++) {
			aNbrConso = Utilities.getUser_IntInput("Entrez le stock pour " + Names[i]);
			aTotalConso[i] = aNbrConso;
			}
		return aTotalConso;
	}//fin arrayStock
	
	public static void showStock(int aTotalConso[]) {
		for(int j = 0 ; j < aTotalConso.length;j++) {
			System.out.println(Names[j] + " : " + aTotalConso[j]);
		}//fin pour
	}//fin showStock

}
