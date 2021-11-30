
public class test_boucle_imbriquée {

	public static void main(String[] args) {
		int Tab[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},
				{21,22,23,24,25},{26,27,28,29,30}};
		//Ex A------------------------------------------------
		for(int i = 0; i < Tab.length; i++) {
			for(int j = 0; j < Tab[i].length; j++) {
				System.out.print(Tab[i][j] + " ");
			}
			System.out.println();

		}//fin pour
		//Ex B------------------------------------------------
		System.out.println("--------------------");
		for(int i = 0; i < Tab.length; i++) {
			for(int j = Tab[0].length - 1 ; j >= 0 ; j--) {
				System.out.print(Tab[i][j] + " ");
			}
			System.out.println();

		}//fin pour
		//Ex C------------------------------------------------
		System.out.println("--------------------");
		for(int j = 0; j < Tab[0].length; j++) {
			for(int i = 0; i < Tab.length; i++) {
				System.out.print(Tab[i][j] + " ");
			}
			System.out.println();
		}//fin pour
		//Ex D------------------------------------------------
		System.out.println("--------------------");
		for(int j = Tab[0].length - 1; j >= 0 ; j--) {
			for(int i = Tab.length - 1; i >= 0 ; i--) {
				System.out.print(Tab[i][j] + " ");
			}
			System.out.println();
		}//fin pour
		//Ex E------------------------------------------------
		System.out.println("--------------------");
		for(int j = 0; j < Tab[0].length; j+=2) {
			for(int i = 0; i < Tab.length; i++) {
				System.out.print(Tab[i][j] + " ");
			}
			System.out.println();
		}//fin pour
		//Ex F------------------------------------------------
		System.out.println("--------------------");
		for(int i = 1; i < Tab.length; i+=2) {
			for(int j = 0; j < Tab[i].length; j++) {
				System.out.print(Tab[i][j] + " ");
			}
			System.out.println();
		}//fin pour
		//Ex G------------------------------------------------
		System.out.println("--------------------");
		for(int i = Tab.length - 2; i >= 0 ; i-=2) {
			for(int j = Tab[0].length - 1; j >= 0 ; j--) {
				System.out.print(Tab[i][j] + " ");
			}
			System.out.println();
		}//fin pour
		//Ex H------------------------------------------------
		System.out.println("--------------------");
		System.out.println("\nexercice h)\n");
		//méthode 1
		for(int i=0, j=0;i<Tab.length && j <Tab[0].length ; i++,j++ ) {
		System.out.print(Tab[i][j] + " ");
		}
	}

}
