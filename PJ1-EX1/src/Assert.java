
public class Assert {
	
	public static void isTrue(String testName, int expected, int result) {
		System.out.println(testName + " " + (expected == result? "OK":"FAILED"));
	}//FIN isTrue	
	public static void isTrue(String testName, String expected, String result) {
		System.out.println(testName + " " + (expected == result? "OK":"FAILED"));
	}//FIN isTrue
	public static void isTrue(String testName, double expected, double result) {
		System.out.println(testName + " " + (expected == result? "OK":"FAILED"));
	}//FIN isTrue
	public static void isTrue(String testName, boolean expected, boolean result) {
		System.out.println(testName + " " + (expected == result? "OK":"FAILED"));
	}//FIN isTrue
	public static void isTrue(String testName, int[][] expected, int[][] result) {
		System.out.println(testName + " " + (expected == result? "OK":"FAILED"));
	}//FIN isTrue

}
