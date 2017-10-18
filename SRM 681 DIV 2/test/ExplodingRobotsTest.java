import org.junit.Test;
import static org.junit.Assert.*;

public class ExplodingRobotsTest {
	
	@Test(timeout=2000)
	public void test0() {
		int x1 = 1;
		int y1 = 0;
		int x2 = 2;
		int y2 = 0;
		String instructions = "L";
		assertEquals("Explosion", new ExplodingRobots().canExplode(x1, y1, x2, y2, instructions));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int x1 = 1;
		int y1 = 0;
		int x2 = 2;
		int y2 = 0;
		String instructions = "U";
		assertEquals("Safe", new ExplodingRobots().canExplode(x1, y1, x2, y2, instructions));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int x1 = 1;
		int y1 = 0;
		int x2 = 2;
		int y2 = 0;
		String instructions = "UL";
		assertEquals("Explosion", new ExplodingRobots().canExplode(x1, y1, x2, y2, instructions));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int x1 = 3;
		int y1 = 3;
		int x2 = 5;
		int y2 = 5;
		String instructions = "LURLL";
		assertEquals("Safe", new ExplodingRobots().canExplode(x1, y1, x2, y2, instructions));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int x1 = 10;
		int y1 = 5;
		int x2 = -9;
		int y2 = -10;
		String instructions = "LULULULLLUULRULULULULULULLULULLULD";
		assertEquals("Explosion", new ExplodingRobots().canExplode(x1, y1, x2, y2, instructions));
	}
}
