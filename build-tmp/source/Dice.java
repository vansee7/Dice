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

public class Dice extends PApplet {

Die one;
Die two;

public void setup()
{
  size(400, 400);
  noLoop();
}

public void draw()
{
  background(153, 51, 255);
  one = new Die (50, 100);
  one.show();
  two = new Die (250, 100);
  two.show();  
  text("your roll = " + one.numDots, 60, 300);
  text("your roll = " + two.numDots, 280, 300);
  text("Sum = " + (one.numDots + two.numDots), 180, 350);
}

class Die //models one single dice cube
{
  int myX, myY, numDots, numDotsB;
 
  Die(int x, int y) //constructor
  {
    myX = x;
    myY = y;
    numDots = (int)(Math.random() * 6) + 1;
  }

  public void show()
  {
    noStroke();
    fill(255, 255, 255);
    rect(myX, myY, 100, 100);
    fill(0);

    if(numDots == 1)
    {
      //1st die
      ellipse(myX+50, myY+50, 10, 10); 
    }
    if(numDots == 2)
    {
      //1st die
      ellipse(myX+25, myY+25, 10, 10);
      ellipse(myX+75, myY+75, 10, 10);    
    }
    if(numDots == 3)
    {
      //1st die
      ellipse(myX+25, myY+25, 10, 10);
      ellipse(myX+50, myY+50, 10, 10);
      ellipse(myX+75, myY+75, 10, 10);
    }
    if(numDots == 4)
    {
      //1st die
      ellipse(myX+25, myY+25, 10, 10);
      ellipse(myX+25, myY+75, 10, 10);
      ellipse(myX+75, myY+25, 10, 10);
      ellipse(myX+75, myY+75, 10, 10);
    }
    if(numDots == 5)
    {
      //1st die
      ellipse(myX+25, myY+25, 10, 10);
      ellipse(myX+25, myY+75, 10, 10);
      ellipse(myX+50, myY+50, 10, 10);
      ellipse(myX+75, myY+25, 10, 10);
      ellipse(myX+75, myY+75, 10, 10);     
    }
    if(numDots == 6)
    {
      //1st die
      ellipse(myX+25, myY+25, 10, 10);
      ellipse(myX+25, myY+50, 10, 10);
      ellipse(myX+25, myY+75, 10, 10);
      ellipse(myX+75, myY+25, 10, 10);
      ellipse(myX+75, myY+50, 10, 10);
      ellipse(myX+75, myY+75, 10, 10);     
   }
 }
}

public void mousePressed()
{  
  redraw(); 
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
