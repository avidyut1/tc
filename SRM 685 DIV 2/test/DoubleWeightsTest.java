import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleWeightsTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] weight1 = new String[] {"..14",
 "..94",
 "19..",
 "44.."};
		String[] weight2 = new String[] {"..94",
 "..14",
 "91..",
 "44.."};
		assertEquals(64, new DoubleWeights().minimalCost(weight1, weight2));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] weight1 = new String[] {"..14",
 "..14",
 "11..",
 "44.."};
		String[] weight2 = new String[] {"..94",
 "..94",
 "99..",
 "44.."};
		assertEquals(36, new DoubleWeights().minimalCost(weight1, weight2));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] weight1 = new String[] {"..",
 ".."};
		String[] weight2 = new String[] {"..",
 ".."};
		assertEquals(-1, new DoubleWeights().minimalCost(weight1, weight2));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] weight1 = new String[] {".....9",
 "..9...",
 ".9.9..",
 "..9.9.",
 "...9.9",
 "9...9."};
		String[] weight2 = new String[] {".....9",
 "..9...",
 ".9.9..",
 "..9.9.",
 "...9.9",
 "9...9."};
		assertEquals(2025, new DoubleWeights().minimalCost(weight1, weight2));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] weight1 = new String[] {".4...1",
 "4.1...",
 ".1.1..",
 "..1.1.",
 "...1.1",
 "1...1."};
		String[] weight2 = new String[] {".4...1",
 "4.1...",
 ".1.1..",
 "..1.1.",
 "...1.1",
 "1...1."};
		assertEquals(16, new DoubleWeights().minimalCost(weight1, weight2));
	}
 @Test(timeout = 2000)
 public void test5(){
  String [] w1 = new String[]{"...3.....73", "..7......8.", ".7.4.4.....", "3.4.9...9..", "...9.8.....", "..4.8.1....", ".....1.4..5", "......4.2..", "...9...2.1.", "78......1.8", "3.....5..8."};
  String [] w2 = new String[]{"...3.....73", "..7......8.", ".7.4.4.....", "3.4.9...9..", "...9.8.....", "..4.8.1....", ".....1.4..5", "......4.2..", "...9...2.1.", "78......1.8", "3.....5..8."};
  assertEquals(196, new DoubleWeights().minimalCost(w1, w2));
 }
 @Test(timeout = 2000)
 public void test6(){
  String [] w1 = new String[] {"......777...8", "..4.........6", ".4.26.......3", "..2.9.9.....1", "..69.8......8", "....8.79.....", "7..9.7.5.....", "7....95.53.3.", "7......5.4.71", ".......34.8..", ".........8.36", ".......37.3.9", "86318...1.69."};
  String [] w2 = new String[] {"......777...8", "..4.........6", ".4.26.......3", "..2.9.9.....1", "..69.8......8", "....8.79.....", "7..9.7.5.....", "7....95.53.3.", "7......5.4.71", ".......34.8..", ".........8.36", ".......37.3.9", "86318...1.69."};
  assertEquals(196, new DoubleWeights().minimalCost(w1, w2));
 }
}
