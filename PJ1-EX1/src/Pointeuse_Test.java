import java.util.Random;

public class Pointeuse_Test {

	public static void main(String[] args) {

		int toto = Pointeuse.ComputeWorkTime("09:05", "16:55");
		System.out.print(toto);
		
		int addtime = Pointeuse.ComputeAdditionalHours(toto);
		System.out.print(" " + addtime);
		
		String letter = Pointeuse.EvaluationLetter(addtime);
		System.out.print(" " + letter);
		
		
	}
	

}
