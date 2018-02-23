package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Round;
import pkgCore.eGameResult;

public class RoundTest {

	@Test
	public void test() {
		for (int a = 0; a < 10000; a++) {
			Round r = new Round();
			if ((r.GetFirstRollScore()) == (r.GetLastRollScore()) && (r.RollCount() > 1)) {
				assertEquals(eGameResult.POINT, r.geteGameResult());
			}
			else if ((Round.isNatural(r.GetFirstRollScore()))) {
				assertEquals(eGameResult.NATURAL, r.geteGameResult());
			}
			else if ((Round.isCrap(r.GetFirstRollScore()))) {
				assertEquals(eGameResult.CRAPS, r.geteGameResult());
			}
			else if ((r.GetLastRollScore()) == 7 && r.RollCount() > 1) {
				assertEquals(eGameResult.SEVEN_OUT, r.geteGameResult());
			}
			else {
				System.out.println("rip");
			}
		}
	}

}
