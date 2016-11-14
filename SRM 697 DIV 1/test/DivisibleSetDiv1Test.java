import org.junit.Test;
import static org.junit.Assert.*;

public class DivisibleSetDiv1Test {
	
	@Test(timeout=2000)
	public void test0() {
		int[] b = new int[] {2,1};
		assertEquals("Possible", new DivisibleSetDiv1().isPossible(b));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] b = new int[] {1,1};
		assertEquals("Impossible", new DivisibleSetDiv1().isPossible(b));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] b = new int[] {7, 7, 7};
		assertEquals("Possible", new DivisibleSetDiv1().isPossible(b));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] b = new int[] {5,3,5,4,6,1,3,7,9,6,2,5,4,1,1,9,6,10,10,6,10,7,7,8};
		assertEquals("Impossible", new DivisibleSetDiv1().isPossible(b));
	}
}
