
public class Ex1_5_b {

	public static void main(String[] args) {
		//variable locale
		double net = 0.0;
		double tva = 0.0;
		//instruction
		net = 121.0;
		tva = 21.0;
		calculMontantTva(net, tva);

	}
	
	static void calculMontantTva(double prixNet, double tva) {
		
		//variable locale
		double montantTva = 0.0;
		
		//Instruction
		montantTva = prixNet * (tva/(100 + tva));
		
		System.out.println("Pour un net de " + prixNet + "€, le cout de la TVA s'éleve à " + montantTva + "€");
	}//fin calculMontantTva

}
