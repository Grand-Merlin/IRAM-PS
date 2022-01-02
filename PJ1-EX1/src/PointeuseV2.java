
public class PointeuseV2 {

	//Constantes globales
	public static int MINUTE_A_DAY = 480;
	public static String WARNING = "W";
	public static String OK = "V";
	public static String CRITICAL = "C";
	public static String MISSING_WORK = "X";
	public static int NBR_OF_EMPLOYEE = 10;


	public static void main(String[] args) {
		//Variable locales
		String[][]Employees;
		String[][]DailyDatas;
		int arrivalTime = 0;
		int despartureTime = 0;
		int workingHour = 0;
		int additionalHour = 0;
		String evaluationLetter = "";
		int count = 0;
		//Instructions
		Employees = new String[][] {{"0ZT2", "Jean Pierre Barré" }, { "1XK5", "Etienne Frankin"}, {"2FR8", "Fernand Dumont"}, {"1T9C", "Valérie Gelain"}, {"5HJ6", "Bernard Langlois"}};
		DailyDatas = new String[][]{{"1XK5", "05:20"},{"2FR8", "07:55"},{"0ZT2", "08:40"},{"1T9C" , "09:05"},{"0ZT2" , "12:40"},{"5HJ6" , "12:50"},{"1XK5" , "15:25"},{"1T9C" , "16:55"},{"2FR8" , "17:25"},{"5HJ6" , "19:30"}};
		for(int i = 0; i <Employees.length; i++) {
			System.out.println(Employees[i][1]);
			for(int j = 0; j < DailyDatas.length; j++) {
				if(Employees[i][0] == DailyDatas[j][0] && count == 0) {
					arrivalTime = convertHourToInt(DailyDatas[j][1]);
					count++;
				}else if(Employees[i][0] == DailyDatas[j][0] && count == 1) {
					despartureTime = convertHourToInt(DailyDatas[j][1]);
				}//FIN SI
				System.out.print(workingHour  = computeWorkingHour(arrivalTime, despartureTime));
				System.out.print(additionalHour  = computeAdditionalHour(workingHour));
				System.out.print(evaluationLetter = computeEvaluationLetter(additionalHour));

			}//FIN POUR
		}//FIN POUR
	}//FIN MAIN

	public static int convertHourToInt(String time) {
		//Variable locales
		//Instructions
		return (Integer.parseInt(time.substring(0,2)) * 60) + (Integer.parseInt(time.substring(3)));
	}//FIN computeWorkingHours

	public static int computeWorkingHour(int arrival, int despartur) {
		//Variable locales
		int desparturInMin;
		int arrivalInMin;
		//Instructions
		desparturInMin = despartur/60;
		arrivalInMin = arrival/60;
		return desparturInMin - arrivalInMin;
	}//FIN computeWorkingHours


	public static int computeAdditionalHour(int workingHour) {
		//Variable locales
		//Instructions
		return workingHour - MINUTE_A_DAY;
	}//FIN computeAdditionalHour


	public static String computeEvaluationLetter(int AdditionalHour) {
		//Variable locales
		//Instructions
		if(AdditionalHour < -60) {
			return CRITICAL;
		}else if(AdditionalHour >= -60 && AdditionalHour <= -1) {
			return MISSING_WORK;
		}else if(AdditionalHour >= 0 && AdditionalHour <= 60) {
			return OK;
		}else{
			return WARNING;
		}//FIN SI
	}//FIN computeEvaluationLetter

}
