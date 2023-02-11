package com.camballsim;

import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class Screen {
	
	final private int width;
	final private int height;
	final private Color sceneColor;
	
	final private Group root;
	final private Scene scene;
	
	public Screen(final int width, final int height, Color sceneColor) {
		this.width = width;
		this.height = height;
		this.sceneColor = sceneColor;
		
		this.root = new Group();
		this.scene =  new Scene(root, this.width, this.height);
	}
	
	
//	public void run() {
//		
//		AnimationTimer timer = new AnimationTimer() {
//			int velocityX = 1;
//			int velocityY = 1;
//			
//		}
//		
//	}
	
	

}
