package staticpackage;

public class StaticDemo {
	
	public static void main(String[] args) {
		
		StaticExampleClass s1 = new StaticExampleClass("bmw","320i");
		System.out.println("Make of the car is: "+s1.getMake());
		System.out.println("Model of the car is: "+s1.getModel());
		System.out.println("This is the instance no.: "+s1.getInstance());  //private variable
		System.out.println("This is the inst no.: "+s1.getInst());  //static variable
//When we make the variable as static, the variable becomes a class variable, it is not an object variable(not attached to object instance)
//Static variable can be used to refer to the common properties of all the objects
//It will only have one copy of the static variable when the class loads irrespective of number of objects we create for the class
//All the instances of the class will share the same static variable
		System.out.println("*********************************************");
		StaticExampleClass s2 = new StaticExampleClass("benz","SXz");
		System.out.println("Make of the car is: "+s2.getMake());
		System.out.println("Model of the car is: "+s2.getModel());
		System.out.println("This is the instance no.: "+s2.getInstance());  //private variable
		System.out.println("This is the inst no.: "+s2.getInst());  //static variable
				
				
	}

}
