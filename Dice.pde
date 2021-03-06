Die one;
Die two;

void setup()
{
  size(400, 400);
  noLoop();
}

void draw()
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

  void show()
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

void mousePressed()
{  
  redraw(); 
}