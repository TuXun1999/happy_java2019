package volume_surface;


public class volume_surface {
	public static void main(String[] args){
		double r = 1.0;
		double h = 1.5;
		
		double a = 5.6;
		double b = 2.3;
		double c = 8.9;
		
		System.out.println("Parameters for the cylinder: " + r + " " + h);
		System.out.println("Volume: " + volume.vol(r, h));
		System.out.println("Surface: " + surface.sur(r, h));
		System.out.println();
		System.out.println("Parameters for the cube: " + a + " " + b + " " + c);
		System.out.println("Volume: " + volume.vol(a, b, c));
		System.out.println("Surface: " + surface.sur(a, b, c));
		/*As the example shows,
		 * to use the method of the class within the same package
		 * just use it directly
		 * 
		 * But to use the method in another package within the same project
		 * remember to import it at first; 
		 * 
		 * Also, here we overload the methods with the same name, but different arguments; 
		 */
		
		
		
	}
}
