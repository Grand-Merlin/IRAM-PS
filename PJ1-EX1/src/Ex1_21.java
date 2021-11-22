
public class Ex1_21 {

	static String Names[] = {"Spa reine","Bru plate","Bru pét",
			"Pepsi","Spa orange"};
	public static void main(String[] args) {
		//Variables locales
		int nbrConso = 0;
		int totalConso [] = new int [Names.length];
		//Instructions
		for(int i = 0 ; i< Names.length; i++) {
			nbrConso = Utilities.getUser_IntInput("Entrez le stock pour " + Names[i]);
			totalConso[i] = nbrConso;
		}//fin pour

		
		System.out.println("--Récapitulatif-- ");
		for(int j = 0 ; j < totalConso.length;j++) {
			System.out.println(Names[j] + " : " + totalConso[j]);
		}//fin pour
	}

}
