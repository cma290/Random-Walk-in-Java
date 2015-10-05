import java.util.Random;

public class DrunkardTester {

    /**
       Test driver for Drunkard class.
       @param args not used
    */
    public static void main(String[] args) {

    	ImPoint start = new ImPoint(40,40);
    	drunkardTest(start, 5);
    }
 
    /**
       Test Drunkard's method
     */
    private static void drunkardTest(ImPoint x, int y) {
	
	Drunkard loc = new Drunkard(x, y);

	System.out.println("startLoc=" + loc.getCurrentLoc() + " stepSize=" + y +"\n");
	
    testTakeStep();
    }

    /**
       Test takestep method
     */
   
    private static void testTakeStep() {
    	
    	ImPoint x = new ImPoint(80,80);
    	Drunkard start = new Drunkard(x, 5);
    	System.out.println("before taking step:"+start.getCurrentLoc());
    	start.takeStep();
    	System.out.println("after taking one step:"+start.getCurrentLoc());


    }

}
