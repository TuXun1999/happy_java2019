package ex1;

public class compare {
	/*
	 * This exercise test inheritance & abstract;
	 */
	public static void main(String[] args){
	double a = 1.2; 
	double b = 1.3;
	double c = 1.4;
	
	double r = 1;
	double h = 3;
	
	real_container cylinder = new real_container();
	System.out.println("Volume for cylinder: " + cylinder.volume(r,h));
	real_container cube = new real_container();
	System.out.println("Volume for cube: " + cube.volume(a,b,c));
	String result = (cylinder.volume(r,h) > cube.volume(a,b,c))? "Cyinder is bigger":"Cube is bigger";
	System.out.println(result);

}
}
