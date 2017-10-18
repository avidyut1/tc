import org.junit.Test;
import static org.junit.Assert.*;

public class SplitIntoPairsTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] A = new int[] {2,-1};
		int X = -1;
		assertEquals(0, new SplitIntoPairs().makepairs(A, X));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] A = new int[] {1,-1};
		int X = -1;
		assertEquals(1, new SplitIntoPairs().makepairs(A, X));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] A = new int[] {-5,-4,2,3};
		int X = -1;
		assertEquals(2, new SplitIntoPairs().makepairs(A, X));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] A = new int[] {5,-7,8,-2,-5,3};
		int X = -7;
		assertEquals(3, new SplitIntoPairs().makepairs(A, X));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] A = new int[] {3,4,5,6,6,-6,-4,-10,-1,-9};
		int X = -2;
		assertEquals(4, new SplitIntoPairs().makepairs(A, X));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] A = new int[] {1000000,1000000};
		int X = -5;
		assertEquals(1, new SplitIntoPairs().makepairs(A, X));
	}
}
