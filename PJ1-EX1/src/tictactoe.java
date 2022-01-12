
public class tictactoe {

	public static String WELCOM_MESS = "Bienvenue dans le Tic Tac Toe";
	public static void main(String[] args) {
		//Variables locales
		String player = "";
		String letter ="";
		String[] tabOfPlayer;
		String[][] grid;
		int numWin = 0;
		int numOne = 0;
		int numTwo = 0;
		int count = 1;
		String numOfCase = "";
		//Instructions
		System.out.println(WELCOM_MESS);
		grid = new String[][] {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
		tabOfPlayer = new String[] {"-1", "-1", "-1", "-1"};;
		player = Utilities.getUser_StringInput("Joueur 1, Entrez votre prénom");
		letter = Utilities.getUserSpecificInput("Bonjour " + player + " veux-tu jouer X ou O", "XO");
		tabOfPlayer = accociatePlayerToLetter(player, letter, tabOfPlayer);

		player = Utilities.getUser_StringInput("Joueur 2, Entrez votre prénom");
		if(tabOfPlayer[1].equals("O")) {
			letter = "X";
		}else{
			letter = "O";
		}//FIN SI
		tabOfPlayer = accociatePlayerToLetter(player, letter, tabOfPlayer);
		
		
		numOne = Utilities.getUser_IntInput(tabOfPlayer[0] + " entre un chiffre de 1 à 10");
		numTwo = Utilities.getUser_IntInput(tabOfPlayer[2] + " entre un chiffre de 1 à 10");
		numWin = computeFirstPlayer(numOne,numTwo);
		
		if(numOne == numWin) {
			count++;
		}//FIN SI
		do {
			showGrid(grid);
			if(count % 2 == 0) {
				System.out.println("C'est à " + tabOfPlayer[0] + " de jouer");
				numOfCase = Utilities.getUser_StringInput("choisi le chiffre d'une case");
				grid = fillGrid(grid, tabOfPlayer[1], numOfCase);
				count++;
			}else {
				System.out.println("C'est à " + tabOfPlayer[2] + " de jouer");
				numOfCase = Utilities.getUser_StringInput("choisi le chiffre d'une case");
				grid = fillGrid(grid, tabOfPlayer[3], numOfCase);
				count++;
			}//FIN SI
		}while(!computeWin(grid, tabOfPlayer));
		showGrid(grid);
		
	}//FIN main

	public static int computeFirstPlayer(int numOne, int numTwo) {
		//Variables locales
		int random = 0;
		//Instructions
		random = Utilities.randInt(1, 10);
		if(Math.abs(random - numOne) < Math.abs(random - numTwo)) {
			return numOne;
		}//FIN SI
		return numTwo;
	}//FIN computeFirstPlayer

	public static void showGrid(String[][] grid){
		//Variables locales
		//Instructions
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}//FIN POUR
			System.out.println();
		}//FIN POUR
	}//FIN showGrid

	public static String[][] fillGrid(String[][] grid, String letter, String numOfCase){
		//Variables locales
		//Instructions
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(grid[i][j].equals(numOfCase) && letter != numOfCase) {
					grid[i][j] = letter;
					return grid;
				}//FIN SI
			}//FIN P||R
		}//FIN P||R
		return grid;
	}//FIN fillGrid

	public static boolean computeWin(String[][] grid, String[]tabOfPlayer) {
		//Variables locales
		//Instructions
		if(grid[0][0] == tabOfPlayer[1] && grid[0][1] == tabOfPlayer[1] && grid[0][2] == tabOfPlayer[1] ||
				grid[0][0] == tabOfPlayer[3] && grid[0][3] == tabOfPlayer[3] && grid[0][2] == tabOfPlayer[3]) {
			return true;
		}else if(grid[0][0] == tabOfPlayer[1] && grid[1][1] == tabOfPlayer[1] && grid[2][2] == tabOfPlayer[1] || grid[0][0] == tabOfPlayer[3] && grid[1][1] == tabOfPlayer[3] && grid[2][2] == tabOfPlayer[3]){
			return true;
		}else if(grid[0][0] == tabOfPlayer[1] && grid[1][0] == tabOfPlayer[1] && grid[2][0] == tabOfPlayer[1] || grid[0][0] == tabOfPlayer[3] && grid[1][0] == tabOfPlayer[3] && grid[2][0] == tabOfPlayer[3]){
			return true;
		}else if(grid[0][2] == tabOfPlayer[1] && grid[1][2] == tabOfPlayer[1] && grid[2][2] == tabOfPlayer[1] || grid[0][2] == tabOfPlayer[3] && grid[1][2] == tabOfPlayer[3] && grid[2][2] == tabOfPlayer[3]){
			return true;
		}else if(grid[0][1] == tabOfPlayer[1] && grid[1][1] == tabOfPlayer[1] && grid[2][1] == tabOfPlayer[1] || grid[0][1] == tabOfPlayer[3] && grid[1][1] == tabOfPlayer[3] && grid[2][1] == tabOfPlayer[3]){
			return true;
		}else if(grid[0][2] == tabOfPlayer[1] && grid[1][1] == tabOfPlayer[1] && grid[2][0] == tabOfPlayer[1] || grid[0][2] == tabOfPlayer[3] && grid[1][1] == tabOfPlayer[3] && grid[2][0] == tabOfPlayer[3]){
			return true;
		}else if(grid[2][0] == tabOfPlayer[1] && grid[2][1] == tabOfPlayer[1] && grid[2][2] == tabOfPlayer[1] || grid[2][0] == tabOfPlayer[1] && grid[2][1] == tabOfPlayer[1] && grid[2][2] == tabOfPlayer[1]){
			return true;
		}else if(grid[1][0] == tabOfPlayer[1] && grid[1][1] == tabOfPlayer[1] && grid[1][2] == tabOfPlayer[1] || grid[1][0] == tabOfPlayer[3] && grid[1][1] == tabOfPlayer[3] && grid[1][2] == tabOfPlayer[3]){
			return true;
		}//FIN SI
		return false;
	}//FIN computeWin

	public static String[] accociatePlayerToLetter(String player, String letter, String[] tabOfPlayer) {
		//Variables locales
		//Instructions
		for(int i = 0; i < tabOfPlayer.length; i++) {
			if(tabOfPlayer[i].equals("-1")) {
				tabOfPlayer[i] = player;
				tabOfPlayer[i + 1] = letter;
				return tabOfPlayer;
			}//FIN SI
		}//FIN POUR
		return tabOfPlayer;
	}//FIN accociatePlayerToLetter
}
