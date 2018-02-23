package pkgCore;
import java.util.Random;

public class Die {

	private int DieValue;

	public Die() {
		//Random number generator for Die that gives number from 1 to 6.
		DieValue = (int) (Math.random() * 6) + 1;
	}

	//Allows other classes to access the value the die
	public int getDieValue() {
		return DieValue;
	}
	
}