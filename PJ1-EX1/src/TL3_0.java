import java.util.Scanner;

public class TL3_0 {

	public static void main(String[] args) {
		//Variables locales
		boolean select = false;
		String name;
		Scanner sc = new Scanner(System.in);
		//Instructions
		System.out.println("Quel est votre nom ?");
		name = sc.next();
		select = IsSelected(name, Utilities.getUser_IntInput("Quel est votre âge ?"), Utilities.checkAnswer("Etes-vous de nationalité belge ou issu de l’union européenne Y/N ?", "Y"), Utilities.checkAnswer("Parlez-vous couramment le français Y/N?", "Y"), Utilities.checkAnswer("Parlez-vous couramment le néerlandais Y/N?", "Y"), Utilities.getUser_IntInput("Quelle est votre acuité visuelle /10 ?"));

		System.out.println(name + (select?" : OK":": Not OK"));


	}
	
	public static boolean IsSelected(String name, int age, boolean nationality, boolean speakFrench, boolean speakDutch, int acuity) {
		//Variables locales
		//Constantes
		final int MAX_ACUITY = 8;
		//Instructions
		if((speakFrench || speakDutch) && nationality && !(age < 18 || age >= 34) && acuity >= MAX_ACUITY) { 
			return true;
		} else {
			return false;	
		}//FIN SI
	}//FIN IsSelected
}
