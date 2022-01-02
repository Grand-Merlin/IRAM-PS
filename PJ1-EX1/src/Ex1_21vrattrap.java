
public class Ex1_21vrattrap {

	
	//Variables globales Constantes
	public static final String NAMES [] = {"Spa reine 25 ","Bru plate 50","Bru pét 50","Pepsi","Spa orange"};
	//Variables globales


	public static void main(String[] args) {
		//Variables locales
		int Stock [] = new int [5];
		//Instructions
		for(int i = 0; i < NAMES.length; i++) {
			Stock[i] = Utilities.getUser_IntInput("Entrez le stock pour " + NAMES[i]);
		}//fin pour

		System.out.println("--Récapitulatif--\n");	

		for(int i = 0; i < NAMES.length; i++) {
			System.out.println(NAMES [i] + " : " + Stock[i]);
		}//FIN pour


	}

}
