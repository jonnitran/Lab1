package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;
import pkgCore.Roll;

public class RollTest {

	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			//Assert that test if Roll returns a value between 2 and 12
			assertTrue ((r.getScore() >= 2)  && (r.getScore() <= 12));
		}

	}

}
