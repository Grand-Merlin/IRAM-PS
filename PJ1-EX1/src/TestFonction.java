
public class TestFonction {

	public static void main(String[] args) {
		
		System.out.println("A Payer " + CalculerPrixSolde(100.0,15.0) + "€");
	}//fin main
	
	

	static double CalculerPrixSolde(double PrixAffiche, double PctRemise){
		
		double PrixAPayer = 0.0;
		
		PrixAPayer= PrixAffiche - (PctRemise/100)*PrixAffiche;
		
		return PrixAPayer;
		
		//return PrixAPayer= PrixAffiche - (PctRemise/100)*PrixAffiche; //autre methode opti
		
	}//fin CalculerPrixSolde

}
