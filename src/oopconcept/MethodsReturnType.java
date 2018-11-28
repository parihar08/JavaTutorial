package oopconcept;

public class MethodsReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// void means nothing. It stands for return type of method. find grades method calculates the grade and print the grades.
		// It doesn't return anything
		// Return means it can return a value after doing calculations and the value is captured where we call the method
		// Any method can either have a return type or not. Void means no return type. It can either be string, int or any other data type
		
		String grade;            
		grade = findGrades(80);  // We want to capture the value from return type grade on this variable 
		displayGrades("John",grade); // So that we can use that in another method displayGrades
		grade = findGrades(75);
		displayGrades("Tom",grade);
	}
	
	public static String findGrades(int score)
	
	{
		String grade;
		if (score >=90 && score <=100){
			grade = "A";
					}
		else if (score >=80 && score < 90){
			grade = "B";
					}
		else if (score >=70 && score < 80){
			grade = "C";
					}
		else {
			grade = "D";	
		}
		return grade;  //We have to change the method return type to String from void. Since grade is of type string
		
	}
		
public static void displayGrades(String studentName, String grade){
	
	    System.out.println("***************************************");
		System.out.println("Grade of " +studentName+ " is: " + grade);
		System.out.println("***************************************");
	}
	
	}


