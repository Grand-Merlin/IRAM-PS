import java.text.DecimalFormat;

public class proclamation {

	//Constantes globales
	public static String[] SUBJECTS = {"Math ", "Sciences", "Français", "Géographie", "Histoire ", "Philo", "Langues"};
	public static double[] WEIGHTS = {6,3,4,2,2,1,4};
	public static double[][] RESULTS ={{9.5, 10,11,10,10,10,10},{12,12,12,14,10,13,12},{16,16,17,15,18,17,17},{19,20,19,20,18,18,19},{5,11,12,20,10,11,14},{14,14,14,15,13,15,14},{10,11,10,11,10,10.5,11},{18,17,19,15,14,16,20},{18,17,19,15,14,16,20},{14,15,15,15.5,14,13,14.5},{16,14,10,2,18,15,17},{11,12,10,10,11,11.5,10}}; 
	public static String[] STUDENTS = {"Virginie Stella", "Jonathan Maes", "Jules Piler", "ReMi SolLaMi", "Mattheow Ô Casu ", "Mellissa Biensescheveux ", "Jeremy Glauque", "Julien Fourien", "Beumier Tudor","Jurassien Muraptor", "Corentin Fairelesot"};
	public static double FAILURE = 10;
	public static int LENGTH_OF_RANK = 10;

	public static void main(String[] args) {
		//Variable locales
		double weightedAverage = 0.0;
		DecimalFormat df;
		int rank = 0;
		//Instructions
		rank = computeRank();
		df = new DecimalFormat("0.00");
		for(int i = 0; i < STUDENTS.length; i++) {
			if(!computeFailure(i)) {
				weightedAverage = (computeWeightedAverage(computeSumOfCoef(),i));
				System.out.print(Utilities.placeNumberRank(rank, STUDENTS[i], df.format(weightedAverage) + " %"));
				System.out.print(" " + computeGrade(weightedAverage, i));
				System.out.println();
			}//FIN SI
		}//FIN POUR
	}//FIN main

	public static boolean computeFailure(int indexStudent) {
		//Variable locales
		//Instructions	
		for(int j = 0; j < SUBJECTS.length; j++) {
			if(RESULTS[indexStudent][j] < FAILURE) {
				return true;
			}//FIN SI
		}//FIN POUR
		return false;
	}//FIN computeFailure

	public static int computeSumOfCoef() {
		//Variable locales
		int sumOfCoef = 0;
		//Instructions
		for(int i = 0; i < WEIGHTS.length; i++) {
			sumOfCoef += WEIGHTS[i];
		}//FIN POUR
		return sumOfCoef;
	}//FIN computeSumOfCoef

	public static double computeWeightedAverage(double sumOfCoef,int indexStudent) {
		//Variable locales
		double sum = 0.0;
		//Instructions
		for(int j = 0; j < SUBJECTS.length; j++) {
			sum += RESULTS[indexStudent][j] * WEIGHTS[j];
		}//FIN POUR
		return sum / sumOfCoef * 5;
	}//FIN computeWeightedAverage



	public static String computeGrade(double weightedAverage, int indexStudent) {
		//Variable locales
		//Instructions
		if(weightedAverage >= 60 && weightedAverage < 70) {
			return "Satisfaction";
		}else if(weightedAverage >= 70 && weightedAverage < 80) {
			return"Distinction";
		}else if(weightedAverage >= 80 && weightedAverage < 90) {
			return "Grand distinction";
		}else if(weightedAverage >= 90 && weightedAverage <= 100) {
			return "La plus grande distinction";
		}else {
			return"";
		}//FIN SI
	}//FIN computeGrade
	public static int computeRank() {
		//Variable locales
		int longerName = 0;
		//Instructions
		for(int i = 0; i < STUDENTS.length; i++) {
			if(longerName < STUDENTS[i].length()) {
				longerName = STUDENTS[i].length();
			}//FIN SI
		}//FIN POUR
		return longerName + LENGTH_OF_RANK;
	}//FIN computeRank
}
