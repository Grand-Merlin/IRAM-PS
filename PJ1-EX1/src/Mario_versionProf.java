import java.util.Random;
import java.util.Scanner;

public class Mario_versionProf {

	final static int BOMBS_NUMBER = 5;
	final static int X_MAX = 6;
	final static int Y_MAX = 4;
	final static int HELP_MAX_NUM = 3;
	final static String WIN_MSG = "Félicitations, vous avez gagné !";
	final static String GAME_OVER_MSG = "Bombe touchée - Vous avez perdu!";
	final static String R="R"; //right déplacement
	final static String L="L"; //left déplacement
	final static String U="U"; //up déplacement
	final static String D="D"; //down déplacement
	final static String AUTH_ANSW = R+L+U+D+"?";
	final static String MOVE_ANSW = R+L+U+D;

	public static void main(String[] args) {
		String strAnsw, inviteMsg;
		int helpNum = HELP_MAX_NUM;
		int playPos[]= getPlayerInitialPos(X_MAX,Y_MAX);		  
		int [][] bombsPos = getBombsTab(BOMBS_NUMBER,X_MAX,Y_MAX,playPos );

		showTab(bombsPos);		
		do {
			inviteMsg = "\nPos actu " + "(" + playPos[0] + "," + playPos[1] + ") déplacement "
					+ (helpNum > 0 ? AUTH_ANSW + "(" + helpNum + ")": MOVE_ANSW);
			strAnsw = getUserSpecificInput(inviteMsg,  helpNum > 0 ? AUTH_ANSW : MOVE_ANSW );

			if (MOVE_ANSW.indexOf(strAnsw) >=0) {//choix de lettre correspondant à un déplacement
				movePlayer(strAnsw,playPos);
			}else {                              //choix de lettre correspondant à un ?
				helpNum--;
				checkBombsAround(playPos,bombsPos );
			}

		}while(!winOrLoose(playPos,X_MAX, Y_MAX, bombsPos));

	}

	private static boolean winOrLoose(int [] playPos, int x_max, int y_max, int [][] bombs) {

		if (isAlreadyInTab(playPos[0],playPos[1],bombs)) {
			System.out.println(GAME_OVER_MSG );
			return true;
		}else if (playPos[0] > x_max || playPos[0] < 0 || playPos[1] < 0 || playPos[1] > y_max  ) {
			System.out.println(WIN_MSG);
			return true;
		}  
		return false;

	} 

	private static void checkBombsAround(int playPos[],int bombsPos[][] ) {

		if (isAlreadyInTab(playPos[0]+1,playPos[1],bombsPos) ||
				isAlreadyInTab(playPos[0]-1,playPos[1],bombsPos) ||
				isAlreadyInTab(playPos[0],playPos[1]+1,bombsPos) ||
				isAlreadyInTab(playPos[0],playPos[1]-1,bombsPos)){

			System.out.println("Boom");
		}else {
			System.out.println("Libre");
		}
	}

	private static void movePlayer(String Answ, int[] playPos) {

		if (Answ.equals(R)) {
			playPos[0] ++;
		}else if( Answ.equals(L)){
			playPos[0] --;
		}else if (Answ.equals(U)){  
			playPos[1] ++;
		}else if (Answ.equals(D)){ 
			playPos[1] --;
		}

	}


	private static int[] getPlayerInitialPos(int x_max, int y_max){

		int[] PlayerPos = new int[2];

		PlayerPos[0]= x_max / 2;
		PlayerPos[1]= y_max / 2;
		return PlayerPos;

	}

	private static int[][] getBombsTab(int numBombs, int x_max, int y_max, int[] playPos ){

		int[][] bombsTab = new int[numBombs][2];
		int x=0,y=0;
		for(int i=0; i< numBombs ;i++) {

			do {  //boucle répéter car on ne sait pas combien de fois il va falloir passer ds la boucle
				x= randInt(0,x_max);
				y= randInt(0,y_max);
			}while(isAlreadyInTab(x,y,bombsTab) || (x == playPos[0] && y == playPos[1]));

			bombsTab[i][0]= x;
			bombsTab[i][1]= y;

		}		
		return bombsTab;

	}

	private static boolean isAlreadyInTab(int x, int y , int tab[][]) {


		for(int i=0;i< tab.length;i++) {

			if (tab[i][0]==x && tab[i][1]==y) {
				return true;
			}
		}
		return false;

	}

	private static void showTab(int [][] TabToShowCoord) {

		for(int i=0;i<TabToShowCoord.length;i++ ) {
			System.out.print("(" + TabToShowCoord[i][0]+ "," + TabToShowCoord[i][1] + ")");

		}

	}


	public static int randInt(int min, int max) {

		Random rand = new Random();
		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min)+1 ) + min;

		return randomNum;
	}//en randInt



	public static String getUserSpecificInput(String msg, String expectedAnswers ) {

		String strAnswer;
		Scanner sc= new Scanner(System.in);	
		do {			
			System.out.println(msg);
			strAnswer= sc.next().trim().toUpperCase();
			//if only one char and if this char is in the expected answer string
			if (strAnswer.length()==1 && expectedAnswers.indexOf(strAnswer)>=0 ) {
				return strAnswer;

			}else {
				System.out.println("Erreur de saisie, votre choix doit être parmi "
						+ expectedAnswers  + " une lettre seulement");
			}

		}while (true);//end do while
	}
}
