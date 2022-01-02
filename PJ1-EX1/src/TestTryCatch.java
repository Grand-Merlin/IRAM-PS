import java.util.Scanner;
public class TestTryCatch {
	public static void main(String[] args) {
		try {
			System.out.println("Entrez le N° du consommable");
			Scanner sc = new Scanner(System.in);
			int intSaisieNumConso = sc.nextInt();
			sc.close();
			System.out.println("valeur saisie du N° de consommable : " + intSaisieNumConso );
		}catch (Exception e) { 
			System.out.println("Exception récupérée " + e);
		}//fin catch
	}//fin main
}//fin class
