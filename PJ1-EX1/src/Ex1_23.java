
public class Ex1_23 {

	static int FIRST_RANK = 35;
	static int SEC_RANK = 40;
	static int THIRD_RANK = 45;
	static int Stocks[][]= {{1,5600,200,55}, {2,42,200,60},{3,62,200,125} ,{4,45,200,150},{5,25,200,140},{6,72,200,86},
			{7,40,200,47},{8,48,200,80},{9,24,150,126},{10,36,200,164},{11,15,100,85},{12,25,80,23}};
		
	static String Names[]= {"Spa Reine xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx","Bru Plate","Bru légèrement pétillante","Pepsi", "Spa Orange","Schweppes Tonic",
				"Schweppes Agrumes","Lipton Ice Tea","Lipton Ice Tea Pêche","Jus d'orange Looza","Cécémel","Red Bull"};
	
	public static void main(String[] args) {
		//Variables locales
		String strToPrint ="";
		//Instructions
		for (int i=0; i< Names.length;i++) {
		    
			  strToPrint = Names[i];				
				
				//for each stock datas				
			  strToPrint = placeNumberToRank(strToPrint, Integer.toString(Stocks[i][1]),FIRST_RANK);
			  strToPrint = placeNumberToRank(strToPrint, Integer.toString(Stocks[i][2]),SEC_RANK); 
			  strToPrint = placeNumberToRank(strToPrint, Integer.toString(Stocks[i][3]),THIRD_RANK); 
				
			  System.out.println(strToPrint);	
			}//end for 

	}
	
	public static String placeNumberToRank(String strOriginalStr, String strNumberToPlace, int rank){
	//Variables locales
	String strSpaces = "";
	int spaceCount = 0;
	//Instructions
	spaceCount = rank - strOriginalStr.length() - strNumberToPlace.length();
	if(spaceCount > 0) {
		
		for(int i = 0; i < spaceCount; i++) {
  		  strSpaces = strSpaces +  " ";
  	  }
       
        return strOriginalStr + strSpaces + strNumberToPlace;
	}
		
	      else {
	    	  return strOriginalStr.substring(0, rank - strNumberToPlace.length() - 1)   + " "+ strNumberToPlace;
	      }
	    
	}


}
