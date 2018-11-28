package automobile;

public class CarsOverloading2 {
	
//2. Difference in data types of arguments

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		increaseSeatHeight(2);
		increaseSeatHeight("3");

	}
	
	public static void increaseSeatHeight(int heightToIncrease){
		System.out.println("Increased seat height by "+heightToIncrease+ " inches using integer");
		
	}
	
	public static void increaseSeatHeight(String heightToIncrease){
		System.out.println("Increased seat height by "+heightToIncrease+ " inches using string");
		}
		

}
