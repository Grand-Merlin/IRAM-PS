
public class Lotto {

	//Constantes globales
	public static int[] WIN_NUMBERS = {41, 12, 2, 35, 29, 1};

	public static void main(String[] args) {
		//Variables locales
		int[][] numbers;
		int countNum;
		int nbrOfGrid = 0;
		int i = 0;
		//Instructions
		nbrOfGrid = Utilities.getUser_IntInput("Entrez le nombre de grilles");
		numbers = createGrid(nbrOfGrid);
		System.out.println("-------Résultats du Lotto--------- ");
		do {
			countNum = computeWinGrids(numbers, WIN_NUMBERS, i);
			showResult(countNum, (i + 1));
			i++;
		}while(i < nbrOfGrid);

	}//FIN MAIN

	public static int[][] createGrid(int nbrOfGrid){
		//Variables locales
		int[][] numbers;
		int num = 0;
		//Instructions
		numbers = new int [nbrOfGrid][6];
		for(int i = 0; i < nbrOfGrid; i++) {
			System.out.println("-------Grille N° " + (i + 1) + "---------");
			for(int j = 0; j < 6; j++) {
					num = Utilities.getUser_IntInput("Entrez le nombre N° " + (j + 1), 1, 42);
					if(!checkDuplicate(num, numbers, i)) {
						numbers[i][j] = num;
					} else{
						System.out.println("Ce nombre se trouve déjà dans la grille");
						j--;
					}//FIN SI

			}//FIN POUR
		}//FIN POUR
		return numbers;
	}//FIN createGrid

	public static int computeWinGrids(int[][] tab, int[] winsNums, int indexGrid){
		//Variables locales
		int count = 0;
		//Instructions
		for(int i = 0; i < winsNums.length; i++) {
			for(int j = 0; j < tab[indexGrid].length; j++) {
				if(winsNums[i] == tab[indexGrid][j]) {
					count++;
				}//FIN SI
			}//FIN POUR
		}//FIN POUR
		return count;
	}//FIN computeWinGrids

	public static void showResult(int countNum, int numberOfGrid){
		System.out.println("La grille N° " + numberOfGrid + (countNum > 2? " remporte un " + countNum:" ne gagne pas"));
	}

	public static boolean checkDuplicate(int num, int[][] numbers, int index) {
		for(int i = 0; i < numbers[index].length; i++) {
				if(numbers[index][i] == num) {
					return true;
				}
			}
		return false;
	}
}
