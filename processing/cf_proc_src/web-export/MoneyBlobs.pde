Blob blueBlob;
Blob redBlob;

void setup() {
  size(400,400,P3D);
  background(0);
  
  blueBlob = new Blob(color(0,0,255),50,100,100,0);
  redBlob = new Blob(color(255,0,200),100,200,200,50);
}

void draw() {
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
  color c;
  float radius;
  float xpos;
  float ypos;
  float zpos;

//Constructor  
  Blob(color _c, float _rad, float _xpos, float _ypos, float _zpos) {
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
  if (radius>0) { radius += delta;}    
    
  }
  
}

