
public class Ex1_5_cV1 {

	public static void main(String[] args) {
		
		//Variables locales
		double dbPrixNet = 0.0;
		double dbTva = 0.0;
		
		//Instructions
		dbPrixNet = 121.0;
		dbTva = 21.0;
		
		System.out.println("Pour un prix net de " + dbPrixNet + "€, et une TVA de " + dbTva + "%, le coût de la TVA s'éleve à " + calculMontantTva(dbPrixNet, dbTva) + " €");
		
		dbPrixNet = 85.5;
		dbTva = 12.5;
		
		System.out.println("Pour un prix net de " + dbPrixNet + "€, et une TVA de " + dbTva + "%, le coût de la TVA s'éleve à " + calculMontantTva(dbPrixNet, dbTva) + " €");


	}//fin main
	
	public static double calculMontantTva(double prixNet, double tva ) {
		
		return prixNet * (tva/(100 + tva));
		
	}//fin calculMontantTva

}
