package PingPong;

import java.awt.Color;

public class Ball {
	private double centerx;
	private double centery;
	private double radius;
	private double incre_x;
	private double incre_y;

	
	public Ball(double x, double y, double r, double incre_x, double incre_y){
		this.centerx = x;
		this.centery = y;
		this.radius = r;
		
		this.incre_x = incre_x;
		this.incre_y = incre_y;
		
	}
	

	public void drawme(){
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(centerx, centery, radius);
	}
	
	public void check_border(double size, double plate_h){
		//Change the direction of the ball when it hits the wall
		if(centerx + radius >= size || centerx - radius <= -1*size){
			incre_x *= -1;
		}
			
		
		if(centery + radius >= size || centery - radius <= size*-1 + plate_h)
			incre_y *= -1;
		
	}
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public double getCenterx() {
		return centerx;
	}

	public void setCenterx(double centerx) {
		this.centerx = centerx;
	}

	public double getCentery() {
		return centery;
	}

	public void setCentery(double centery) {
		this.centery = centery;
	}

	public void update(){
		centerx += incre_x;
		centery += incre_y;
	}
	
	public void cd_x(){
		incre_x *= -1;
	}
	
	public void cd_y(){
		incre_y *= -1;
	}

}