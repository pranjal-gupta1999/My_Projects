import java.awt.*;
import java.awt.event.*;
class Colourwheel extends Frame
{
	Colourwheel()
	{
        setVisible(true);
        setSize(300,300);
        setLocation(100,200);
        setBackground(Color.black);
        setForeground(Color.yellow);
        addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
	}
	public void paint(Graphics g)
	{
		int x1 =100, y1 =100, x2 = 100, y2=100, sa=0, ma=20;
    for(int i=0;;i++)
    {
     int r1 = (int)(Math.round(Math.random()*255));
     int g1 = (int)(Math.round(Math.random()*255));
     int b1 = (int)(Math.round(Math.random()*255));
     Color c = new Color(r1,g1,b1);
     g.setColor(c);
     g.fillArc(x1,y1,x2,y2,sa,ma);
     sa+=20;
     try{Thread.sleep(100);}
     catch(Exception e){} 
    }
     
	}
	public static void main(String ar[])
	{
		Colourwheel a = new Colourwheel();
	}
}