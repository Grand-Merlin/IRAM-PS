
public class Test {
	
	final static String Names[] = {"Spa reine 25 ","Bru plate 50","Bru pét 50",
			"Pepsi","Spa orange", "Schweppes Tonic","Schweppes Agr","Ice Tea","Ice Tea Pêche",
			"Jus d'orange Looza", "Cécémel", "Red Bull"};
	static int Stock[][]= {{1,56,200,55}, {2,42,200,60},{3,62,200,125} ,{4,45,200,150},{5,25,200,140},{6,72,200,86},{7,40,200,47},{8,48,200,80},{9,24,150,126},{10,36,200,164},{11,15,100,85},{12,25,80,23}};

	public static void main(String[] args) {
		for(int i = 0; i < Names.length; i++) {
			System.out.println();
			System.out.print("N°" + Stock[i][0] + " " + Names[i]);
			for(int j = 1; j < Stock[0].length; j++) {
				System.out.print(" " + Stock[i][j]);
			}
		}

		
		
		
		
		
		
		String toto;
		toto = Utilities.getUserSpecificInput("temperature", "cfc");
		System.out.println(toto);
		
		
		
		
		double x1,x2,x3;
		x1=3331720f;
		x2=0.625f;
		x3=x1+x2;
		System.out.println(x3);
		x1=123456789f;
		x3=5+x1;
		x3=x3-x1;
		System.out.println(x3);
		x1=853000000f;
		x2= 7400000f;
		x3=x1+x2;
		System.out.println(x3);
		x1=0.00000000000853;
		x2=0.000000000000074;//legere imprésition
		x3=x1+x2;
		System.out.println(x3);
		x1=0.00000000000853;
		x2=0.000000000000074;
		x3=10.0f+x1+x2;
		System.out.println(x3);

	}

}
