
public class Pointeuse {

	//Variable globales
	//Constantes
	public static int DAYTIME = 480;
	public static int MAX_ADD_TIME = 60;
	public static String TIMES[] = new String [2];
	
	public static void main(String[] args) {
		//Variables locales
		String [][] Employees = {{"0ZT2", "1XK5", "2FR8", "1T9C", "5HJ6"},{"Jean Pierre Barré", "Etienne Frankin", "Fernand Dumont", "Valérie Gelain", "Bernard Langlois"}};
		String [][] DailyDatas = {{"1XK5", "2FR8", "0ZT2", "1T9C", "0ZT2", "5HJ6", "1XK5", "1T9C", "2FR8", "5HJ6"},{"05:20", "07:55", "08:40", "09:05", "12:40", "12:50", "15:25", "16:55", "17:25", "19:30"}};
		
		//Instructions
		for(int i = 0; i < Employees.length - 1; i++){
			for(int j = 0; j < Employees[i].length; j++){
				System.out.print(Employees[1][j] + " ");
				for(int k = 0; k < DailyDatas.length; k++){
					for(int l = 0; l < DailyDatas[k].length; l++){
						if(Employees[i][j].equals(DailyDatas[k][l])){
							System.out.print(DailyDatas[1][l] + " ");
						}//FIN SI
					}//FIN POUR
				}//FIN POUR
				System.out.println();
			}//FIN POUR
		}//FIN POUR


	}

	public static int ComputeWorkTime(String arrivalTime, String departureTime){
	//Variables locales
	
	String arrival;
	String departure;
	int workTimeHour = 0;
	String workTimeMin;
	int workingTime = 0;

	//Instructions
	arrival = arrivalTime.substring(0, 2) + arrivalTime.substring(3, arrivalTime.length());
	departure = departureTime.substring(0, 2) + departureTime.substring(3, departureTime.length());
	workTimeHour = Integer.parseInt(departure) - Integer.parseInt(arrival);
	workTimeMin = Integer.toString(workTimeHour);
	if(workTimeMin.length() == 4) {
		workingTime = (Integer.parseInt(workTimeMin.substring(0, 2)) * 60) + (Integer.parseInt(workTimeMin.substring(2, workTimeMin.length())));
	}else {
		workingTime = (Integer.parseInt(workTimeMin.substring(0, 1)) * 60) + (Integer.parseInt(workTimeMin.substring(1, workTimeMin.length())));
	}//fin if
	
	return workingTime;
	}//Fin ComputeWorkTime

	public static int ComputeAdditionalHours(int workingTime){
	//Variables locales
	//Instructions
	return workingTime - DAYTIME;
	}//FIN ComputeAdditionalHours
	
	public static String EvaluationLetter(int additionalTime){
	//Variables locales
	//Instructions
	if(additionalTime > MAX_ADD_TIME) {
		return "W";
	}
		
	else if(additionalTime < -60) {
		return "C";
	}
		
	else if(additionalTime < 0) {
		return "X";
	}
		
	else {
		return "V";
	}//FIN SI
	}//FIN EvaluationLetter


}
