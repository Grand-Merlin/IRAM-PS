import java.text.DecimalFormat;

public class TL2_1 {

	public static void main(String[] args) {
		//Variables locales
		double rayon = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		//Instructions
		rayon = Utilities.getUser_DoubleInput("Entrez le rayon du cercle en m");
		System.out.println("L’aire du cercle de rayon " + rayon + " est " + df.format(computeAreaCircle(rayon))  + " m²");


	}
	public static double computeAreaCircle(double dbRay) {
	//Variables locales
	//Instructions
		return Math.PI * Math.pow(dbRay, 2);
	}//FIN computeAreaCircle


}
