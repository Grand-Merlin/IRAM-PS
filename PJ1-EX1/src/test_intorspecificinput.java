import java.util.Scanner;

public class test_intorspecificinput {

	public static void main(String[] args) {

			Scanner sc= new Scanner (System.in);
			int intInput = 0;
			String strAnsw = "";
			System.out.println("Entrez un nombre ou une String :");

			if (sc.hasNextInt()==true) {

			intInput = sc.nextInt();
			System.out.println("saisie d'un int :" + intInput);
			}else{
			strAnsw = sc.next();
			System.out.println("saisie d'une String ou caractère :" + strAnsw);

			}
	}
	public static String getUserIntorSpecificInput(String msg ,String expectedAnswers,int min , int max ) {
		int input = 0;
		String answer = "";
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println(msg);
			if (sc.hasNextInt()==true) {
				input = sc.nextInt();
				if (input<min||input>max) {
					System.out.println("Le nombre doit être compris entre " + min + " et " + max);
				}else {
					return Integer.toString(input);
				}
			}else {
				answer = sc.next().trim().toUpperCase();
				if (answer.length() == 1 && expectedAnswers.toUpperCase().indexOf(answer) >= 0) {
					return answer;
				} else {
					System.out.println("Erreur de saisie, votre choix doit être parmi " + expectedAnswers + " une lettre seulement");
				}
			}
			
		}while (true);
	}

}
