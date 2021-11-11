
public class Ex1_14 {

	
	static int Stock[][]= {{19,92}, {6,16},{14,27} ,{4,72} };
	static String Names[]= {"Eau Plate","Coca Cola","Bière pression","Café long"};

	public static void main(String[] args) {
		int userChoice=0, intQuantity=0;

		showStock();
		userChoice = Utilities.getUser_intInput("\nEntrez le N° de consommation", 1, Names.length);

		if  (userChoice == -1) {
			System.out.println("N° non référencé");
		}
		else {
			

			intQuantity = Utilities.getUser_intInput("Entrez le nombre d'unités consommées pour " + Names[userChoice-1] + "\n"
				+ "Quantité actuellement en stock " + Stock[userChoice-1][1] + " - emplacement:" + Stock[userChoice-1][0] ,0);
		     
		    if (intQuantity > Stock[userChoice-1][1] ) { //si quantité de consommations supérieure au stock
			   
			   if (Utilities.checkAnswer("Erreur de saisie ou de quantité en stock avant modification\n"
				   		+ "Annuler ou mettre à Zéro le stock ? A/Z", "Z")){
				   
				   Stock[userChoice-1][1] = 0;
				   System.out.println("Mise à 0 du stock pour " + Names[userChoice-1]);
				   
			   }else {
				   System.out.println("Modification annulée");
			   }//end if  		  
			    
		    }else if (intQuantity >=1) {
			   Stock[userChoice-1][1] = Stock[userChoice-1][1] - intQuantity;
		    }else {
		       System.out.println("Quantité saisie incorrecte");
		    }//end if
		    
		    showStock();
		}//end if
			
		}//fin main


		private static void showStock() {
			
			System.out.println(Names[0]+" N°1, emplacement "+ Stock[0][0]+" - quantité en stock :"+ Stock[0][1]);
			System.out.println(Names[1]+" N°2, emplacement "+ Stock[1][0]+" - quantité en stock :"+ Stock[1][1]); 
			System.out.println(Names[2]+" N°3, emplacement "+ Stock[2][0]+" - quantité en stock :"+ Stock[2][1]); 
			System.out.println(Names[3]+" N°4, emplacement "+ Stock[3][0]+" - quantité en stock :"+ Stock[3][1]); 
			
			
				
			
		}

}
