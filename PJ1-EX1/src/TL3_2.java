
public class TL3_2 {

	public static void main(String[] args) {
		//Variables locales
		int tab [];
		int numMax = 0;
		//Instructions
		tab = new int [] {150, 25, 0, 35, 4800 , 2, 1, 89, 100, 7000};
		numMax = tab[0];
		for(int i = 0; i < tab.length - 1; i++) {
			if(tab[i + 1] > numMax) {
				numMax = tab[i + 1];
			}//FIN SI
		}//FIN POUR
		System.out.println("le maximum de ce tableau est " + numMax);


	}

}
