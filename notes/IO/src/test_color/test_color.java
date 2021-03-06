package test_color;
import java.awt.Color;
import IO.StdDraw;
public class test_color {
	public static void main(String[] args){
		StdDraw.setCanvasSize(800,800);
		StdDraw.setXscale(-1,1);
		StdDraw.setYscale(-1,1);
		
		Color myColor1 = new Color(255, 200,200);
		Color myColor2 = new Color(200,155,155);
		
		double[] Box0 = {-0.8, -0.8, -0.2, -0.2};
		double[] box0 = {-0.5, -0.3, -0.3, -0.5};
		
		double[] Box1 = {0.8, 0.8, 0.2, 0.2};
		double[] box1 = {0.5, 0.3, 0.3, 0.5};
		
		double[] Boy0 = {0.8, -0.8, -0.8, 0.8};
		double[] boy0 = {0.5, 0.5,-0.5,-0.5};
		
		double[] Boy1 = {0.8, -0.8, -0.8, 0.8};
		double[] boy1 = {0.5, 0.5,-0.5,-0.5};
		
		StdDraw.setPenColor(myColor1);
		StdDraw.filledPolygon(Box0, Boy0);
		
		StdDraw.setPenColor(myColor2);
		StdDraw.filledPolygon(box0, boy0);
		
		StdDraw.filledPolygon(Box1, Boy1);
		
		StdDraw.setPenColor(myColor1);
		StdDraw.filledPolygon(box1, boy1);
		
	}
}
