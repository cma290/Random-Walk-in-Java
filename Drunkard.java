// Name:Cheng Ma	
// USC loginid:cma290
// CS 455 PA1
// Fall 2013
import java.util.Random;

/**
   Drunkard class
       Represents a "drunkard" doing a random walk on a grid.
*/
public class Drunkard {
	private int stepSize;
	private Random random;
	private ImPoint currentLoc;
    /**
       Creates drunkard with given starting location and distance
       moved in a single step.
       @param startLoc starting location of drunkard
       @param theStepSize size of one step in the random walk
    */
    public Drunkard(ImPoint startLoc, int theStepSize) {
    	currentLoc = startLoc;
    	stepSize = theStepSize;
    	random = new Random();
    }


    /**
       Takes a step of length step-size (see constructor) in one of
       the four compass directions.  Changes the current location of the
       drunkard.
    */
    public void takeStep() {
    	int i = random.nextInt(4);
    	if (i==0)
    		currentLoc = currentLoc.translate(stepSize,0);
    	else if (i==1)
    		currentLoc = currentLoc.translate(-stepSize,0);
    	else if (i==2)
    		currentLoc = currentLoc.translate(0,stepSize);
    	else if (i==3)
    		currentLoc = currentLoc.translate(0,-stepSize);
    }


    /**
       gets the current location of the drunkard.
       @return an ImPoint object representing drunkard's current location
    */
    public ImPoint getCurrentLoc() {
    	return currentLoc;
    }

}
