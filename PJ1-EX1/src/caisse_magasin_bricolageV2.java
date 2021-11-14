
public class caisse_magasin_bricolageV2 {

	public static void main(String[] args) {
		//Variables locales
		double netPriceUnit = 0.0;
		int artNbr = 0;
		double intermediatePrice = 0.0;
		double reductionAmount = 0.0;
		double grossPrice = 0.0;
		double nbrVoucher = 0;
		double voucherCollect = 0;
		double voucherReturn = 0;
		double total = 0.0;
		double totalReduc = 0.0;
		//Instructions
		netPriceUnit = Utilities.getUser_DoubleInput("Entrez le prix NET à l'unité");
		artNbr = Utilities.getUser_IntInput("Nombre d'unités pour cet article ?");
		grossPrice = computeGrossPrice(netPriceUnit, artNbr);
		
		if(artNbr >= 10 && artNbr < 20) {
			reductionAmount = computeReductionAmount(grossPrice, 10);
			intermediatePrice = computeIntermediatePrice(grossPrice, reductionAmount);	
			nbrVoucher = computeNbrVoucher(intermediatePrice);
			showntermadiatePriceAndVoucher(intermediatePrice, nbrVoucher);
		}
		else if (artNbr >= 20 && artNbr < 30) {
			reductionAmount = computeReductionAmount(grossPrice, 20);
			intermediatePrice = computeIntermediatePrice(grossPrice, reductionAmount);	
			nbrVoucher = computeNbrVoucher(intermediatePrice);
			showntermadiatePriceAndVoucher(intermediatePrice, nbrVoucher);
		}
		else if (artNbr >= 30) {
			reductionAmount = computeReductionAmount(grossPrice, 40);
			intermediatePrice = computeIntermediatePrice(grossPrice, reductionAmount);	
			nbrVoucher = computeNbrVoucher(intermediatePrice);
			showntermadiatePriceAndVoucher(intermediatePrice, nbrVoucher);
		}else {
			intermediatePrice = computeIntermediatePrice(grossPrice, reductionAmount);
			nbrVoucher = computeNbrVoucher(intermediatePrice);
			showntermadiatePriceAndVoucher(intermediatePrice, nbrVoucher);
		}//fin si
		
		voucherCollect = Utilities.getUser_IntInput("Nombre de bons collectés ?");
		voucherReturn = voucherCollect - nbrVoucher;
		
		if(voucherCollect > nbrVoucher) {
			System.out.println("Rendre " + voucherReturn + " bon(s) d'achat au client");
		}//fin if
		
		total = intermediatePrice - (nbrVoucher * 2);
		totalReduc = reductionAmount + (nbrVoucher * 2);
		
		System.out.println("Montant total à payer: " + total + " €, total reduction: " + totalReduc + " €");
		
		

	}//fin main
	
	public static double computeGrossPrice(double dNetPriceUnit, int iArtNbr) {
		//Variables locales
		double grossPrice = 0.0;
		//Instructions
		grossPrice = dNetPriceUnit * iArtNbr;
		return grossPrice;
	}//fin computeGrossPrice
	
	
	public static double computeReductionAmount(double dGrossPrice, double dReducPct) {
		//Variables locales
		double reductionAmount = 0.0;
		//Instructions
		reductionAmount = ((dGrossPrice * 100) - dGrossPrice * (100 - dReducPct))/100;
		return reductionAmount;
	}//fin computeReductionAmount
	
	
	public static double computeIntermediatePrice(double dbGroosPrice, double dbReductionAmount) {
		//Variables locales
		double intermediatePrice = 0;
		//Instructions
		intermediatePrice = dbGroosPrice - dbReductionAmount;
		return intermediatePrice;
	}//fin computeIntermediatePrice
	
	
	public static double computeNbrVoucher(double dIntermediatePrice) {
		//Variables locales
		double nbrVoucher = 0;
		//Instructions
		nbrVoucher = dIntermediatePrice/20;
		return Math.floor(nbrVoucher);
	}//fin computeNbrVoucher
	
	
	public static void showntermadiatePriceAndVoucher(double dIntermediatePrice, double iVoucher) {
		//Variables locales
		//Instructions
		System.out.println("Prix total intermédiaire: " + dIntermediatePrice + " €, nombre de bon d'achat maximum: " + iVoucher);
	}//fin showntermadiatePriceAndVoucher
}
