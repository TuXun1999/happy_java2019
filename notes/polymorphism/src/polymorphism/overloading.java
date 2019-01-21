package polymorphism;
/*
 * Polymorphism means overloading or overriding
 * for overriding, it is connected to the objects: 
 * the objects implementing the subclasses of a class
 * have a different method from the one in superclass
 * even with the same name
 */

public class overloading {
	/*
	 * Build methods within the same class with the same name
	 * but with different arguments or data types!!
	 */
	public static void main(String[] args){
		System.out.println("Square area (int): " + area.square_areaCal(1));
		System.out.println("Square area (double): " + area.square_areaCal(1.2));
		System.out.println("Rect area (int): " + area.rect_areaCal(1,2));
		System.out.println("Rect area (double): " + area.rect_areaCal(1.2,3.4));
	}

}
