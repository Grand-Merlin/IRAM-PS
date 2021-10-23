import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TestArrondi {

	public static void main(String[] args) {
		float x1,x2,x3,x4,x5;
		DecimalFormat DfFormat1 = new DecimalFormat("0.0000");// force 4 decimales
		DecimalFormat DfFormat2 = new DecimalFormat("#.####");// ne met pas les zero inutils et maximum 4 décimales
		DecimalFormat DfFormat3 = new DecimalFormat("0.00");//force 2 décimales (ticket de caisse)
		 
		 x1=52945000000000.0f;
		 x2=3000000000.0f;
		 x3=x1+x2;
		 x4=15.0f/4.0f;
		 x5=1.2f/7.0f;
		 
		 System.out.println("x3 sans format : " + x3);
		 System.out.println("x3 Format 1 0.0000 : " + DfFormat1.format(x3));
		 System.out.println("x3 Format 2 #.#### : " + DfFormat2.format(x3));
		 
		 System.out.println("x4 sans format : " + x4);
		 System.out.println("x4 Format 1 0.0000 : " + DfFormat1.format(x4));
		 System.out.println("x4 Format 2 #.#### : " + DfFormat2.format(x4));
		 
		 System.out.println("x5 sans format : " + x5);
		 System.out.println("x5 Format 1 0.0000 : " + DfFormat1.format(x5));
		 System.out.println("x5 Format 2 #.#### : " + DfFormat2.format(x5));
		 System.out.println("x5 Format 3 0.00 : " + DfFormat3.format(x5));
		 //Pour identifier les arrondis effectués par DEcimalFormat
		DfFormat3.setRoundingMode(RoundingMode.HALF_UP);
		 System.out.println("37.624 Format 3 0.00 half up : " + 
		DfFormat3.format(37.624));
		 System.out.println("37.625 Format 3 0.00 half up : " + 
		DfFormat3.format(37.625));
		 System.out.println("37.626 Format 3 0.00 half up : " + 
		DfFormat3.format(37.626));
		 System.out.println("37.6 Format 3 0.00 half up : " + 
		DfFormat3.format(37.6));
		 
		 DfFormat3.setRoundingMode(RoundingMode.HALF_DOWN);
		 System.out.println("37.624 Format 3 0.00 half down : " + 
		DfFormat3.format(37.624));
		 System.out.println("37.625 Format 3 0.00 half down : " + 
		DfFormat3.format(37.625));
		 System.out.println("37.626 Format 3 0.00 half down : " + 
		DfFormat3.format(37.626));

	}

}
