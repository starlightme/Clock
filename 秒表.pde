void setup(){
  size(600,600);
  ellipseMode(RADIUS);    
  smooth();
}
void draw(){
  int R=200;
  background(240);
  float time=millis()/1000; 
  float x,y;
  float rad=((time%60)/60)*2*PI;
  x=300+sin(rad)*R;
  y=100+(1-cos(rad))*R;
  ellipse(300,300,R,R);
  line(300,300,x,y);
  println(rad);
}

  
