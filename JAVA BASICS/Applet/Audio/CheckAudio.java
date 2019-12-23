import java.awt.*;
import java.applet.*;
public class CheckAudio extends Applet
{	
	Label l;
	AudioClip a;
	public void init()
	{
		l=new Label("Play audio in java applet");
		add(l);
		a=getAudioClip(getCodeBase(),"test.mp3");
		a.play();
	}
}