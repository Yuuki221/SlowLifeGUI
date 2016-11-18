import static org.junit.Assert.*;

import org.junit.Test;

public class GetNumNTest {
	int initSize = 10;
	MockGetNumNeighbors testPanel = new MockGetNumNeighbors();
	
	@Test
	public void testGetNumNeighbors() {
		assertEquals(6, testPanel.getNumNeighbors(5, 9));
		assertEquals(6, testPanel.getNumNeighbors(0, 4));
		assertEquals(6, testPanel.getNumNeighbors(2, 3));
	}
}
