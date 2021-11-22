
public class TLEx3_0 {

	//Variables Globales
		static int AGE_MIN = 18;
		static int AGE_MAX = 34;
		static int ACUITY_MIN = 8;
		static int ACUITY_MAX = 10;

	public static void main(String[] args) {
		//Variables locale
		String name = "";
		int age = 0;
		boolean europeanOk;
		boolean speakFrenchOk;
		boolean speakDutchOk;
		double visualAcuity = 0.0;
		boolean candidateIsSelected;
		//Instructions
		name = Utilities.getUser_StringInput("Quel est votre nom ?");
		age = Utilities.getUser_IntInput("Quel est votre �ge ? ");
		europeanOk = Utilities.checkAnswer("Etes-vous de nationalit� belge ou issu de l�union europ�enne Y/N ? ", "Y");
		speakFrenchOk = Utilities.checkAnswer("Parlez-vous couramment le fran�ais Y/N? ", "Y");
		speakDutchOk = Utilities.checkAnswer("Parlez-vous couramment le n�erlandais Y/N? ", "Y");
		visualAcuity = Utilities.getUser_DoubleInput("Quelle est votre acuit� visuelle /10 ? ", ACUITY_MIN, ACUITY_MAX);
		
		candidateIsSelected = IsSelected(age, europeanOk, speakFrenchOk, speakDutchOk, visualAcuity);

		System.out.println(name + " : " + (candidateIsSelected?"OK":"Not OK"));



	}//fin main
	
	public static boolean IsSelected(int bAge, boolean bEuropeanOk, boolean bSpeakFrenchOk, boolean  bSpeakDutchOk, double bVisualAcuity) {
		//Variables locale
		//Instructions
		return (bAge >= AGE_MIN && bAge <= AGE_MAX) && bEuropeanOk && (bSpeakFrenchOk || bSpeakDutchOk) && (bVisualAcuity >= ACUITY_MIN);

	}//fin IsSelected
	

}
