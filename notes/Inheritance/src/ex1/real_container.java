package ex1;

public class real_container extends container{
	public double volume(double r, double h){
		return (Math.PI*r*r*h);
	}
	public double volume(double a, double b, double c){
		return (a*b*c);
	}
}
