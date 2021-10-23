import java.util.Scanner;

public class Ex1_11_TEST {

	public static void main(String[] args) {
		//Variables locales
		final int MINVALUE = 1;
		final int MAXVALUE = 4;
		int checkUserInput = 0;
		boolean checkAnswerOk = false;
		Scanner sc = new Scanner(System.in);
		//Instructions
		checkUserInput  = getUser_IntInput ("N°1 Eau plate\nN°2 Coca Cola\nN°3 Bière pression\nN°4 Café long\n"
											+ " Entrez le N° de consommation", MINVALUE, MAXVALUE );
		if(checkUserInput == -1) {
			System.out.println("N° non référencé");
		}
			
		else if(checkUserInput == 1) {
			checkAnswerOk = checkAnswer("Happy Hour ? Y/N", "y");
			if(checkAnswerOk) {
				System.out.println("Prix de la consommation  Eau plate : 1,50 €");
			}
			else {
				System.out.println("Prix de la consommation  Eau plate : 3,00 €");
			}
				
		}
			
		else if(checkUserInput == 2) {
			checkAnswerOk = checkAnswer("Happy Hour ? Y/N", "y");
			if(checkAnswerOk) {
				System.out.println("Prix de la consommation  Coca Cola: 1,50 €");
			}
			else {
				System.out.println("Prix de la consommation  Coca Cola : 3,00 €");
			}
		}
		else if(checkUserInput == 3) {
			checkAnswerOk = checkAnswer("Happy Hour ? Y/N", "y");
				if(checkAnswerOk) {
					System.out.println("Prix de la consommation  Bière pression: 1,40 €");
				}
				else {
					System.out.println("Prix de la consommation  Bière pression: 2,80 €");
				}
		}	
		else if(checkUserInput == 4) {
			checkAnswerOk = checkAnswer("Happy Hour ? Y/N", "y");
				if(checkAnswerOk) {
					System.out.println("Prix de la consommation  Café long: 1,45 €");
				}
				else {
					System.out.println("Prix de la consommation  Café long: 2,90 €");
				}
			}
	}

		public static int getUser_IntInput(String input, int minValue, int maxValue) {
			//Variables locales
			int intInput = 0;
			Scanner sc = new Scanner(System.in);
			//Instructions
			System.out.println(input);
			intInput = sc.nextInt();
			switch (intInput) {
				case 1 : return 1;
				case 2 : return 2;
				case 3 : return 3;
				case 4 : return 4;
				default : return -1;					
			}
	}






		public static boolean checkAnswer(String answer, String response) {
			//Variables locales
			boolean answerY = false;
			String checkY;
			Scanner sc = new Scanner(System.in);
			//Instructions
			System.out.println(answer);
			checkY = sc.next();
			
			if(checkY.equals(response)) {
				answerY = true;
				return answerY;
			}
			else {
				return answerY;		
			}


	}




}
