package PingPong;

import java.awt.Color;

public class Block {
	private double centerx;
	private double centery;
	
	private double height;
	private double width;
	
	public Block(double x, double y, double h, double w){
		this.centerx = x;
		this.centery = y;
		
		this.height = h;
		this.width = w;
	}
	
	public void drawme(){
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.line(centerx + 0.5*width, centery - 0.5*height, centerx + 0.5*width, centery + 0.5*height);
		StdDraw.line(centerx + 0.5*width, centery + 0.5*height, centerx - 0.5*width, centery + 0.5*height);
		StdDraw.line(centerx - 0.5*width, centery + 0.5*height, centerx - 0.5*width, centery - 0.5*height);
		StdDraw.line(centerx - 0.5*width, centery - 0.5*height, centerx + 0.5*width, centery - 0.5*height);
		
		StdDraw.setPenColor(Color.yellow);
		double[] xs = {centerx - 0.5*width, centerx - 0.5*width, centerx + 0.5*width, centerx + 0.5*width};
		double[] ys = {centery + 0.5*height, centery - 0.5*height, centery - 0.5*height, centery + 0.5*height};
		StdDraw.filledPolygon(xs, ys);
	}
	
	public double[][] side(int i){
		double[][] res = new double[2][2];
		double x0;
		double x1;
		double y0;
		double y1;
		//0: right, 1: up, 2: left, 3: down
		if(i == 0){
			x0 = centerx + 0.5*width;
			x1 = centerx + 0.5*width;
			y0 = centery - 0.5*height;
			y1 = centery + 0.5*height;
		}
		else if(i == 1){
			x0 = centerx + 0.5*width;
			x1 = centerx - 0.5*width;
			y0 = centery + 0.5*height;
			y1 = centery + 0.5*height;
		}
		else if(i == 2){
			x0 = centerx - 0.5*width;
			x1 = centerx - 0.5*width;
			y0 = centery + 0.5*height;
			y1 = centery - 0.5*height;
		}
		else{
			x0 = centerx - 0.5*width;
			x1 = centerx + 0.5*width;
			y0 = centery - 0.5*height;
			y1 = centery - 0.5*height; 
		}
		res[0][0] = x0;
		res[0][1] = x1;
		res[1][0] = y0;
		res[1][1] = y1;
		return res;
	}
	

}
