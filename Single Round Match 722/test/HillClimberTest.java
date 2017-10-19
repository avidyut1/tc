import org.junit.Test;
import static org.junit.Assert.*;

public class HillClimberTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] height = new int[] { 1, 2, 3, 2, 2 };
		assertEquals(2, new HillClimber().longest(height));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] height = new int[] { 1, 2, 2, 3 };
		assertEquals(1, new HillClimber().longest(height));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] height = new int[] { 1, 8, 9, 12 };
		assertEquals(3, new HillClimber().longest(height));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] height = new int[] { 10, 4, 4, 2 };
		assertEquals(0, new HillClimber().longest(height));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] height = new int[] { 10, 8, 4, 9, 11, 14, 15, 3, 7, 8, 10, 6 };
		assertEquals(4, new HillClimber().longest(height));
	}
}
