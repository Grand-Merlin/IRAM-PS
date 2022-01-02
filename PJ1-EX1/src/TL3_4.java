
public class TL3_4 {

	public static void main(String[] args) {
		//Variables locales
		int tab [] = new int [10];
		//Instructions
		for(int i = 0; i < tab.length; i++) {
			tab[i] = Utilities.getUser_IntInput("Entrez la " + (i + 1) + (i == 0? "ère":"ème") +" valeur du tableau");
		}//FIN POUR
		System.out.println("le maximum de ce tableau est " + Utilities. findIntMaxInTab(tab));


	}

}
