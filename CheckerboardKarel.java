/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
    public static void main(String[] args) {
        stanford.karel.Karel.main(new String[] { "code="
                + CheckerboardKarel.class.getCanonicalName() });
    }

    public void run() {
    	fillFirstRow();
    	while (frontIsClear()) {
        	fillEvenRow();
        	fillOddRow();
    	}
    	turnRight();
    }

    private void fillFirstRow() {
    	putBeeper();
    	while (frontIsClear()) {
    		move();
    		if (frontIsClear()) {
    		move();
    		putBeeper();
    		}
    	}
    	turnLeft();
    }
    
    private void fillEvenRow() {
    	if (beepersPresent() && frontIsClear()) {
    		move();
    		turnLeft();
    		if (frontIsClear()) {
    			move();
    			putBeeper();
    		}
    	} else {
    		if (frontIsClear()) {
    			move();
    			putBeeper();
    			turnLeft();
    		}
    	}
        	while (frontIsClear()) {
        		move();
        		if (frontIsClear()) {
        		move();
        		putBeeper();
        		}
    	}
        turnRight();
    }
    
    private void fillOddRow() {
    	if (beepersPresent() && frontIsClear()) {
    		move();
    		turnRight();
    		move();
    		putBeeper();
    	} else {
    		if (frontIsClear()) {
    			move();
    			putBeeper();
    			turnRight();
    		}
    	}
    	while (frontIsClear()) {
    		move();
    		if (frontIsClear()) {
    		move();
    		putBeeper();
    		}
	}
    turnLeft();
    }
}