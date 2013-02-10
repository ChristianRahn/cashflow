package cashflow;

import processing.core.PApplet;


public class CashFlow extends PApplet {

	public void setup() {
		size(500,500,P3D);
		background(0);
	}

	public void draw() {
		background(255);
		pushMatrix();
		translate(100,100);
		rect(0,0,50,50);
		popMatrix();
	}
	public class Blob {
		int c;
		float radius;
		float xpos;
		float ypos;
		float zpos;

		//Constructor  
		Blob(int _c, float _rad, float _xpos, float _ypos, float _zpos) {
			c = _c;
			radius = _rad;
			xpos = _xpos;
			ypos = _ypos;
			zpos = _zpos;

		}
		//Initial display parameters  
		void display() {
			pushMatrix();
			lights();
			stroke(c);
			noFill();
			translate(xpos,ypos,zpos);
			sphere(radius);
			popMatrix();
		}
		//Display at mouse click location  
		void displayAt() {
			xpos=mouseX;
			ypos=mouseY;
			pushMatrix();
			lights();
			stroke(c);
			noFill();
			translate(xpos,ypos,zpos);
			sphere(radius);
			popMatrix();
		}

		//Shrink to nothing by increment [arg]  
		void shrink(float delta) {
			float d = delta; 
			if (radius>0) { radius += d;}    

		}
	
	public void main(String _args[]) {
		PApplet.main(new String[] { cashflow.CashFlow.class.getName() });
	}
}
}
