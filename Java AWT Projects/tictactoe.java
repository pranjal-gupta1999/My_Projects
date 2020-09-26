import java.awt.*;
import java.awt.event.*;
class A extends Frame implements ActionListener
{
    	Button b[] = new Button[9];
    	int x=100;
    	int y=100;
    	int w=100;
    	int h=100;
    	int k=0,i=0;
    A()
    {
       setLayout(null);
       Font f = new Font("Chiller",Font.BOLD,30);
       setFont(f);
       for(int i=0;i<3;i++)
       {
       for(int j=0;j<3;j++)
       	{
           b[k] = new Button();
           b[k].setSize(w,h);
           b[k].setLocation(x,y);
           add(b[k]);
           b[k].addActionListener(this);
           k++;
           x =x+ 100;
       	}
       	x=100;
       	y=y+100;
       }
    }
    public void actionPerformed(ActionEvent e)
    {   
      Button b1 = (Button)e.getSource();  //getsource() return object
      if(i%2==0)
      {
         	b1.setLabel("X");
         	i++;
         	b1.removeActionListener(this);
      }
      else
      {     b1.setLabel("O");
            i++; 
            b1.removeActionListener(this);
      }
      if ( (b[0].getLabel()=="X" && b[1].getLabel()=="X" && b[2].getLabel()=="X") 
      	   || 
      	   (b[3].getLabel()=="X" && b[4].getLabel()=="X" && b[5].getLabel()=="X")
      	   || 
      	   (b[6].getLabel()=="X" && b[7].getLabel()=="X" && b[8].getLabel()=="X")
      	   ||
      	   (b[0].getLabel()=="X" && b[4].getLabel()=="X" && b[8].getLabel()=="X")
      	   ||
      	   (b[2].getLabel()=="X" && b[4].getLabel()=="X" && b[6].getLabel()=="X")
      	   ||
      	   (b[0].getLabel()=="X" && b[3].getLabel()=="X" && b[6].getLabel()=="X") 
      	   ||
      	   (b[1].getLabel()=="X" && b[4].getLabel()=="X" && b[7].getLabel()=="X")
      	   ||
      	   (b[2].getLabel()=="X" && b[5].getLabel()=="X" && b[8].getLabel()=="X"))
      {
      	System.out.println("1 Winner");  
      	for(int i=0;i<9;i++)
      	{
      		b[i].removeActionListener(this);
      	}
      }

      if(     (b[0].getLabel()=="O" && b[1].getLabel()=="O" && b[2].getLabel()=="O") 
      	   || (b[3].getLabel()=="O" && b[4].getLabel()=="O" && b[5].getLabel()=="O")
      	   || (b[6].getLabel()=="O" && b[7].getLabel()=="O" && b[8].getLabel()=="O")
      	   || (b[0].getLabel()=="O" && b[4].getLabel()=="O" && b[8].getLabel()=="O")
      	   || (b[2].getLabel()=="O" && b[4].getLabel()=="O" && b[6].getLabel()=="O")
      	   || (b[0].getLabel()=="O" && b[3].getLabel()=="O" && b[6].getLabel()=="O")
      	   || (b[1].getLabel()=="O" && b[4].getLabel()=="O" && b[7].getLabel()=="O")
      	   || (b[2].getLabel()=="O" && b[5].getLabel()=="O" && b[8].getLabel()=="O") )
      {
      	System.out.println("2 winner");
      	for(int i=0;i<9;i++)
      	{
      		b[i].removeActionListener(this);
      	}
      }
    }
}
class tictactoe
{
    public static void main(String ar[])
    {
       A a = new A();
       a.setVisible(true);
       a.setSize(500,500);
       a.setLocation(100,100);
       a.setBackground(Color.black);
       a.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
    }
}