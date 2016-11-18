
import static org.junit.Assert.*;

import org.junit.Test;

public class ConvertToIntTestOne {
	int initSize = 10;
	int[] testCases = {2, 0, 10, 1000, 1567, 8090876};
	MainPanel testPanel = new MainPanel(initSize);
	
	@Test
	public void testPrintMessage() {
		for(int i=0; i<testCases.length; i++){
			int curCase = testCases[i];
			assertEquals(curCase, testPanel.convertToInt(curCase));
		}
	}
}
