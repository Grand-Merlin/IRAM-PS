
public class Ex1_22vrattrap {

	//Variables globales
	//Constantes
	public static int Stocks [][] = {{1,56,200,55}, {2,42,200,60},{3,62,200,125} ,{4,45,200,150},{5,25,200,140},{6,72,200,86},{7,40,200,47},{8,48,200,80},{9,24,150,126},{10,36,200,164},{11,15,100,85},{12,25,80,23}};
	public static String Names [] = {"Spa Reine","Bru Plate","Bru l�g�rement p�tillante","Pepsi", "Spa Orange","Schweppes Tonic","Schweppes","Agrumes","Lipton Ice Tea","Lipton Ice Tea P�che","Jus d'orange Looza","C�c�mel","Red Bull"};


	public static void main(String[] args) {

		showRecap();

	}

	public static void showRecap() {
		//Variables locales
		//Instructions
		for(int i = 0; i < Names.length - 1; i++){
			System.out.print("N�");
			for(int j = 0; j < Stocks[i].length; j++){
				System.out.print(" " + Stocks[i][j]);
			}//FIN pour
			System.out.println();
		}//FIN POUR
	}//FIN showRecap


}
