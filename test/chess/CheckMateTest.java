//package chess;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class CheckMateTest {
//	
//	WindowChessGameSingle windowChessGameSingle;
//	
//	@Before
//	public setUp() {
//		windowChessGameSingle = new WindowChessGameSingle();
//		
//		boolean checkCase;
//	}
//	
//	
//	@Test
//	public void CheckCaseTest() {
//		
//		assertTrue(windowChessGameSingle.checkCases(0, checkCase, 0,  0)); // player1, (0,0)
//		assertTrue(windowChessGameSingle.checkCases(0, checkCase, 0,  7)); // player1, (0,7)
//		assertTrue(windowChessGameSingle.checkCases(0, checkCase, 7,  0)); // player1, (7,0)
//		assertTrue(windowChessGameSingle.checkCases(0, checkCase, 7,  7)); // player1, (7,7)
//		
//		assertTreu(windowChessGameSingle.checkCases(1, checkCase, 0,  0)); // player2, (0,0)
//		assertTreu(windowChessGameSingle.checkCases(1, checkCase, 0,  7)); // player2, (0,7)
//		assertTreu(windowChessGameSingle.checkCases(1, checkCase, 7,  0)); // player2, (7,0)
//		assertTreu(windowChessGameSingle.checkCases(1, checkCase, 7,  7)); // player2, (7,7)
//		
//		assertFalse(windowChessGameSingle.checkCases(0, checkCase, 0, -1)); // player1, Invaild newKingCol
//		assertFalse(windowChessGameSingle.checkCases(0, checkCase, -1, 0)); // player1, Invaild newKingCol
//		assertFalse(windowChessGameSingle.checkCases(0, checkCase, 0,  8)); // player1, Invaild newKingCol
//		assertFalse(windowChessGameSingle.checkCases(0, checkCase, 8,  0)); // player1, Invaild newKingCol
//		
//		assertFalse(windowChessGameSingle.checkCases(1, checkCase, -1, 0)); // player2, Invaild newKingRow
//		assertFalse(windowChessGameSingle.checkCases(1, checkCase, 0, -1)); // player2, Invaild newKingRow
//		assertFalse(windowChessGameSingle.checkCases(1, checkCase, 8,  0)); // player2, Invaild newKingRow
//		assertFalse(windowChessGameSingle.checkCases(1, checkCase, 0,  8)); // player2, Invaild newKingRow
//		
//	}
//	
//	@Test
//	public void CheckMoveTest() {
//		
//		assertTrue(windowChessGameSingle.checkMove(0, 0)); // Valid Row & Col
//		assertTrue(windowChessGameSingle.checkMove(0, 7)); // Valid Row & Col
//		assertTrue(windowChessGameSingle.checkMove(7, 0)); // Valid Row & Col
//		assertTrue(windowChessGameSingle.checkMove(7, 7)); // Valid Row & Col
//		
//		assertFalse(windowChessGameSingle.checkMove(8, 0)); // Invalid Row & Col
//		assertFalse(windowChessGameSingle.checkMove(-1, 0)); // Invalid Row & Col
//		assertFalse(windowChessGameSingle.checkMove(0, 8));  // Invalid Row & Col
//		assertFalse(windowChessGameSingle.checkMove(0, -1)); // Invalid Row & Col
//	}
//}