import java.util.ArrayList;

public class Ex1_24 {
	final static String NAMES[]= {"Spa reine 25 ","Bru plate 50","Bru pét 50",
			"Pepsi","Spa orange", "Schweppes Tonic","Schweppes Agr","Ice Tea","Ice Tea Pêche",
			"Jus d'orange Looza", "Cécémel", "Red Bull","Petit Expresso","Grand Expresso","Café décaféiné ",
			"Lait Russe ","Thé et infusions","Irish Coffee ","French Coffee ","Cappuccino","Cécémel chaud",
			"Passione Italiano","Amour Intense", "Rhumba Caliente ","Irish Kisses ","Cuvée Trolls 25",
			"Cuvee Trolls 50","Ambrasse-Temps 25","Ambrasse-Temps 50 ","Brasse-Temps Cerises 25",
			"Brasse-Temps Cerises 50","La Blanche Ste Waudru 25","Blanche Ste Waudru 50",
			"Brasse-Temps citr 25","Brasse-Temps citr 50","Spaghetti Bolo ","Tagl Carbonara",
			"Penne poulet baslc ","Tagl American","Tagl saum"};


	public static void main(String[] args)  {
		//Variables locales
		ArrayList<int[]> ord;
		//Instructions
		ord = new ArrayList<int[]>();
		getOrder(ord);
		for(int i = 0; i < ord.size(); i++) {
			System.out.print(ord.get(i)[0] + " " + ord.get(i)[1]);
		}
	}
	public static void getOrder(ArrayList<int[]> ord) {
		//Variables locales
		int[] consumption;
		String idComsum;
		String nbrOfConsum;
		int count = 0;
		//Instructions
		consumption = new int[2];
		if(count == 0) {
			idComsum = Utilities.getUserIntorSpecificInput("Entrez le N° de consommable ou Q(Quitter) ","Q", 1 , NAMES.length);
			consumption[0] = Integer.parseInt(idComsum);
			count++;
		}else {
			idComsum = Utilities.getUserIntorSpecificInput("Entrez le N° de consommable ou Q(Quitter) V (Valider le ticket) ","QV", 1 , NAMES.length);
			consumption[0] = Integer.parseInt(idComsum);
		}//FIN SI
		if(idComsum.equals("V")) {

		}

		else if(idComsum.equals("Q")) {
			System.exit(0);
		}
			do {
				nbrOfConsum = Utilities.getUserIntorSpecificInput("Nombre de consommations pour " +  NAMES[consumption [0] - 1] + " ? /A(Annuler) /Q (Quitter)","AQ", 1);
			}while (nbrOfConsum.equals("A"));
			consumption[1] = Integer.parseInt(nbrOfConsum);
			if(nbrOfConsum.equals("Q")) {
				System.exit(1);
			}//FIN SI
		
		ord.add(consumption);
	}
}