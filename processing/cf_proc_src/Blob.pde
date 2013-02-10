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
