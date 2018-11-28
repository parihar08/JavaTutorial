package automobile;

public class CarsOverloadingQuestions {
	
//3 ways to achieve method overloading
	//1. Number of parameters can be different
	//2. Data types of parameters can be different
	//3. Sequence of type of data types can be different
	//4. Cannot overload just on return type

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		increaseSeatHeight(true,2);
		increaseSeatHeight("3",true);

	}
	
	public static void increaseSeatHeight(boolean rememberHeight,int heightToIncrease){
		System.out.println("Increased seat height by "+heightToIncrease+ " inches during 1st overload");
		if(rememberHeight){
			System.out.println("Your selection is saved");
			
		}
			else{
				System.out.println("Your selection is not saved");
			}
		}

	public static int increaseSeatHeight(String heightToIncrease,boolean rememberHeight){
		System.out.println("Increased seat height by "+heightToIncrease+ " inches during 2nd overload");
		if(rememberHeight){
			System.out.println("Your selection is saved");
			
		}
			else{
				System.out.println("Your selection is not saved");
			}
		return 0;
		}
		
}
