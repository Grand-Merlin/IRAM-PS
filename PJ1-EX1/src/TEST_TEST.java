import java.util.Arrays;
public class TEST_TEST {

	public static void main(String[] args) {
		celToFar_Test50();
		celToFar_Test104();
		computeWinGrids_test3();
		computePrices_test60();
		checkEnougthPlaceInTheater_TRUE();
		//System.out.println(Arrays.deepToString(cinéma.ACTIVITY));
		int[][] activityTest;
		activityTest = cinéma.computeRemainingPlaces(10, 1);
		System.out.println("activity attendu : {{1, 2 , 200}, {2, 3, 150}, {3, -1, 250}, {4, 0, 100}, {5, -1, 150}, {6, 1, 345}, {7, -1, 400}, {8, 4, 500}};");
		System.out.println("activity actuelle : " + Arrays.deepToString(activityTest));
		
		

	}

	public static void celToFar_Test50() {
		double result = TL3_6.celToFar(10);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, 50, result);
	}

	public static void celToFar_Test104() {
		double result = TL3_6.celToFar(40);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, 104, result);
	}

	public static void computeWinGrids_test3() {
		int[][] tab = {{9,8,7},{4,5,3}};
		int[] win = {1,2,3,4,5,6};
		int result = Lotto.computeWinGrids(tab, win, 1);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, 3, result);
	}

	public static void computePrices_test60() {
		double result = cinéma.computePrices(5,4);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, 60, result);
	}

	public static void checkEnougthPlaceInTheater_TRUE() {
		boolean result = cinéma.checkEnougthPlaceInTheater(0);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, true, result);
	}




}
