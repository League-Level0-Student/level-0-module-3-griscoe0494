
void setup() {
 size(500,500);
  // set the size of your sketch
  
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int x=0; x<=500; x+=50) {
    ellipse(250,250,500-x,500-x);
  
  
  //for( int y = 0; y <= 500; y+= 10){
    //ellipse(250,250,500-y,500-y);
  //}
  //Use an if statement and modulo to alternate the color of your rings.
  if(x % 1 ==0) {
   fill(225,0,0);
  }
  if(x % 3 ==0) {
   fill(255,255,255); 
  }
}
}
