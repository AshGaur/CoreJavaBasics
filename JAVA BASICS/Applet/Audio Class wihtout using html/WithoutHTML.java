import java.awt.*;
import java.applet.*;
/*<applet code=WithoutHTML width=400 height=400 param name=prog value="WithoutHTML"></applet>*/ 	//Parameters value only assigned by html files
public class WithoutHTML extends Applet
{
	String str;
	public void init()
	{
		System.out.println("init called");
		str=getParameter("prog");
		setBackground(Color.cyan);
		setBackground(Color.red);
	}
	public void paint(Graphics g)
	{
		g.drawString("Hi i am an applet running without html :"+str,80,180); //str=null not an html i think so bcause in book parameter used in html file i tried using the same in java
		System.out.println("paint called");
	}
}