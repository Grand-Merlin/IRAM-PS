
public class mignon_Test {

	public static void main(String[] args) {
		computeTendanceCase_TEST_1_42();
		computeTendanceAdmission_TEST_7_32();
		computeStatus_GREEN_BAISSE_AND_BAISSE();
		computeStatus_ORANGE_HAUSSE_AND_ZERO();
		computeStatus_ORANGE_ZERO_AND_ZERO();
		computeStatus_ORANGE_BAISE_AND_ZERO();
		computeStatus_RED_HAUSSE_AND_HAUSE();

	}

	public static void computeTendanceCase_TEST_1_42() {
		double result = mignon.computeTendanceCase(1);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, 1.42, result, 0.01);
	}

	public static void computeTendanceAdmission_TEST_7_32() {
		double result = mignon.computeTendanceAdmission(1);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, 7.32, result, 0.01);
	}

	public static void computeStatus_GREEN_BAISSE_AND_BAISSE() {
		String result = mignon.computeStatus(-2, -2);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name,"GREEN", result);
	}

	public static void computeStatus_ORANGE_HAUSSE_AND_ZERO() {
		String result = mignon.computeStatus(2, 0);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name,"ORANGE", result);
	}

	public static void computeStatus_ORANGE_ZERO_AND_ZERO() {
		String result = mignon.computeStatus(0, 0);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name,"ORANGE", result);
	}
	
	public static void computeStatus_ORANGE_BAISE_AND_ZERO() {
		String result = mignon.computeStatus(-2, 0);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name,"ORANGE", result);
	}

	public static void computeStatus_RED_HAUSSE_AND_HAUSE() {
		String result = mignon.computeStatus(2, 2);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name,"RED", result);

	}
}
