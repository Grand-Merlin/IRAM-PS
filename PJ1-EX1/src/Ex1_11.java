import java.util.Scanner;

public class Ex1_11 {

	public static void main(String[] args) {
		final int NUM_MAX = 1, NUM_MIN = 4;
		final double dblDrink_1 = 3.0, dblDrink_2 = 3.0, dblDrink_3 = 2.8, dblDrink_4 = 2.9;
		final String drink_1 = "Eau plate", drink_2 = "Coca-cola", drink_3 = "Bière pression", drink_4 = "Café long";
		

	}//fin main
	
	public static int getUser_intInput(String txtInvit, int min, int max) {
		//Variables locales
		int intInput = 0;
		Scanner sc = new Scanner(System.in);
		//Instructions
		System.out.println(txtInvit);
		intInput = sc.nextInt();
		if(intInput < min || intInput > max) {
			System.out.println("Saisie incorrecte");
			return -1;
		} else {
			retrurn intInput;
		}//fin if
	}//fin getUser_intInput
	
	public static boolean checkAnswer(String txtQuestion, String txtReponse) {
		//Variables locales
		String answer;
		Scanner sc = new Scanner(System.in);
		//Instructions
		System.out.println(txtQuestion);
		answer = sc.next();
		return (answer.equals(txtQuestion));
	}//fin checkAnswer

}
