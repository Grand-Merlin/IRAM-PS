import java.text.DecimalFormat;

public class Ex1_20 {
	
	final static String Names[]= {"Spa reine 25 ","Bru plate 50","Bru pét 50",
			"Pepsi","Spa orange", "Schweppes Tonic","Schweppes Agr","Ice Tea","Ice Tea Pêche",
			"Jus d'orange Looza", "Cécémel", "Red Bull","Petit Expresso","Grand Expresso","Café décaféiné ",
			"Lait Russe ","Thé et infusions","Irish Coffee ","French Coffee ","Cappuccino","Cécémel chaud",
			"Passione Italiano","Amour Intense", "Rhumba Caliente ","Irish Kisses ","Cuvée Trolls 25",
			"Cuvee Trolls 50","Ambrasse-Temps 25","Ambrasse-Temps 50 ","Brasse-Temps Cerises 25",
			"Brasse-Temps Cerises 50","La Blanche Ste Waudru 25","Blanche Ste Waudru 50",
			"Brasse-Temps citr 25","Brasse-Temps citr 50","Spaghetti Bolo ","Tagl Carbonara",
			"Penne poulet baslc ","Tagl American","Tagl saum"};
			
	final static double NetPrices[]= {2.2, 2.3,3.9,2.2,2.2,2.6,2.6,2.6,2.6,2.6,2.6,4.5,2.2,2.2,2.2,2.5,2.5,7.0,7.0,2.8,2.8,6.2,6.2,6.2,6.2,
	                                    2.9,5.5,2.7,5.1,3.1,5.8,2.6,4.9,2.6,4.9,10.8,11.2,12.2,14.5,16.9};

	public static void main(String[] args) {
		showMenu();
		}
	public static void showMenu() {
		//Variables locales
		DecimalFormat df = new DecimalFormat("0.00");
		//Instructions
	for(int i = 0; i < Names.length; i++) {
		System.out.println(Names[i] + " " + df.format(NetPrices[i]) + " €");
		}//fin pour
	}//FIN showMenu

}
