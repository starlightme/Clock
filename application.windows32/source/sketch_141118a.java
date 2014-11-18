import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_141118a extends PApplet {

public void setup(){
  size(600,600);
  ellipseMode(RADIUS);    
  smooth();
}
public void draw(){
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

  
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_141118a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
