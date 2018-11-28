package automobile;

public class CarsOverloading3 {
	
//3. Sequence of data types of arguments

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		increaseSeatHeight(false,2);
		increaseSeatHeight(3,true);

	}
	
	public static void increaseSeatHeight(boolean rememberHeight,int heightToIncrease){
		System.out.println("Increased seat height by "+heightToIncrease+ " inches");
		if(rememberHeight){
			System.out.println("Your selection is saved");
			
		}
			else{
				System.out.println("Your selection is not saved");
			}
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
