
public class proclamation_TEST {

	public static void main(String[] args) {
		computeSumOfCoef_TEST22();
		computeWeightedAverage_TEST_95_45();
		computeWeightedAverage_TEST_52_16();
		computeGrade_TEST_Satisfaction_60();
		computeGrade_TEST_Satisfaction_69_99();
		computeGrade_TEST_Distinction_70();
		computeGrade_TEST_Distinction_79_99();
		computeGrade_TEST_Grand_distinction_80();
		computeGrade_TEST_Grand_distinction_89_99();
		computeGrade_TEST_La_plus_grande_distinction_90();
		computeGrade_TEST_La_plus_grande_distinction_100();
		computeGrade_TEST_nothing_59_99();

	}
	
	public static void computeSumOfCoef_TEST22() {
		int result = proclamation.computeSumOfCoef();
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, 22, result);
	}
	
	public static void computeWeightedAverage_TEST_95_45() {
		double result = proclamation.computeWeightedAverage(22,3);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, 95.45, result, 0.01);
	}
	
	public static void computeWeightedAverage_TEST_52_16() {
		double result = proclamation.computeWeightedAverage(22,6);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, 52.16, result, 0.01);
	}
	
	public static void computeGrade_TEST_Satisfaction_60() {
		String result = proclamation.computeGrade(60, 4);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "Satisfaction", result);
	}
	
	public static void computeGrade_TEST_Satisfaction_69_99() {
		String result = proclamation.computeGrade(69.99, 4);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "Satisfaction", result);
	}
	
	public static void computeGrade_TEST_Distinction_70() {
		String result = proclamation.computeGrade(70, 4);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "Distinction", result);
	}
	
	public static void computeGrade_TEST_Distinction_79_99() {
		String result = proclamation.computeGrade(79.99, 4);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "Distinction", result);
	}
	
	public static void computeGrade_TEST_Grand_distinction_80() {
		String result = proclamation.computeGrade(80, 4);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "Grand distinction", result);
	}
	
	public static void computeGrade_TEST_Grand_distinction_89_99() {
		String result = proclamation.computeGrade(89.99, 4);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "Grand distinction", result);
	}
	
	public static void computeGrade_TEST_La_plus_grande_distinction_90() {
		String result = proclamation.computeGrade(90, 4);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "La plus grande distinction", result);
	}
	
	public static void computeGrade_TEST_La_plus_grande_distinction_100() {
		String result = proclamation.computeGrade(100, 4);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "La plus grande distinction", result);
	}
	
	public static void computeGrade_TEST_nothing_59_99() {
		String result = proclamation.computeGrade(59.99, 4);
		String name = new Object() {}.getClass().getEnclosingMethod().getName();
		Assert.isTrue(name, "", result);
	}

}
