package IO2;
import java.awt.Color;

import IO.StdDraw;

public class IO2 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		StdDraw.setCanvasSize(800, 800);
		int i=1;
		StdDraw.setPenColor(Color.BLUE);
		while(true){
			StdDraw.clear();
			if(StdDraw.mousePressed()){
				if(i%2 == 0){
					StdDraw.setPenColor(Color.BLUE);
				}
				else{
					StdDraw.setPenColor(Color.RED);
				}
				i = 1-(i%2);
			}
			
			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();
			StdDraw.filledCircle(x, y, 0.02);
			
			StdDraw.show(10);			
		}
	}

}
