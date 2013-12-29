/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does something now.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
    public static void main(String[] args) {
        stanford.karel.Karel.main(new String[] { "code="
                + StoneMasonKarel.class.getCanonicalName() });
    }

    public void run() {
	// We know we start at 1st Ave. and 1st street and it has to be 
    // a column, so lets fill the first one
    while (frontIsClear()) {
       	fillColumn();
       	returnToFirstAve();
       	moveFour();
    }
    //we are at the end of the world, fill the last column and return home
    fillColumn();
    goHome();
    }
    
    private void fillColumn() {
    	turnLeft();
    	while (frontIsClear()) {
        	if (noBeepersPresent()) {
        		putBeeper();
        	}
    		move();
    	}
    	//we are at the top check for a beeper
    	if (noBeepersPresent()) {
    		putBeeper();
    	}
    }
    
    private void returnToFirstAve() {
    	// return to the bottom of the world and face East
    	turnAround();
    	while (frontIsClear()) {
    		move();
    	}
    	turnLeft(); // face East to get ready for next column		
    }
    
    private void moveFour() {
    	for (int i = 0; i < 4; i++) {
        	if (frontIsClear()) {
        		move();
        	}
    	}
    }
    
    private void goHome() {
    	returnToFirstAve();
    	turnAround();
    	while (frontIsClear()) {
    		move();
    	}
    	turnAround();
    }
}