package polymorphism;

public class area {
	public static int square_areaCal(int length){
		return (length * length);
	}
	
	public static double square_areaCal(double length){
		return (length*length);
	}
	
	public static int rect_areaCal(int length, int width){
		return (length * width);
	}
	
	public static double rect_areaCal(double length, double width){
		return (length * width);
	}
}
