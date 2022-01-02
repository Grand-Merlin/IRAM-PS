import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCalendar {

	public static void main(String[] args) {
		int intHour; //récupération de l'heure du jour
		//5 formats de date différents
		SimpleDateFormat SmplDateFrmt1 = new SimpleDateFormat ("dd/MM/yyyy hh:mm:ss");
		SimpleDateFormat SmplDateFrmt2 = new SimpleDateFormat ("dd/MM/yy HH:mm:ss");
		SimpleDateFormat SmplDateFrmt3 = new SimpleDateFormat ("dd/MM/yy hh:mm a");
		SimpleDateFormat SmplDateFrmt4 = new SimpleDateFormat ("dd/MM/yy HH:mm:ss.SSS ");
		SimpleDateFormat SmplDateFrmt5 = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat SmplDateFrmt6 = new SimpleDateFormat ("yyyy-MM-dd HH'h'mm:ss");
		Calendar cldr1 = Calendar.getInstance(); //instanciation d'une classe Calendar
		Calendar cldr2, cldr3 ;
		System.out.println("Current Date & Time without format: " + cldr1.getTime());
		System.out.println("Current Date & Time format 1 " + SmplDateFrmt1.format(cldr1.getTime()));
		System.out.println("Current Date & Time format 2: " + SmplDateFrmt2.format(cldr1.getTime()));
		System.out.println("Current Date & Time format 3: " + SmplDateFrmt3.format(cldr1.getTime()));
		System.out.println("Current Date & Time format 4: " + SmplDateFrmt4.format(cldr1.getTime()));
		System.out.println("Current Date & Time format 5: " + SmplDateFrmt5.format(cldr1.getTime()));
		System.out.println("Current Date & Time format 6: " + SmplDateFrmt6.format(cldr1.getTime()));
		System.out.println("Année : " + cldr1.get( Calendar.YEAR));
		System.out.println("Année : " + cldr1.get(1));
		System.out.println("Mois : " + cldr1.get( Calendar.MONTH));
		System.out.println("Mois : " + cldr1.get( 2));
		System.out.println("Jour du mois : " + cldr1.get( Calendar.DAY_OF_MONTH));
		System.out.println("Heure du jour : " + cldr1.get( Calendar.HOUR_OF_DAY));
		System.out.println("Minute : " + cldr1.get( Calendar.MINUTE));
		System.out.println("Seconde : " + cldr1.get(Calendar.SECOND));
		System.out.println("Milliseconde : " + cldr1.get(Calendar.MILLISECOND));
		intHour = cldr1.get( Calendar.HOUR_OF_DAY);
		System.out.println("On a récupéré l'heure du jour dans une variable : " + intHour);
		cldr2 = cldr1; //copie de cldr1 dans cldr2 avant le add
		cldr3 = (Calendar)cldr1.clone(); //copie de cldr1 dans cldr3 avant le add
		cldr1.add( Calendar.HOUR_OF_DAY, 3);
		System.out.println("\nIn 3 hours Date & Time will be : " + SmplDateFrmt2.format(cldr1.getTime()));
		//illustration de la différence entre cldr2 = cldr1 et cldr3 = (Calendar) cldr1.clone()
		System.out.println("Calendrier 2 : Current Date & Time format 2 : " + SmplDateFrmt2.format(cldr2.getTime()) + " Oupssssss cldr2 impacté par le add de cldr1 !!????");
		System.out.println("Calendrier 3 Current Date & Time format 2 : " + SmplDateFrmt2.format(cldr3.getTime())+ " cldr3 pas impacté par le add de cldr1 !!");
		}

}
