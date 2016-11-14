import org.junit.Test;
import static org.junit.Assert.*;

public class PartisanGameTest {
	
	@Test(timeout=2000)
	public void test0() {
		int n = 7;
		int[] a = new int[] {3, 4};
		int[] b = new int[] {4};
		assertEquals("Alice", new PartisanGame().getWinner(n, a, b));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int n = 10;
		int[] a = new int[] {1};
		int[] b = new int[] {4, 3, 2};
		assertEquals("Bob", new PartisanGame().getWinner(n, a, b));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 104982;
		int[] a = new int[] {2, 3, 4, 5};
		int[] b = new int[] {2, 5};
		assertEquals("Alice", new PartisanGame().getWinner(n, a, b));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 999999999;
		int[] a = new int[] {4};
		int[] b = new int[] {5};
		assertEquals("Bob", new PartisanGame().getWinner(n, a, b));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int n = 1000000000;
		int[] a = new int[] {1,2,3,4,5};
		int[] b = new int[] {1,2,3,4,5};
		assertEquals("Alice", new PartisanGame().getWinner(n, a, b));
	}
}
