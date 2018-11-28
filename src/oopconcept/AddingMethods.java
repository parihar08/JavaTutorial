package oopconcept;

public class AddingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// void means nothing. It stands for return type of method. find grades method calculates the grade and print the grades.
		// It doesn't return anything
		// Return means it can return a value after doing calculations and the value is captured where we call the method
		// Any method can either have a return type or not. Void means no return type. It can either be string, int or any other data type
		String studentName = "John";
		int score = 15;
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
		System.out.println("Grade of " +studentName+ " is: " + grade);
		findGrades("David",80);
		findGrades("Bumble",75);
		findGrades("Andrew",95);
	}
	
	public static void findGrades(String studentName, int score)
	
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
		System.out.println("Grade of " +studentName+ " is: " + grade);
	}
		
	}


