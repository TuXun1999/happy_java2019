package ex1_sol;

public class main {
	public static void main(String[] args){
		cylinderVolume a = new cylinderVolume();
		cubeVolume b = new cubeVolume();
		double h1 = 1.3;
		double r = 3.2;
		
		double c = 1.4;
		double d = 0.9;
		double h2 = 3.2;
		
		double v1 =a.getVolume(h1, r, r);
		double v2 = b.getVolume(h2, c, d);
		String result = (v1 > v2)? "Cylinder is bigger":"Cube is bigger";
		System.out.println("Cylinder: " + v1);
		System.out.println("Cube:" + v2);
		System.out.println(result);
		
		double l = 2.3;
		double r2 = 8.3;
		double h = 2;
		pentagonVolume p = new pentagonVolume();
		System.out.println("Pentagon: " + p.getVolume(h, l, r2));
	}
}
