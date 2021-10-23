
public class TestFonction2 {

	public static void main(String[] args) {
		
		calculNet(100, 6);
		calculNet(125.5, 21);
	}// fin main
	
	static double calculNet(double prixBrut, double tauxTva) {
		
		double prixNet = 0.0;
		
		//prixNet = prixBrut * (1 + tauxTva/100);
		afficherPrix(prixBrut, prixNet);
		
		//return prixNet;
		return prixBrut * (1 + tauxTva/100);// optimisé
	}//fin calculNet
	
	static void afficherPrix(double prixAfficheBrut, double prixAfficheNet) {
		
		System.out.println("Pour un prix but de " + prixAfficheBrut + "€, le prix net est de " + prixAfficheNet + "€");
	}//fin afficherPrix

}
