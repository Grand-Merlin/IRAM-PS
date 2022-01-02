
public class TEST_TEST {

	public static void main(String[] args) {
		celToFar_Test50();
		celToFar_Test104();
		computeWinGrids_test3();

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

}
