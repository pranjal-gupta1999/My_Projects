import java.awt.*;
import java.awt.event.*;
class numbers extends Frame
{
	numbers()
	{
		setVisible(true);
		setSize(900,650);
		setLocation(100,100);
		setBackground(Color.black);
		addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
		Font f =new Font("Chiller",Font.BOLD,30);
		setFont(f);
	}
	public void paint(Graphics g)
	{  try
	{   
		int a=1,x=100,y=100;
		for(int j=1;j<=10;j++)
		{
          Thread.sleep(300);
		for(int i=1;i<=10;i++)
		{  Thread.sleep(300);
		   int r1= (int)(Math.round(Math.random()*255));
		   int g1= (int)(Math.round(Math.random()*255));
		   int b1= (int)(Math.round(Math.random()*255));
		   Color c =new Color(r1,g1,b1);
		   g.setColor(c);
		   g.drawString(""+a,x,y);
		   a++;
		   y=y+50;	
		}
          x= x+70;
          y=100;
		}

	} 
	catch(Exception e){}	
	}
	public static void main(String ar[])
	{
       numbers n =new numbers();
	}
}