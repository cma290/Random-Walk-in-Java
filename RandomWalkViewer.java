import java.util.Scanner;

import javax.swing.JFrame;

public class RandomWalkViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(400, 400);
      frame.setTitle("Drunkard");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      RandomWalkComponent component = new RandomWalkComponent();
      frame.add(component);
		
		
	  Scanner in = new Scanner(System.in);
	  boolean validated = false;
	  while (!validated)
		{		
			System.out.print("Please enter num of steps: ");
			int stepnum = in.nextInt();			
			if (stepnum >= 0){ 
				validated = true;
				component.setStepNum(stepnum);
			    frame.setVisible(true);
			}
	        else {	  
	        	System.out.println("ERROR: step number must be non-negative.");
	        }		
		}
      
   }
}
