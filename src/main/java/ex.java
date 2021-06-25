import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;



public class ex {

	private WindowChessGameSingle windowChessGameSingle;
    
	@Before
	public void setUp() {
		windowChessGameSingle = new WindowChessGameSingle();
		
	}
	
	@Test
	public void CheckCaseTest() {
		
		boolean checkCase = false;
		assertTrue(windowChessGameSingle.checkCases(0, checkCase, 0,  0)); // player1, (0,0)
		assertTrue(windowChessGameSingle.checkCases(0, checkCase, 7,  7)); // player1, (0,0)
		assertTrue(windowChessGameSingle.checkCases(1, checkCase, 0,  0)); // player2, (0,0)
		assertTrue(windowChessGameSingle.checkCases(1, checkCase, 7,  7)); // player2, (0,0)
		
		assertFalse(windowChessGameSingle.checkCases(0, checkCase, -1, -1)); // player1, Invaild newKingCol
		assertFalse(windowChessGameSingle.checkCases(0, checkCase,  8,  8)); // player1, Invaild newKingCol
		assertFalse(windowChessGameSingle.checkCases(1, checkCase, -1, -1)); // player2, Invaild newKingRow
		assertFalse(windowChessGameSingle.checkCases(1, checkCase,  8,  8)); // player2, Invaild newKingRow
	}
	

}
