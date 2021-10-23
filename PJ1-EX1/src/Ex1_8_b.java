import java.util.Scanner;

public class Ex1_8_b {

	public static void main(String[] args) {
		//Variables locales
		final int NUMMAX = 20; 
		//Instructions
		getTableNumber(NUMMAX);

	}
	public static int getTableNumber(int totalTable) {
		//Variables locales
		int intNumTable = 0;
		Scanner sc = new Scanner(System.in);
		//Instructions
		System.out.println("Entrez un numero de table");
		intNumTable = sc.nextInt();
		if(intNumTable < 1 || intNumTable > 20) {
			System.out.println("Numero de table incorrecte, le numero dois etre compris entre 1 et " + totalTable);
			return -1;
		} else return intNumTable;
		
	}//fin getTableNumber

}
