import java.awt.*;
import java.awt.event.*;
class flag extends Frame
{
	flag()
	{
		setVisible(true);
		setSize(500,700);
		setLocation(100,100);
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});

	}

	public void paint(Graphics g)
	{  
		int ma=4,sa=0,w =45,h = 45,x1=180,y1=145;
		g.setColor(Color.black);
		try{
              g.fillRect(100,100,10,450);
              Thread.sleep(500);
              g.fillRect(80,550,50,10);
              Thread.sleep(500);
              g.fillRect(70,560,70,10);
              Thread.sleep(500);
              g.fillRect(60,570,90,10);
              Thread.sleep(500);
              g.setColor(Color.orange);
              g.fillRect(110,100,200,45);
              g.setColor(Color.green);
              Thread.sleep(500);
              g.fillRect(110,190,200,45);
              Thread.sleep(500);
              g.setColor(Color.blue);
              for(int i=1;i<=24;i++)
              {
              	 g.fillArc(x1,y1,w,h,sa,ma);
              	 sa+=15;
              	 Thread.sleep(20);
              }
              
		}
        catch(Exception e){}
	}
	public static void main(String ar[])
	{
      flag f = new flag();
	}
}