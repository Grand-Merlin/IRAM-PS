
public class Ex3 {

	public static void main(String[] args) {
		
		int intQuantitConso = 0;
		double dbPrixUnitaire = 0.0;
		double dbPrixTotParConso = 0.0;
		
		intQuantitConso = 3;
		dbPrixUnitaire = 2.5;
		dbPrixTotParConso = dbPrixUnitaire * intQuantitConso;
		
		System.out.print("Prix total pour cette consommation: " + dbPrixTotParConso + "€");

	}

}
