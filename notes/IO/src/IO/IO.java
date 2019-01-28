package IO;
import java.awt.Color;
public class IO {
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		/*
		 * Test printf
		 * 
		 * int f = 525552;
		 
		
		System.out.println(Math.PI);
		System.out.println();
		
		System.out.printf("Total is: $%,.2f\n", Math.PI);
		
		System.out.printf("Total: %-10.3f: \n", Math.PI);
		
		System.out.printf("%8d \n", f);
		System.out.printf("%11.10s\n",  Math.PI);
		String s = "Hello World";
		System.out.printf("The string object %s is at hash code %h%n", s,s);
		*/
		
		//Change the size of the canvas
		StdDraw.setCanvasSize(800, 800);
		
		
		double x0 = -2;
		double x1 = 2;
		double y0 = -2;
		double y1 = 2;
		//Set the scale of the canvas
		StdDraw.setXscale(x0,x1);
		StdDraw.setYscale(y0,y1);
		
		/*
		//Try to draw a circle ---> 0.5, 0.5: position-x, position-y; 0.25: radius
		StdDraw.filledCircle(0.5, 0.5, 0.25);
		
		//Try to draw out a triangle by three lines
		StdDraw.point(0,0);
		StdDraw.point(0.2,0.3);
		StdDraw.point(0.1, 0.7);
		
		StdDraw.line(0, 0, 0.2, 0.3);
		StdDraw.line(0.2,0.3,0.1,0.7);
		StdDraw.line(0.1,0.7,0,0);
		*/
		
		/* Draw out the curve of a function, with the labels(int 1/ int 2 = 0!!!)
		int grid = 500;
		double spanx = x1-x0;
		StdDraw.line(x0, 0, x1, 0);
		StdDraw.line(0,y0,0,y1);
		StdDraw.setPenColor(Color.RED);
		for(int i = 0; i < grid; i++){
			StdDraw.point(x0 + i * (spanx/grid),f(x0 + i * (spanx/grid)) );
			StdDraw.line(x0 + i * (spanx/grid), f(x0 + i * (spanx/grid)), x0 + (i+1) * (spanx/grid), f(x0 + (i+1) * (spanx/grid)));
		}
		StdDraw.setPenColor();
		StdDraw.text(0, 0, "0.0");
		StdDraw.text(1.8, 0.2, "x");
		StdDraw.text(0.2, 1.8, "y");
		*/
		/*
		for (int i = 0; i < 180; i++){
			StdDraw.clear();
			StdDraw.picture(0,0, "/homes/lvb/lvb-104/Desktop/index.png",i);
			
			
			StdDraw.show(50);
			
		}
		StdDraw.picture(0,0, "/homes/lvb/lvb-104/Desktop/index.png",180);
		*/
		int i = 0;
		int direction = 1;
		while(true){
			String file;

			file = "/homes/lvb/lvb-104/Desktop/image" + (i%5 + 1);
			file += ".png";
			
			if(StdDraw.hasNextKeyTyped()){
				char type = StdDraw.nextKeyTyped();
				//It seems that the function can only be called once; 
				if(type == 'b'){
					direction = -1;
				}
				
				else if(type == 'f'){
					direction = 1;
				}
			}
			
			StdDraw.picture(0, 1, file);
			StdDraw.line(x0, 0.4, x1, 0.4);
			StdDraw.show(100);
			StdDraw.clear();
			i += direction;
			if(i < 0){
				i = 4;
			}

		}
	}
	
	public static double f(double x){
		return (-1*x*x-2*x + 0.5);
	}
	/*
	 * Sound: 
	 * StdAudio.play() accepts an argument in double[]
	 * you should put the data calculated by the analytical formula 
	 * of the sound wave in the array
	 * 
	 */

}
