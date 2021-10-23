import java.util.Scanner;

public class Ex1_8v2 {

	public static void main(String[] args) {
		final int NUM_DERN_TABLE = 65; //constante
		int intNumTable=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le N° de table");
		intNumTable= sc.nextInt();



		if (intNumTable >= 1 && intNumTable <= NUM_DERN_TABLE){
		System.out.println("N° de table correct" + intNumTable );
		}//fin if
		else {
		System.out.println("N° de table incorrect");
		}//fin else

	}

}
