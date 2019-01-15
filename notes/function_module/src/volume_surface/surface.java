package volume_surface;

public class surface {
	public static double sur(double r, double h){
		return (Math.PI *r*r*2 + 2*Math.PI*r*h);
	}
	public static double sur(double a, double b, double c){
		return ((a*b + b*c + c*a)*2);
	}

}
