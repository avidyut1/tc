import org.junit.Test;
import static org.junit.Assert.*;

public class SwapAndArithmeticTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] x = new int[] {3,1,2};
		assertEquals("Possible", new SwapAndArithmetic().able(x));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] x = new int[] {1,2,4};
		assertEquals("Impossible", new SwapAndArithmetic().able(x));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] x = new int[] {1,1,1,1,1,1};
		assertEquals("Possible", new SwapAndArithmetic().able(x));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] x = new int[] {1000,704,1};
		assertEquals("Impossible", new SwapAndArithmetic().able(x));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] x = new int[] {7,3,11,5,1,9};
		assertEquals("Possible", new SwapAndArithmetic().able(x));
	}
}
