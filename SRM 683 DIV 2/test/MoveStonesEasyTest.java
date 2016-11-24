import org.junit.Test;
import static org.junit.Assert.*;

public class MoveStonesEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] a = new int[] {1, 2};
		int[] b = new int[] {2, 1};
		assertEquals(1, new MoveStonesEasy().get(a, b));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] a = new int[] {10, 0};
		int[] b = new int[] {0, 10};
		assertEquals(10, new MoveStonesEasy().get(a, b));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] a = new int[] {0, 0, 1};
		int[] b = new int[] {1, 0, 0};
		assertEquals(2, new MoveStonesEasy().get(a, b));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] a = new int[] {12, 12};
		int[] b = new int[] {12, 12};
		assertEquals(0, new MoveStonesEasy().get(a, b));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] a = new int[] {5};
		int[] b = new int[] {6};
		assertEquals(-1, new MoveStonesEasy().get(a, b));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] a = new int[] {3,10,0,4,0,0,0,1,0};
		int[] b = new int[] {5,5,0,7,0,0,0,0,1};
		assertEquals(9, new MoveStonesEasy().get(a, b));
	}
}
