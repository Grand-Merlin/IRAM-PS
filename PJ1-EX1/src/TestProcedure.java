
public class TestProcedure {

	public static void main(String[] args) {
		
		MaProcedurePrixSolde(100.0,15.0);//appel procédure
		MaProcedurePrixSolde(200.0,40.0);//appel procédure
		MaProcedurePrixSolde(50.0,10.0);//appel procédure
		}//fin main
		
	static void MaProcedurePrixSolde(double PrixAffiche, double PctRemise){
		double PrixAPayer=0;
		PrixAPayer = PrixAffiche - (PctRemise/100)*PrixAffiche; System.out.println("A Payer " + PrixAPayer + "€");

	}

}
