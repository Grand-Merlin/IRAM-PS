
public class MarioV2 {

	//Constantes globales
	public static int ABSCISSE = 7;
	public static int ORDONNEE = 5;
	public static String UP = "U";
	public static String DOWN = "D";
	public static String LEFT = "L";
	public static String RIGHT = "R";
	public static int NBR_OF_HELP = 3;
	public static int NBR_OF_BOMBS = 5;
	public static void main(String[] args) {
		//Variables locales
		int[][] bombsPos;
		int[] marioPos;
		boolean gameOver = false;
		boolean victory = false;
		
		//Instructions
		marioPos = marioInitialPos();
		bombsPos = computeBombsPos(marioPos);
		showBombsPos(bombsPos);
		System.out.println();
		do {
			marioPos = computeMarioPos (marioPos, bombsPos);
			gameOver = computeGameOver(marioPos, bombsPos);
			victory = computeVictory(marioPos);
		}while(!gameOver && !victory);
		
		
		

	}

	public static int [][]computeBombsPos(int[] marioPos){
		//Variables locales
		int[][]bombsPos;
		boolean notInMarioInitialPos = false;
		boolean notInOtherBombs = false;
		//Instructions
		bombsPos = new int [NBR_OF_BOMBS][2];
		for(int i = 0; i < bombsPos.length; i++) {
			do {
			bombsPos [i][0] = Utilities.randInt(0, ABSCISSE);
			bombsPos [i][1] = Utilities.randInt(0, ORDONNEE);
			notInMarioInitialPos = Utilities.isAlreadyInTab(marioPos[0], marioPos[i] , bombsPos);
			notInOtherBombs = Utilities.isAlreadyInTab(bombsPos [i][0], bombsPos [i][1], bombsPos);
			}while(!notInOtherBombs && ! notInMarioInitialPos);
		}//FIN POUR
		return bombsPos;
	}//FIN computeBombsPos



	public static int[] computeMarioPos (int[] marioPos, int [][]bombsPos) {
		//Variables locales
		String direction;
		//Instructions
		if(NBR_OF_HELP <= NBR_OF_HELP && NBR_OF_HELP > 0) {
			direction = Utilities.getUserSpecificInput("Pos actu (" + marioPos[0] + "," + marioPos[1] + ")"  +" déplacement " + RIGHT + LEFT + UP + DOWN + "?" +" (" + NBR_OF_HELP + ")", "RLUD?");
		}else {
			direction = Utilities.getUserSpecificInput("Pos actu (" + marioPos[0] + "," + marioPos[1] + ")"  +" déplacement "+ RIGHT + LEFT + UP + DOWN +  " (" + NBR_OF_HELP + ")", "RLUD");
		}//FIN SI
		if(direction.contains(UP)) {
			marioPos[0]--;
		}else if(direction.contains(DOWN)) {
			marioPos[0]++;
		}else if(direction.contains(RIGHT)) {
			marioPos[1]++;
		}else if (direction.contains(LEFT)){
			marioPos[1]--;
		}else {
			getBombsAroundMario(marioPos, bombsPos);
			NBR_OF_HELP --;
		}//FIN SI
		return marioPos;
	}//FIN computeMarioPos



	public static boolean computeGameOver(int[] marioPos, int [][]bombsPos) {
		//Variables locales
		//Instructions
		for(int i = 0; i < bombsPos.length; i++) {
			if(marioPos[0] == bombsPos[i][0] && marioPos[1] == bombsPos[i][1]) {
				System.out.println("Bombe touchée - Vous avez perdu!");
				return true;
			}//FIN SI
		}//FIN POUR
		return false;
	}//FIN computeGameOver



	public static boolean computeVictory(int[] marioPos) {
		//Variables locales
		//Instructions
		if(marioPos[0] < 0 || marioPos[0] > ABSCISSE || marioPos[1] < 0 || marioPos[1] > ORDONNEE) {
			System.out.println("Félicitations, vous avez gagné !");
			return true;
		}//FIN SI
		return false;
	}//FIN computeVictory



	public static boolean getBombsAroundMario(int[] marioPos, int [][]bombsPos) {
		//Variables locales
		//Instructions
		for(int i = 0; i < bombsPos.length; i++) {
			if(marioPos[0] ++ == bombsPos[i][0] ||
					marioPos[0] -- == bombsPos[i][0] ||
					marioPos[1] ++ == bombsPos[i][1] ||
					marioPos[1] -- == bombsPos[i][1]) {
				System.out.println("Bombe !");
				return true;
			}else {
				System.out.println("Libre !");
			}//FIN SI
		}//FIN POUR
		return false;
	}//FIN getBombsAroundMario



	public static void showBombsPos(int [][]bombsPos) {
		//Variables locales
		//Instructions
		for(int i = 0; i < bombsPos.length; i++) {
			System.out.print("(" + bombsPos[i][0] + "," + bombsPos[i][1] + ")"); 
		}//FIN POUR

	}//FIN showBombsPos


	public static int[] marioInitialPos() {
		//Variables locales
		int[] marioPos;
		//Instructions
		marioPos= new int [50];
		marioPos[0] = ORDONNEE/2;
		marioPos[1] = ABSCISSE/2;
		return marioPos;
	}//FIN marioInitialPos
}
