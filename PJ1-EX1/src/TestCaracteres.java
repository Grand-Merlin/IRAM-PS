
public class TestCaracteres {

	public static void main(String[] args) {
		
		char chCharTest='a';
		System.out.println(chCharTest + "h d'accord!");
		
		
		char chCharTest1=90;// num ascii du Z
		System.out.println("Le caractère " +chCharTest1 + " a pour point de code " + (int)chCharTest1);
		
		
		char chCharTest2=50;// num ascii du 2
		System.out.println("Le caractère " +chCharTest2 + " a pour point de code " + (int)chCharTest2);
		
		
		char chPremierCharTest=50;// 2
		char chDeuxiemeCharTest=54;// 6
		int intTroisiemeCharTest;
		intTroisiemeCharTest = (int)chPremierCharTest + (int)chDeuxiemeCharTest;
		System.out.println(chPremierCharTest + "+" + chDeuxiemeCharTest + "=" +(char)intTroisiemeCharTest );//104 = h ascii

	}

}
