
public class Assistance_caisse_magasin_bricolage {


	
	public static void main(String[] args) {
		//variable locales 
		double priceUnit = 0.0;
		int artNbr = 0;
		double intermediatePrice = 0.0;
		double vat = 0.0;
		double goodBuy = 0; 
		double collectGoodBuy = 0;
		double returnGoodBuy = 0;
		double totalAmount = 0.0;
		double totalReduction = 0.0;
		double dbVat = 0.0;

		//Instructions 
		priceUnit = Utilities.getUser_DoubleInput("Entrez le prix NET � l�unit�");
		artNbr = Utilities.getUser_IntInput("Nombre d�unit�s pour cet article ?");

		 
		if(artNbr >= 10 && artNbr < 20) {
			intermediatePrice = computeIntermediatePrice(priceUnit, artNbr, 10);
			goodBuy = (intermediatePrice /20);
			System.out.println("Prix total int�rm�daire: " + intermediatePrice + ", nombre de bons d�achat MAX: " + (int)goodBuy); 

		}

		

		else if(artNbr >= 20 && artNbr < 30) {
			intermediatePrice = computeIntermediatePrice(priceUnit, artNbr, 20);
			goodBuy = (intermediatePrice /20);
			
			System.out.println("Prix total int�rm�daire: " + intermediatePrice + ", nombre de bons d�achat MAX: " + goodBuy);
		} 

		

		else if (artNbr >= 30) {
			intermediatePrice = computeIntermediatePrice(priceUnit, artNbr, 40);
			goodBuy = (intermediatePrice /20);
			
			System.out.println("Prix total int�rm�daire: " + intermediatePrice + ", nombre de bons d�achat MAX: " + goodBuy);
		}
		else if (artNbr < 10) {
			intermediatePrice = computeIntermediatePrice(priceUnit, artNbr, 0);
			goodBuy = (intermediatePrice /20);
			System.out.println("Prix total int�rm�daire: " + intermediatePrice + ", nombre de bons d�achat MAX: " + goodBuy);
		}//fin si

		collectGoodBuy = Utilities.getUser_IntInput("Nombre de bons collect� ?"); 

		if(collectGoodBuy > goodBuy ) {
			returnGoodBuy = collectGoodBuy - goodBuy;

			System.out.println("Rendre " + returnGoodBuy + " au client"); 
		}//FIN SI

		totalAmount = intermediatePrice - (collectGoodBuy * 2);
		dbVat = Utilities.vatCostCompute(intermediatePrice, vat);
		totalReduction = (collectGoodBuy * 2) + dbVat;

		System.out.println("Montant total � payer : " + totalAmount + " � total r�duction: " + totalReduction + " �");

	}//Fin main
	
	public static double computeIntermediatePrice(double dbPriceUnit, int intArtNbr, double dbvat) {
		//variable locales 
		double dbGroosPrice = 0.0;
		double dbNetPrice = 0.0;
		//Instructions 
		dbGroosPrice = dbPriceUnit * intArtNbr;
		dbNetPrice = Utilities.computeNetPrice(dbGroosPrice, dbvat);
		return dbNetPrice;
	}//fin computeIntermediatePrice

}
