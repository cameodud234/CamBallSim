package com.camball;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Ball {
	
	private double positionX;
	private double positionY;
	private int windowSizeX;
	private int windowSizeY;
	private double radius;
	private Paint color;
	private Circle circle;
	

	public Ball(double positionX, double positionY, 
					double radius, Paint color, 
						int windowSizeX, int windowSizeY) {
		
		this.positionX = positionX;
		this.positionY = positionY;
		this.color = color;
		this.windowSizeX = windowSizeX;
		this.windowSizeY = windowSizeY;
		
		this.circle = new Circle(this.positionX, this.positionY, this.radius);
		this.circle.setFill(color);
		
	}
	
	public Ball(Ball ball) {
		this.positionX = ball.getPositionX();
		this.positionY = ball.getPositionY();
		this.color = ball.getColor();
		this.windowSizeX = ball.getWindowSizeX();
		this.windowSizeY = ball.getWindowSizeY();
	}


	public double getPositionX() {
		return positionX;
	}
	
	public double getPositionY() {
		return positionY;
	}


	public void setPositionX(double positionX) {
		this.positionX = positionX;
	}

	
	public double getRadius() {
		return radius;
	}
	
	public Paint getColor() {
		return color;
	}
	
	
	public Circle getCircle() {
		return circle;
	}
	


	public void setPositionY(double positionY) {
		this.positionY = positionY;
	}


	public int getWindowSizeX() {
		return windowSizeX;
	}


	public void setWindowSizeX(int windowSizeX) {
		this.windowSizeX = windowSizeX;
	}


	public int getWindowSizeY() {
		return windowSizeY;
	}


	public void setWindowSizeY(int windowSizeY) {
		this.windowSizeY = windowSizeY;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public void setColor(Paint color) {
		this.color = color;
	}


	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
}
