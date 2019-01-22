package ex1_sol;

public abstract class volume {
	
	
	public double getVolume(double height, double a, double b){
		return (height * bottomarea(a, b));
	}
	
	
	public abstract double bottomarea(double a, double b);
}
