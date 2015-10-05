import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.geom.Line2D;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.KeyStroke;
import javax.swing.Timer;

import java.util.Scanner;

public class RandomWalkComponent extends Canvas//JComponent
{
	//int i = 0;
	/*public RandomWalkComponent() {
		ActionListener animate = new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				repaint();
	    	}
		};
		Timer timer = new Timer(50,animate);
	    timer.start();
	}*/
	
	public void paint (Graphics g)
	{
		Drunkard drunk = new Drunkard( new ImPoint(200,200), 5);
	
		for (int i=1; i<=stepNum; i++)
		{
			ImPoint old = drunk.getCurrentLoc();
			drunk.takeStep();
			Line2D seg= new Line2D.Double(old.getX(), old.getY(), drunk.getCurrentLoc().getX(), drunk.getCurrentLoc().getY() );
			Graphics2D g2=(Graphics2D ) g;
			g2.draw(seg);
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			//in.close();		
	}
	
	private int stepNum;
	
	public void setStepNum(int stepNumFrom)
	{
		stepNum = stepNumFrom;
	}
}


