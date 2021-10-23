
public class Ex1_5_cV3 {

	public static void main(String[] args) {

		//Variables locales
		double dbPrixNet = 0.0;
		double dbTva = 0.0;
		
		//Instructions
		dbPrixNet = 121.0;
		dbTva = 21.0;
		
		afficherPrix(dbPrixNet, dbTva, calculMontantTva(dbPrixNet, dbTva));
		
		dbPrixNet = 85.5;
		dbTva = 12.5;
		
		afficherPrix(dbPrixNet, dbTva, calculMontantTva(dbPrixNet, dbTva));

	}//fin main
	/**
	 * Calcule le montant de la TVA
	 * @param prixNet prix Net
	 * @param tva taux de TVA
	 * @return stock le montant de la TVA (Prix net - prix brut)
	 */
	public static double calculMontantTva(double prixNet, double tva ) {
		
		return prixNet * (tva/(100 + tva));
		
	}//fin calculMontantTva
	/**
	 * Affiche les prix	
	 * @param affNet prix Net
	 * @param affTva taux de TVA
	 * @param mntTva Montant de la TVA (Prix net - prix Brut)
	 */
	public static void afficherPrix(double affNet, double affTva, double mntTva) {

		//Variables locales
		//Instructions
		System.out.println("Pour un prix net de " + affNet + "€, et une TVA de " + affTva + "%, le coût de la TVA s'éleve à " + mntTva + " €");
	}//fin afficherPrix

}
