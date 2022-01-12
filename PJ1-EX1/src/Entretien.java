import java.text.DecimalFormat;

public class Entretien {

	//Constantes globales
	public static String[]BASE_OP = {"vidange et remplacement filtre huile","remplacement filtre à air","remplacement filtre à pollen","remplacement filtre à carburant"};
	public static String[]OPT_OP = {"remplacement disques et plaquettes","remplacement balais essuie glace","remplacement liquide de frein"};
	public static double[]BASE_OP_PRICES = {135.0, 22.3, 41.5, 78.0};
	public static double[]OPT_OP_PRICES = {295.0, 48.5, 74.6};
	public static String NAME_MESS = "Entrez votre nom : ";
	public static String LICENCE_PLATE_MESS = "Entrez votre N° d'immatriculation : ";
	public static String QUESTION_MESS = "voulez-vous effectuer le/la ";
	public static String OPTION = " --------Options-------";
	public static String TOTAL = "TOTAL";
	public static double VAT = 11.11;
	public static String DEVICE = "€";


	public static void main(String[] args) {
		//Variables locales
		String name = "";
		String licensePlate = "";
		boolean[]baseOpChoices;
		boolean[]optOpChoices;
		boolean repeat = true;
		DecimalFormat df;
		//Instructions
		do {
			df = new DecimalFormat("0.00");
			baseOpChoices = new boolean[BASE_OP.length];
			optOpChoices = new boolean [OPT_OP.length];
			name = Utilities.getUser_StringInput(NAME_MESS);
			licensePlate = Utilities.getUser_StringInput(LICENCE_PLATE_MESS);
			baseOpChoices = completeBaseOpChoices(baseOpChoices);
			System.out.println(OPTION);
			optOpChoices = completeOptOpChoices(optOpChoices);
			System.out.println();
			System.out.println("---------------------- ");
			showRecap(name, licensePlate, baseOpChoices, optOpChoices, df);
			System.out.println();
			System.out.println(Utilities.placeNumberRank(50, TOTAL,df.format(computeTotalWithVAT(baseOpChoices, optOpChoices)) + DEVICE));
			System.out.println("---------------------------------------------");
		}while(repeat);
	}//FIN main
	public static boolean[] completeBaseOpChoices(boolean[]baseOpChoices) {
		//Variables locales
		//Instructions
		for(int i = 0; i < BASE_OP.length; i++) {
			baseOpChoices[i] = (Utilities.getUserSpecificInput(QUESTION_MESS + " " + BASE_OP[i] + " " + BASE_OP_PRICES[i] + " " + DEVICE + " HTVA Y/N" , "YN").equals("Y") ?true:false);
		}//FIN for
		return baseOpChoices;
	}//FIN completeBaseOpChoices
	public static boolean[] completeOptOpChoices(boolean[]optOpChoices) {
		//Variables locales
		//Instructions
		for(int i = 0; i < OPT_OP.length; i++) {
			optOpChoices[i] = (Utilities.getUserSpecificInput(QUESTION_MESS+ " " + OPT_OP[i] + " " + OPT_OP_PRICES[i] + " " + DEVICE + " HTVA Y/N"  , "YN").equals("Y")?true:false);
		}//FIN for
		return optOpChoices;
	}//FIN completeOptOpChoices
	public static double computeTotalWithVAT(boolean[]baseOpChoices, boolean[]optOpChoices) {
		//Variables locales
		double sumOfBase = 0.0;
		double sumOfOpt = 0.0;
		//Instructions
		for(int i = 0; i <baseOpChoices.length; i++) {
			if(baseOpChoices[i]){
				sumOfBase += BASE_OP_PRICES [i] + (BASE_OP_PRICES [i] * (VAT/(100 + VAT)));
			}//FIN if
		}//FIN for
		for(int i = 0; i < optOpChoices.length; i++) {
			if(optOpChoices[i]){
				sumOfOpt += OPT_OP_PRICES [i] + (OPT_OP_PRICES [i] * (VAT/(100 + VAT)));
			}//FIN if
		}//FIN for
		return sumOfBase + sumOfOpt;
	}//FIN computeTotalWithVAT
	public static void showRecap(String name, String licensePlate, boolean[] baseOpChoices, boolean[] optOpChoices, DecimalFormat df) {

		//Variables locales
		//Instructions
		System.out.println("Nom : " + name);
		System.out.println("N° d'immatriculation " + licensePlate);
		System.out.println();
		for(int i = 0; i < baseOpChoices.length; i++) {
			if(baseOpChoices[i]){
				System.out.println(Utilities.placeNumberRank(50,BASE_OP[i], df.format(BASE_OP_PRICES[i] + (BASE_OP_PRICES[i] * VAT/(100 + VAT))) + DEVICE));
			}//FIN if
		}//FIN for
		for(int i = 0; i < optOpChoices.length; i++) {
			if(optOpChoices[i]){
				System.out.println(Utilities.placeNumberRank(50,OPT_OP[i],df.format(OPT_OP_PRICES [i] + (OPT_OP_PRICES [i] * VAT/(100 + VAT))) + DEVICE));
			}//FIN if
		}//FIN for
	}//FIN showRecap
}
