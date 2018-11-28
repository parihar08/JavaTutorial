package staticpackage;

public class StaticKeynotesDemo {
	
	public int addNum = 10;
	
	public static int addNumStatic = 5;
	
	public static void main(String[] args) {
	// A Static method cannot use a non-static variable or method directly
	// This and Super cannot used in static context because This keyword is always related to the object of the class	
			
	//	int output = sum(20);
		int staticoutput = sumStatic(30);
	//	System.out.println("The output is: "+output);
		System.out.println("The static output is: "+staticoutput);
		
		StaticKeynotesDemo s1 = new StaticKeynotesDemo();
		int output = s1.sum(20);
		System.out.println("The output is: "+output);
		}
		
	public int sum(int num) {
		return num + addNum;
	}	
	public static int sumStatic(int num){
		
		return num + addNumStatic;
	}
	
}
