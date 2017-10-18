import org.junit.Test;
import static org.junit.Assert.*;

public class SymmetryDetectionTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] board = new String[] {"#####",
 ".###.",
 "..#.."};
		assertEquals("Vertically symmetric", new SymmetryDetection().detect(board));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] board = new String[] {"#####",
 "#...#",
 "#####"};
		assertEquals("Both", new SymmetryDetection().detect(board));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] board = new String[] {"#..",
 "#..",
 "#.."};
		assertEquals("Horizontally symmetric", new SymmetryDetection().detect(board));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] board = new String[] {"#.",
 ".#"};
		assertEquals("Neither", new SymmetryDetection().detect(board));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] board = new String[] {"#######",
 "#..#..#",
 "#######",
 "...#...",
 "#######"};
		assertEquals("Vertically symmetric", new SymmetryDetection().detect(board));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String[] board = new String[] {"#.....#",
 "#.....#",
 "#######",
 "#...#.#",
 "#.....#"};
		assertEquals("Neither", new SymmetryDetection().detect(board));
	}
	
	@Test(timeout=2000)
	public void test6() {
		String[] board = new String[] {"#######.#.....#",
 "...#....#.....#",
 ".#####..#######",
 "...#....#.....#",
 "#######.#.....#"};
		assertEquals("Horizontally symmetric", new SymmetryDetection().detect(board));
	}
	
	@Test(timeout=2000)
	public void test7() {
		String[] board = new String[] {"."};
		assertEquals("Both", new SymmetryDetection().detect(board));
	}
}
