
public class brutToNet {

	public static void main(String[] args) {
		
//		double prixBrut1 = 0;
//		double prixBrut2 = 0;
//		double prixNet1 = 0;
//		double prixNet2 = 0;
//		final int tva = 21;
//		double calculTva1 = 0;
//		double calculTva2 = 0;
//		
//		prixBrut1 = 100;
//		prixBrut2 = 125.5;
//		
//		calculTva1 = (prixBrut1/100) * tva;
//		calculTva2 = (prixBrut2/100) * tva;
//		
//		prixNet1 = prixBrut1 + calculTva1;
//		prixNet2 = prixBrut2 + calculTva2;
//		
//		System.out.println("Pour un prix BRUT de " + prixBrut1 + " le prix NET est " + prixNet1);
//		System.out.println("Pour un prix BRUT de " + prixBrut2 + " le prix NET est " + prixNet2);
		
		final double TAUX_TVA = 21.0;
		
		double prixNet = 0.0;
		double prixBrut = 0.0;
				
		prixBrut = 100;
		prixNet = prixBrut * (1 + TAUX_TVA/100);
				
		System.out.println("Pour un prix BRUT de " + prixBrut + " le prix NET est " + prixNet + " €");
				
		prixBrut = 125.5;
		prixNet = prixBrut * (1 + TAUX_TVA/100);
				
		System.out.println("Pour un prix BRUT de " + prixBrut + " le prix NET est " + prixNet + " €");
		
		

	}

}
