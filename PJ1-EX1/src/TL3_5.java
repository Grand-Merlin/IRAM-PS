
public class TL3_5 {

	public static void main(String[] args) {
		//Variables locales
		int tab [] = new int [10];
		int peerTab [] = new int [10];
		int oddTab[] = new int [10];
		int j = 0;
		int k = 0;
		//Instructions
		
		for(int i = 0; i < tab.length; i++) {
			tab[i] = Utilities.getUser_IntInput("Entrez la " + (i + 1) + (i == 0? "ère":"ème") +" valeur du tableau");
			if(tab[i]%2 == 0) {
				peerTab[j] = tab[i];
				j++;
				//System.out.println(peerTab[i]);
			}else {
				oddTab[k] = tab[i];
				k++;
				//System.out.println(oddTab[i]);
			}//FIN SI
		}//FIN POUR
		for(int i = 0; i < peerTab.length; i++) {
			System.out.print(peerTab[i] + " ");
		}//FIN POUR
		System.out.println();
		for (int i = 0; i < oddTab.length; i++) {
			System.out.print(oddTab[i] + " ");
		}//FIN POUR


	}

}
