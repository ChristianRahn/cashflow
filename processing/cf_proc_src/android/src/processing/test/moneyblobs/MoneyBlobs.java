package processing.test.moneyblobs;

import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class MoneyBlobs extends PApplet {

Blob blueBlob;
Blob redBlob;

public void setup() {
 
  background(0);
  
  blueBlob = new Blob(color(0,0,255),50,100,100,0);
  redBlob = new Blob(color(255,0,200),100,200,200,50);
}

public void draw() {
  background(0);
  blueBlob.display();
  redBlob.display();
  
if (keyPressed) {
  blueBlob.shrink(-1);
  redBlob.shrink(-1);
  }  
  
if (mousePressed) {
  blueBlob.displayAt();
}

}
  




class Blob {
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
  public void display() {
    pushMatrix();
    lights();
    stroke(c);
    noFill();
    translate(xpos,ypos,zpos);
    sphere(radius);
    popMatrix();
  }
//Display at mouse click location  
  public void displayAt() {
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
  public void shrink(float delta) {
  float d = delta; 
  if (radius>0) { radius += delta;}    
    
  }
  
}

  public int sketchWidth() { return 400; }
  public int sketchHeight() { return 400; }
  public String sketchRenderer() { return P3D; }
}
