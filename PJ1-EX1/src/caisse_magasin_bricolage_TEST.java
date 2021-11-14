
public class caisse_magasin_bricolage_TEST {

	public static void main(String[] args) {
		//Variables locales
		double reductionAmount = 0;
		double intermediatePrice = 0;
		double voucher = 0;
		double grossPrice = 0;
		
		
		//Instructions
		
		reductionAmount = computeReductionAmount(100, 20);
		System.out.println("Le montant de reduction est de " + reductionAmount + " €");
		
		intermediatePrice = computeIntermediatePrice(100, reductionAmount);
		System.out.println("Le montant intermediaire est de " + intermediatePrice + " €");
		
		voucher = computeNbrVoucher(120);
		System.out.println("Le nombre de bon est de " + voucher);
		
		showntermadiatePriceAndVoucher(120, 5);
		
		grossPrice = computeGrossPrice(5, 10);
		System.out.println("Le prix BRUT est de " + grossPrice + " €");
		
	}
	
	
	public static double computeGrossPrice(double dNetPriceUnit, int iArtNbr) {
		//Variables locales
		double grossPrice = 0.0;
		//Instructions
		grossPrice = dNetPriceUnit * iArtNbr;
		return grossPrice;
	}//fin computeGrossPrice
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void showntermadiatePriceAndVoucher(double dIntermediatePrice, int iVoucher) {
		//Variables locales
		//Instructions
		System.out.println("Prix total intermédiaire: " + dIntermediatePrice + " €, nombre de bon d'achat maximum: " + iVoucher);
	}//fin showntermadiatePriceAndVoucher
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static double computeNbrVoucher(double dGrossPrice) {
		//Variables locales
		double nbrVoucher = 0;
		//Instructions
		nbrVoucher = dGrossPrice/20;
		return Math.floor(nbrVoucher);
	}//fin computeNbrVoucher
	
	
	
	
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

}
