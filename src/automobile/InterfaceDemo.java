package automobile;

public class InterfaceDemo implements CarsInterface,BMWCarInterface{
	
	
	//Interface is a collection of abstract methods(signatures of the method without implementation)
	//Any class that implement an interface will implement all the methods that reside inside the interface by defining methods	
	//Interface	is	kind	of	a	prototype; there	are	only	signatures	of	methods.	Methods	do	not	have	any	
	//implementation; they do	not	have	behavior	of	their	own.
	//Abstract	class	on	the	other	hand	as	like	classes.	They	look	like	interface	but	they	can	have	
	//implementation	of	methods	along	with	abstract	methods.	These	methods	may	or	may	not	have	
	//behavior	and	can	be	overridden	in	the	class	that	extends	the	abstract	class.	

	@Override
	public void engineStart(String engineType, boolean isKeyLess) {
		System.out.println("This is the implementation");
		
	}

	@Override
	public void headsUpNavigation() {
		System.out.println("This is an example of multiple interface implementation");
		
	}


}
