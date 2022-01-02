
public class TL4_1 {

	public static void main(String[] args) {
		//Variables locales
		int[] lots = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] winningNbr;
		//Instructions
		winningNbr = computeWinNumbers(lots);
		System.out.println(Utilities.placeNumberRank(20, "N° lot", "N° billet"));
		for(int i = 0; i < lots.length; i++) { 
				System.out.println(Utilities.placeNumberRank(13, Integer.toString(lots[i]), Integer.toString(winningNbr[i])));
			}
	}//FIN MAIN


	public static int[] computeWinNumbers(int [] tab) {
		//Variables locales
		int nbrRandom = 0;
		int[] tabRandNbr;
		//Instructions
		tabRandNbr = new int [tab.length];
		for(int i = 0; i < tabRandNbr.length; i++) {
			nbrRandom = Utilities.randInt(1, 50);
			if(!Utilities.isInTab(tabRandNbr , nbrRandom)) {
				tabRandNbr[i] = nbrRandom;
				System.out.println("N° de billet " +  nbrRandom + " attribué au lot N° " + (i + 1) +"  -- numéro de billet accepté");
			}else {
				System.out.println("N° de billet " +  nbrRandom + " attribué au lot N° " + (i + 1) +"  -- numéro de billet rejeté");
				i--;
			}//FIN SI
		}//FIN POUR
		return tabRandNbr;
	}//FIN computeWinNumbers



}
