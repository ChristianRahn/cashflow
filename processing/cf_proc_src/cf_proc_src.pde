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
  




