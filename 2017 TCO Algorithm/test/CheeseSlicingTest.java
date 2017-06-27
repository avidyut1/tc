import org.junit.Test;
import static org.junit.Assert.*;

public class CheeseSlicingTest {
	
	@Test(timeout=2000)
	public void test0() {
		int A = 1;
		int B = 3;
		int C = 3;
		int S = 2;
		assertEquals(0, new CheeseSlicing().totalArea(A, B, C, S));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int A = 5;
		int B = 3;
		int C = 5;
		int S = 3;
		assertEquals(25, new CheeseSlicing().totalArea(A, B, C, S));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int A = 5;
		int B = 5;
		int C = 5;
		int S = 2;
		assertEquals(58, new CheeseSlicing().totalArea(A, B, C, S));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int A = 49;
		int B = 92;
		int C = 20;
		int S = 3;
		assertEquals(30045, new CheeseSlicing().totalArea(A, B, C, S));
	}
}
