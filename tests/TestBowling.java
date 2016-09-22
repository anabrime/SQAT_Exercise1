import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testScore() {

		Frame frame = new Frame(1,4);

		assertEquals(frame.score(), 5);

	}

	@Test
	public void testIsStrike() {

		Frame frame = new Frame(1,4);

		assertEquals(frame.isStrike(), false);

	}

	@Test
	public void testIsStrike2() {

		Frame frame = new Frame(10,0);

		assertEquals(frame.isStrike(), true);

	}
	@Test
	public void testIsSpare() {

		Frame frame = new Frame(1,4);

		assertEquals(frame.isSpare(), false);

	}

	@Test
	public void testIsSpare2() {

		Frame frame = new Frame(0,10);

		assertEquals(frame.isSpare(), true);

	}
	
	
	
}
