package automobile;

public class CarsOverloading1 {
	
	//1. Different number of arguments in argument list

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Method Overloading is a feature in Java that allows a class to have 2 or more methods with the same name
//Only condition is the argument list passed in to the method should be different
		//3 ways to achieve method overloading
//1. Number of parameters can be different
//2. Data types of parameters can be different
//3. Sequence of type of data types can be different
		
		increaseSeatHeight(2);
		increaseSeatHeight(3,true);
		
	}
	
	public static void increaseSeatHeight(int heightToIncrease){
		System.out.println("Increased seat height by "+heightToIncrease+ " inches");
		
	}
	
	public static void increaseSeatHeight(int heightToIncrease,boolean rememberHeight){
		System.out.println("Increased seat height by "+heightToIncrease+ " inches");
		if(rememberHeight){
			System.out.println("Your selection is saved");
			
		}
			else{
				System.out.println("Your selection is not saved");
			}
		}
		
	}


