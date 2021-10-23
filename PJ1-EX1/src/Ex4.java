
public class Ex4 {

	public static void main(String[] args) {
		
		int intEx1 = 0b0111;
		short shEx1 = 0b0111;
		byte byEx1 = 0b0111;	
		int intEx2 = 0b1010101;
		short shEx2 = 0b1010101;
		byte byEx2 = 0b1010101;
		int intEx3 = 0b10110011;
		short shEx3 = 0b10110011;
		//byte byEx3 = 0b10110011;
		byte by2Ex3 = (byte)0b10110011;	
		int intEx4 = 0b00000000;
		short shEx4 = 0b00000000;
		byte byEx4 = 0b00000000;	
		int intEx5 = 0b10111011100000;
		short shEx5 = 0b10111011100000;
		//byte byEx5 = 0b10111011100000;
		long lngEx6 = 0b1010101001010000;	
		int intEx6 = 0b1010101001010000;
		//short shEx6 = 0b1010101001010000;
		//byte byEx6 = 0b1010101001010000;	
		int intEx8 = 2147483647;
		//int intEx8 = 2147483648;
		long lngEx8 = 2147483648L; //le L indique un type long
		byte intEx9a = 126;
		byte intEx9b = 127;//limite taille byte
		//byte byEx9c = 128;
		//byte intEx9d = -129;
		byte intEx9e = -128;//limite taille byte
		byte lngEx9f = -127;
		
		System.out.println ("intEx1 " + intEx1);
		System.out.println ("shEx1 "+ shEx1);
		System.out.println ("byEx1 "+ byEx1);
		
		System.out.println ("intEx2 "+ intEx2);
		System.out.println ("shEx2 "+ shEx2);
		System.out.println ("byEx2 "+ byEx2);
		
		System.out.println ("intEx3 "+ intEx3);
		System.out.println ("shEx3 "+ shEx3);
		//System.out.println ("byEx3 "+ byEx3);
		
		System.out.println ("by2Ex3 "+ by2Ex3);
		
		System.out.println ("intEx4 "+ intEx4);
		System.out.println ("shEx4 "+ shEx4);
		System.out.println ("byEx4 "+ byEx4);
		
		System.out.println ("intEx5 "+ intEx5);
		System.out.println ("shEx5 "+ shEx5);
		//System.out.println ("byEx5 "+ byEx5);
		
		System.out.println ("lngEx6 "+ lngEx6);
		System.out.println ("intEx6 "+ intEx6);
		//System.out.println ("shEx6 "+ shEx6);
		//System.out.println ("byEx6 "+ byEx6);
		
		System.out.println ("intEx8 "+ intEx8);
		System.out.println ("lngEx8 "+ lngEx8);
		
		
		System.out.println ("intEx9a "+ intEx9a);
		System.out.println ("intEx9b "+ intEx9b);
		//System.out.println ("byEx9c "+ byEx9c);
		//System.out.println ("intEx9d "+ intEx9d);
		System.out.println ("intEx9e "+ intEx9e);
		//System.out.println ("lngEx9f "+ lngEx9f;

	}

}
