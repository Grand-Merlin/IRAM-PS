
public class ConversionExplicite {

	public static void main(String[] args) {
		
		short shMaVariableShort;
		int intMaVariableInt = 32768;
		double dblMaVariableDouble=3.7;
		shMaVariableShort = (short)intMaVariableInt;
		intMaVariableInt = (int)dblMaVariableDouble;
		
		System.out.println(shMaVariableShort);
		System.out.println(intMaVariableInt);


	}

}
