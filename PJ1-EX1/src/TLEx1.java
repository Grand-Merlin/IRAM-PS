public class TLEx1 {

	public static void main(String[] args) {
		//Variables locales
		double dbRayon = 0.0;
		//Instructions
		dbRayon = Utilities.getUser_DoubleInput("Entrez le rayon du cercle en m");
		System.out.println("l'aire du cercle de rayon " + dbRayon + " m est " + calculAireCercle(dbRayon) + " m²");

	}
	
	/**
	 * Calcule l'aire d'un cercle
	 * @param rayon en m
	 * @return aire = pi * rayon² exprimé en m²
	 */
	public static double calculAireCercle(double rayon) {
		//Variables locales
		//Instructions
		return Math.pow(rayon, 2) * Math.PI;
	}//fin calculAireCercle

}
