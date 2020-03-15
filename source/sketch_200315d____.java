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

public class sketch_200315d____ extends PApplet {

float r = 10;
public void setup() { 
   
  
  background(255); 
   
  noStroke();
}  
public void draw() {  
  float red_prob = 0.60f;  
  float green_prob = 0.10f;  
  float blue_prob = 0.30f;   
  float num = random(1);   
  if (num < red_prob) { 
    fill(255, 53, 2, 150);
  } else if (num < green_prob + red_prob) { 
    fill(156, 255, 28, 150);
  } else { 
    fill(10, 52, 178, 150);
  }   
  ellipse(random(width), random(height), r, r);
  r++;
} 
  public void settings() {  size(displayWidth, displayHeight);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_200315d____" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
