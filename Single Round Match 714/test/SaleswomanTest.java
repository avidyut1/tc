import org.junit.Test;
import static org.junit.Assert.*;

public class SaleswomanTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] pos = new int[] {3,14,15,92,101};
		int[] delta = new int[] {-3,2,3,-3,1};
		assertEquals(143, new Saleswoman().minMoves(pos, delta));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] pos = new int[] {1,2,4,8,16,32,64,128};
		int[] delta = new int[] {-1,-1,-1,-1,1,1,1,1};
		assertEquals(382, new Saleswoman().minMoves(pos, delta));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] pos = new int[] {100000};
		int[] delta = new int[] {0};
		assertEquals(100000, new Saleswoman().minMoves(pos, delta));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] pos = new int[] {100,200,300,400};
		int[] delta = new int[] {10,-3,-5,2};
		assertEquals(400, new Saleswoman().minMoves(pos, delta));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] pos = new int[] {1,2,3,5,8,13,21,34,55,89};
		int[] delta = new int[] {-1,1,-1,1,-1,1,-1,1,-1,1};
		assertEquals(199, new Saleswoman().minMoves(pos, delta));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] pos = new int[] {1,2,3,6,10,15,21,28,36,45,55};
		int[] delta = new int[] {-3,-5,10,-2,-6,-7,3,-2,8,5,-1};
		assertEquals(129, new Saleswoman().minMoves(pos, delta));
	}
}
