
public class PseudoCodeExercice4_CVersionProf {

	public static void main(String[] args) {
		double dbPrixBrut = 0.0;
		double dbTauxTva = 0.0;
		
		dbPrixBrut = 100;
		dbTauxTva = 6;
		
		afficherInfosPrix(dbPrixBrut, dbTauxTva, calculerPrixNet(dbPrixBrut, dbTauxTva));
		
		dbPrixBrut = 125.5;
		dbTauxTva = 21.0;
		
		afficherInfosPrix(dbPrixBrut, dbTauxTva, calculerPrixNet(dbPrixBrut, dbTauxTva));

	}// fin main
	
	static double calculerPrixNet(double prixBrut, double tauxTva) {
		
		return prixBrut * (1 + tauxTva/100);
	}//fin calculPrixNet
	
	static void afficherInfosPrix(double brut, double tva, double net) {
		
		System.out.println("pour un prix Brut de " +  brut  +   "€ et une TVA de " +  tva  +   ", le prix net est de " + net);
	}//fin afficherInfosPrix

}
