
public class Mario {

	//Constantes globales
	public static int ABSCISSE = 7;
	public static int ORDONNEE = 5;
	public static int NUMBER_OF_BOMBS = 5;
	public static String [][] grid = new String [ORDONNEE][ABSCISSE];


	public static void main(String[] args) {
		//Variables locales
		//Instrucions
		createGrid();
		grid[ORDONNEE/2][ABSCISSE/2] = "Mario";
		fillGridOfBombs();
		showActualGames();
		
		


	}
	
	public static void fillGridOfBombs() {
		//Variable locales
		int x_player = 0;
		int y_player = 0;
		int count = 0;
		//Instructions
		do {
			x_player = Utilities.randInt(0, ORDONNEE - 1);
			y_player = Utilities.randInt(0, ABSCISSE - 1);

			if(grid[x_player][ y_player] !="Mario" && grid[x_player][ y_player] !="Bombe") {
				grid[x_player][ y_player] = "Bombe";
				count ++;
			}//FIN SI
		}
		while(count < NUMBER_OF_BOMBS);
	}
	
	
	public static void showActualGames() {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();

		}
	}
	
	public static void createGrid() {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				grid[i][j] = "_____";
			}
		}
	}
}

