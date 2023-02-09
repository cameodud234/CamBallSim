package com.camballsim;

import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Main extends Application {

	final private int widthX = 1000;
	final private int widthY = 1000;
	
	@Override
	public void start(Stage stage) {
	  
		Group root = new Group();
   	  
		Scene scene = new Scene(root, widthX, widthY, Color.WHITE);
		
		ToolBar toolbar = new ToolBar(new Button("New"),new Button("Close"));
		
		root.getChildren().add(toolbar);
   
		// your game logic goes here  
		AnimationTimer timer = new AnimationTimer() {
			double pixelY = 100;
			boolean movingUp = false;
			boolean movingDown = true;
			
			double pixelX = 100;
			boolean movingLeft = false;
			boolean movingRight = true;
			
			double deltaX = 30;
			double deltaY = 30;
			
			Random rand = new Random();
			
			@Override
			public void handle(long now) {
			  
				root.getChildren().clear();
			  
				Circle circle = new Circle(pixelX, pixelY, 20);
				
				circle.setFill(Color.BLUE);
			  
				root.getChildren().remove(circle);
			  
				if(circle.getCenterY() + circle.getRadius() < widthY - 1 && movingDown) {
					movingUp = false;
					movingDown = true;
					pixelY += deltaY + rand.nextInt(-5, 5);
					
				}
				else {
					
					movingUp = true;
					movingDown = false;
					pixelY -= deltaY;
					
					if(circle.getCenterY() - circle.getRadius() <= 0) {
						movingUp = false;
						movingDown = true;
					}
					
				}
				
				if(circle.getCenterX() + circle.getRadius() < widthX - 1 && movingRight) {
					movingLeft = false;
					movingRight = true;
					pixelX += deltaX; 
				}
				else {
					movingLeft = true;
					movingRight = false;
					pixelX -= deltaX;
					
					if(circle.getCenterX() - circle.getRadius() <= 0) {
						movingLeft = false;
						movingRight = true;
					}
					
				}
				
			  
				root.getChildren().add(circle);
            
			}
    
	  
		};
	  
		timer.start();
      
		stage.setScene(scene);
		
		stage.setOnCloseRequest(e -> Platform.exit());
    
		stage.show();
  
  
	}

  
	public static void main(String[] args) {  
	  
		launch(args);
  
	}

}