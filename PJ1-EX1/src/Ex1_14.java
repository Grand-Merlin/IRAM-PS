
public class Ex1_14 {

	
	static int Stock[][]= {{19,92}, {6,16},{14,27} ,{4,72} };
	static String Names[]= {"Eau Plate","Coca Cola","Bi�re pression","Caf� long"};

	public static void main(String[] args) {
		int userChoice=0, intQuantity=0;

		showStock();
		userChoice = Utilities.getUser_intInput("\nEntrez le N� de consommation", 1, Names.length);

		if  (userChoice == -1) {
			System.out.println("N� non r�f�renc�");
		}
		else {
			

			intQuantity = Utilities.getUser_intInput("Entrez le nombre d'unit�s consomm�es pour " + Names[userChoice-1] + "\n"
				+ "Quantit� actuellement en stock " + Stock[userChoice-1][1] + " - emplacement:" + Stock[userChoice-1][0] ,0);
		     
		    if (intQuantity > Stock[userChoice-1][1] ) { //si quantit� de consommations sup�rieure au stock
			   
			   if (Utilities.checkAnswer("Erreur de saisie ou de quantit� en stock avant modification\n"
				   		+ "Annuler ou mettre � Z�ro le stock ? A/Z", "Z")){
				   
				   Stock[userChoice-1][1] = 0;
				   System.out.println("Mise � 0 du stock pour " + Names[userChoice-1]);
				   
			   }else {
				   System.out.println("Modification annul�e");
			   }//end if  		  
			    
		    }else if (intQuantity >=1) {
			   Stock[userChoice-1][1] = Stock[userChoice-1][1] - intQuantity;
		    }else {
		       System.out.println("Quantit� saisie incorrecte");
		    }//end if
		    
		    showStock();
		}//end if
			
		}//fin main


		private static void showStock() {
			
			System.out.println(Names[0]+" N�1, emplacement "+ Stock[0][0]+" - quantit� en stock :"+ Stock[0][1]);
			System.out.println(Names[1]+" N�2, emplacement "+ Stock[1][0]+" - quantit� en stock :"+ Stock[1][1]); 
			System.out.println(Names[2]+" N�3, emplacement "+ Stock[2][0]+" - quantit� en stock :"+ Stock[2][1]); 
			System.out.println(Names[3]+" N�4, emplacement "+ Stock[3][0]+" - quantit� en stock :"+ Stock[3][1]); 
			
			
				
			
		}

}
