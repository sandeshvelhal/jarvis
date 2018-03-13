import java.awt.*;
import java.applet.*;
/*
<applet code=HelloWorld.class width=400 height=500></applet>
 */
public class HelloWorld extends applet
{
	public void paint(Graphics g)
	{
		Color red=new Color(255,0,0);
		Color green=new Color(0,255,0);
		Color blue=new Color(0,0,255);
		Color yellow=new Color(255,255,0);
		g.setColor(red);
		g.drawLine(10, 10, 40, 40);
	}
}
