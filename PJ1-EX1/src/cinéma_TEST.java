import java.util.Arrays;

public class cinéma_TEST {

	public static void main(String[] args) {
		int[][] activityTest;
		activityTest = cinéma.computeRemainingPlaces(5, 1);
		System.out.println("activity attendu : {{1, 2 , 200}, {2, 3, 150}, {3, -1, 250}, {4, 0, 100}, {5, -1, 150}, {6, 1, 345}, {7, -1, 400}, {8, 4, 500}};");
		System.out.println("activity actuelle : " + Arrays.deepToString(activityTest));
		checkEnougthPlaceInTheater_TRUE();
		computePrices_47_5();
		checkEnougthPlacesInEntireCinema_FALSE();

	}
	
	public static void checkEnougthPlaceInTheater_TRUE() {
		boolean result = cinéma.checkEnougthPlaceInTheater(0);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, true, result);
	}
	public static void checkEnougthPlaceInTheater_FALSE() {
		boolean result = cinéma.checkEnougthPlaceInTheater(0);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, true, result);
	}
	
	public static void computePrices_47_5() {
		double result = cinéma.computePrices(5, 0);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, 47.5, result);
	}
	
	public static void checkEnougthPlacesInEntireCinema_FALSE() {
		boolean result = cinéma.checkEnougthPlacesInEntireCinema();
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, false, result);
	}


}
