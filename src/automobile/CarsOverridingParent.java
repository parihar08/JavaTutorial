package automobile;

/***
OVERLOADING: 
When	overloading,	you	must	change	either	the	type	or	the	number	of	parameters	for	a method.
Method	overloading	is	done	to	allow	us	to	use	the	same	methods	names	for	multiple	methods.	
The	purpose	behind	this	is	that,	you	might	have	different	functionality	implementation for	the	
same	feature	based	on	the	difference	in	parameters	and	in	that	scenario	you	definitely	want	the	
same	method	names	to	be	able	to	relate	all	of	them	with	the	feature.

OVERRIDING:

Overriding	means	that	a	method	inherited	from	a	parent	class	will	be	changed.	But,	when	
overriding a	method	everything	remains	exactly	the	same	except	the	method implementation.
What	the	method	does	is	changed	to	fit	in	with	the	needs	of	the	child	class.	But,	the	method	
name,	the	number	and	types	of	parameters,	and	the	return	type	will	all	remain	the	same.
 */

public class CarsOverridingParent {
	
	public void engineStart(int cyl){
		System.out.println("I'm from the parent class");
	}
		
	public void increaseSpeed(){
		System.out.println("Increasing speed from the parent class");
	}
	
	public static void staticExample(){
		System.out.println("I'm the static method of the parent class");
	}

}
