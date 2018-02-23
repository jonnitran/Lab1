package pkgCore;

public class Roll {

	private Die d1;
	private Die d2;
	private int Score;

	public Roll() {
		//d1 and d2 are two new instances of Die that are numbers between 1 and 6  	
		d1 = new Die();
		d2 = new Die();
		Score = scoreRoll();
	}

	//Adds the value of d1 and d2 to get a total score of the two die
	public byte scoreRoll() {
		
		return (byte)(d1.getDieValue() + d2.getDieValue());
	}
	
	//Determines if the score of the two rolled equals 7
	public boolean isSeven() {
		return Score==7 ? true:false;
	}
	
	//Allows other classes to access the score of the two die.
	public int getScore() {
		return Score;
	}

}
