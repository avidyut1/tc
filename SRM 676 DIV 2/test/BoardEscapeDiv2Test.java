import org.junit.Test;
import static org.junit.Assert.*;

public class BoardEscapeDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		String[] s = new String[] {"T.#",
 "#.E"};
		int k = 3;
		assertEquals("Alice", new BoardEscapeDiv2().findWinner(s, k));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] s = new String[] {"E#E",
 "#T#",
 "E#E"};
		int k = 99;
		assertEquals("Bob", new BoardEscapeDiv2().findWinner(s, k));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] s = new String[] {"#E...",
 "#...E",
 "E.T#.",
 "..#.."};
		int k = 13;
		assertEquals("Alice", new BoardEscapeDiv2().findWinner(s, k));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] s = new String[] {"TE"};
		int k = 50;
		assertEquals("Alice", new BoardEscapeDiv2().findWinner(s, k));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] s = new String[] {".T."};
		int k = 1;
		assertEquals("Alice", new BoardEscapeDiv2().findWinner(s, k));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String[] s = new String[] {"..........................",
 "......EEE..EEE..E...E.....",
 ".....E.....E..E.EE.EE.....",
 "......EEE..EEE..E.E.E.....",
 ".........E.E.E..E...E.....",
 "......EEE..E..E.E...E.....",
 "..........................",
 "...E#E#E#E#E#E#E#E#E#E#...",
 "..........................",
 "......EEE..EEE...EEE......",
 ".....E........E.E.........",
 "......EEE.....E..EEE......",
 ".....E...E...E..E...E.....",
 "......EEE....E...EEE......",
 "..........................",
 "...#E#E#E#E#E#E#E#E#E#E...",
 "..........................",
 "....EE...E...E..E.EEE.E...",
 "...E.....E...E..E.E...E...",
 "...E.EE..E...EEEE.EE..E...",
 "...E..E..E...E..E.E.......",
 "....EE...EEE.E..E.E...E...",
 "T........................."};
		int k = 100;
		assertEquals("Bob", new BoardEscapeDiv2().findWinner(s, k));
	}
}
