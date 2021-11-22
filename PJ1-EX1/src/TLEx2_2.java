import java.util.Scanner;

public class TLEx2_2 {

	public static void main(String[] args) {
		//Variables locales
		int arr [] = { 15, 25, 0, 35, 48 , 2, 0, 89, 100, 7};
		boolean nbrFind;
		//Instructions
		nbrFind = findValueInArray(35, arr);
		System.out.println(nbrFind);
		
	}
	
	public static boolean findValueInArray(int nbr, int array []) {
		//Variables locales
		int i = 0;
		//Instructions
		while (i < array.length)
			if(nbr == array[i]) {
				return true;
			}else{
				i++;
			}//fin if
		return false;
	}//fin findValueInArray

}
