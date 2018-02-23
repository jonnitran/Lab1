
package pkgCore;

import java.util.LinkedList;

public class Round {
/*Jonni Tran
 * Zhaoyuan Wang
 * Veronica Parker
 * Qizhe
 */
	
	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		
		
		//Calls an instance of the roll class assigned to value r.
		Roll r = new Roll();
		rolls.add(r);
		ComeOutScore = r.getScore();
		
		//Condition for if statements.
		boolean gameOver = false;
		
		//Determines if first roll is a craps, and if it is set the game result to that
		if(r.getScore() == 2 || r.getScore() == 3 || r.getScore() == 12) {
			gameOver = true;
			eGameResult = eGameResult.CRAPS;
		}
		
		//Determines if first roll is a natural, and if it is set the game result to that
		if(r.getScore() == 7 || r.getScore() == 11) {
			gameOver = true;
			eGameResult = eGameResult.NATURAL;
		}
		
		/*While loop for when a point is rolled first. Tests if a future roll is seven which will end the game and give the result.
		 * If the the next value is not a seven and a duplicate point, game will end and give result.
		 * If neither has happened, the code will keep running a new die class.
		 */
		while (gameOver == false) {
			r = new Roll();
			rolls.add(r);
			if(r.isSeven() == true) {
				gameOver = true;
				eGameResult = eGameResult.SEVEN_OUT;
			}
			if(rolls.getLast().getScore() == rolls.getFirst().getScore()) {
				gameOver = true;
				eGameResult = eGameResult.POINT;
			}
		}
	}

	// Return the roll count
	public int RollCount() {
		return rolls.size();
	}
	public static boolean isCrap(int theScore) {
		return (theScore == 2 || theScore == 3 || theScore == 12) ;
		}
	public static boolean isNatural (int theScore) {
		return (theScore == 7 || theScore == 11);	
	}
	public int GetFirstRollScore() {
		return rolls.getFirst().getScore();
	}
	public int GetLastRollScore() {
		return rolls.getLast().getScore();
	}

	public eGameResult geteGameResult() {
		return eGameResult;
	}
	
}
