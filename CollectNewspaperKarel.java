/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {
    public static void main(String[] args) {
        stanford.karel.Karel.main(new String[] { "code="
                + CollectNewspaperKarel.class.getCanonicalName() });
    }

	// You fill in this part
	public void run() {
		moveToPaper();
		pickItUp();
		returnToStart();
	}
	
	private void moveToPaper() {
		move(2);
		turnRight();
		move();
		turnLeft();
		move();
	}
	
	private void pickItUp() {
		pickBeeper();
	}
	
	private void returnToStart() {
		turnAround();
		move(3);
		turnRight();
		move();
		turnRight();
	}
	
	public void move(int x) {
		//BugBug: need to check to see if frontIsClear before moving
		for (int i = 0; i < x; i++) {
			move();
		}
	}
}
