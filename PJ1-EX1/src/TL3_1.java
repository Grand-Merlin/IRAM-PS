
public class TL3_1 {

	public static void main(String[] args) {
		//Variables locales
		int tab [] = new int [10];
		int numberToFind = 0;
		boolean checkInArr = false;
		//Instructions
		for(int i = 0; i < tab.length; i++) {
			tab[i] = Utilities.getUser_IntInput("Entrez la valeur " +  (i + 1) + " du tableau ");
		}//FIN POUR

		numberToFind = Utilities.getUser_IntInput("Entrez la valeur entière à vérifier dans la liste saisie ");
		checkInArr = findValue(numberToFind, tab);
		System.out.println("la valeur " + numberToFind +( checkInArr? " se trouve bien dans la liste":" ne se trouve pas dans la liste"));


	}//FIN main
	
	public static boolean findValue(int number, int arr []) {
		//Variables locales
		//Instructions
		for(int i = 0; i < arr.length; i++){
			if(number == arr[i]) {
				return true;	
			}//FIN SI
		}//FIN POUR
		return false;
	}//FIN findValue


}
