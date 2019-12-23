import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet codebase="./*" code=AudioClipClass width=400 height=500></applet>*/
public class AudioClipClass extends Applet
{
	Label l;
	AudioClip a;
	public void init()
	{
		System.out.println("Initialised");
		l=new Label("Play audio in java applet");
		add(l);
		a=getAudioClip(getCodeBase(),"test.mp3");
		a.play();
	}
	public void paint(Graphics g)
	{
		setBackgrounf
		g.drawString("trying to check problem",20,20);
	}
}