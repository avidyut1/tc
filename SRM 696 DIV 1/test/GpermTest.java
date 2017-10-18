import org.junit.Test;
import static org.junit.Assert.*;

public class GpermTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] x = new int[] {0};
		int[] y = new int[] {1};
		assertEquals(1, new Gperm().countfee(x, y));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] x = new int[] {0,1};
		int[] y = new int[] {1,2};
		assertEquals(2, new Gperm().countfee(x, y));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] x = new int[] {4,7,7};
		int[] y = new int[] {7,4,4};
		assertEquals(3, new Gperm().countfee(x, y));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] x = new int[] {0,0,1};
		int[] y = new int[] {1,2,2};
		assertEquals(4, new Gperm().countfee(x, y));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] x = new int[] {7,8,9};
		int[] y = new int[] {4,5,6};
		assertEquals(6, new Gperm().countfee(x, y));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] x = new int[] {45,28,42,5,27,27,42,36,14,27,19,42,24,27,8,31,24,27,14,28};
		int[] y = new int[] {45,27,45,8,34,34,28,0,11,42,24,19,14,31,45,42,14,24,28,27};
		assertEquals(53, new Gperm().countfee(x, y));
	}
}
