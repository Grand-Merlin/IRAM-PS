
public class Ex1_5_a {

	public static void main(String[] args) {
		
		double montantTva = 0.0;
		double prixNet = 0.0;
		double tva = 0.0;
		
		prixNet = 85.5;
		tva = 21.0;
		montantTva = prixNet * (tva/(100 + tva));
		
		System.out.println("Pour un net de " + prixNet + " €, le coût de la TVA s'eleve à " + montantTva + " €");

	}

}
