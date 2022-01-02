
public class TL2_2 {

	public static void main(String[] args) {
		//Variables locales
		int value = 0;
		int tab [];
		boolean findValue = false;
		//Instructions
		tab = new int [] {15, 25, 0, 35, 48 , 2, 0, 89, 100, 7};
		value = Utilities.getUser_IntInput("Entrez la valeur entière à vérifier dans la liste");
		findValue  = FindValueInArr(value, tab);

			System.out.println((findValue)?"la valeur " + value + " se trouve bien dans la liste":"la valeur " + value + " ne se trouve pas dans la liste");


	}
	
	public static boolean FindValueInArr(int value, int arr []) {
	//Variables locales
	//Instructions
		for(int i = 0; i < arr.length; i++){
			if(value == arr[i]){
				return true;
			}//FIN SI
		}//FIN POUR
		return false;
	}//FIN FindValueInArr
}



