import org.junit.Test;
import static org.junit.Assert.*;

public class CrazyFunctionsTest {
	
	@Test(timeout=2000)
	public void test0() {
		int n = 2;
		int k = 1;
		assertEquals(2, new CrazyFunctions().count(n, k));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int n = 2;
		int k = 2;
		assertEquals(2, new CrazyFunctions().count(n, k));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 1;
		int k = 1;
		assertEquals(1, new CrazyFunctions().count(n, k));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 3;
		int k = 1;
		assertEquals(9, new CrazyFunctions().count(n, k));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int n = 3;
		int k = 3;
		assertEquals(6, new CrazyFunctions().count(n, k));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int n = 5;
		int k = 3;
		assertEquals(900, new CrazyFunctions().count(n, k));
	}
	
	@Test(timeout=2000)
	public void test6() {
		int n = 5000;
		int k = 5000;
		assertEquals(541108809, new CrazyFunctions().count(n, k));
	}
}
