
public class Ex1_5_cV2 {

	public static void main(String[] args) {

		//Variables locales
		double dbPrixNet = 0.0;
		double dbTva = 0.0;
		
		//Instructions
		dbPrixNet = 121.0;
		dbTva = 21.0;
		
		afficherPrix(dbPrixNet, dbTva);
		
		dbPrixNet = 85.5;
		dbTva = 12.5;
		
		afficherPrix(dbPrixNet, dbTva);

	}//fin main
	
	public static double calculMontantTva(double prixNet, double tva ) {
		
		return prixNet * (tva/(100 + tva));
		
	}//fin calculMontantTva
	
	public static void afficherPrix(double affNet, double affTva) {
		
		//Variables locales
		//Instructions
		System.out.println("Pour un prix net de " + affNet + "€, et une TVA de " + affTva + "%, le coût de la TVA s'éleve à " + calculMontantTva(affNet, affTva) + " €");
	}//fin afficherPrix

}
