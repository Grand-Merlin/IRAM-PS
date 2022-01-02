import java.text.DecimalFormat;

public class TL3_6 {

	public static void main(String[] args) {
		//Variables locales
		double temperature = 0.0;
		DecimalFormat df = new DecimalFormat("0.00");
		//Instructions
		temperature = Utilities.getUser_DoubleInput("Entrez la température à convertir");
		System.out.println("la conversion" + ((Utilities.checkAnswer("Votre saisie est en Celsius ou Farenheit C/F ?", "C"))? " Farenheit " + temperature + " degrés Celsius est " + df.format(celToFar(temperature)):" Celsius " + temperature +" degrés Farenheit est " + df.format(farToCel(temperature))));

	}
	
	public static double celToFar(double celsius) {
	//Variables locales
	//Instructions
	return (celsius * 9/5) + 32;
	}//FIN celToFar
	
	public static double farToCel(double farenheit) {
	//Variables locales
	//Instructions
	return (farenheit - 32) * 5/9;
	}//FIN farToCel



}
