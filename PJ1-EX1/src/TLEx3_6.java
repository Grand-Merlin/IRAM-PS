
public class TLEx3_6 {

	public static void main(String[] args) {
		//Variables locales
		double temperature = 0.0;
		//Instructions
		temperature = Utilities.getUser_DoubleInput("Entrez la temp�rature � convertir ");
		System.out.println((Utilities.getUserSpecificInput("Votre saisie est en Celsius ou Farenheit C/F ? ", "cf").contains("C"))?"la conversion Farenheit de " + temperature +" degr�s Celsius est " + celToFar(temperature):"la conversion Celsius de " + temperature +" degr�s Farenheit est " + farToCel(temperature));

	}//fin main
	public static double celToFar(double tempCel ) {
		//Variables locales
		//Instructions
		return (tempCel * 9/5) + 32;
	}//fin celToFar
	
	public static double farToCel(double tempFar) {

		//Variables locales
		//Instructions
		return (tempFar - 32) * 5/9;
	}//fin farToCel
}
