import org.junit.Test;
import static org.junit.Assert.*;

public class GCDGraphTest {
	
	@Test(timeout=2000)
	public void test0() {
		int n = 12;
		int k = 2;
		int x = 8;
		int y = 9;
		assertEquals("Possible", new GCDGraph().possible(n, k, x, y));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int n = 12;
		int k = 2;
		int x = 11;
		int y = 12;
		assertEquals("Impossible", new GCDGraph().possible(n, k, x, y));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 12;
		int k = 2;
		int x = 11;
		int y = 11;
		assertEquals("Possible", new GCDGraph().possible(n, k, x, y));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 10;
		int k = 2;
		int x = 8;
		int y = 9;
		assertEquals("Impossible", new GCDGraph().possible(n, k, x, y));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int n = 1000000;
		int k = 1000;
		int x = 12345;
		int y = 54321;
		assertEquals("Possible", new GCDGraph().possible(n, k, x, y));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int n = 1000000;
		int k = 2000;
		int x = 12345;
		int y = 54321;
		assertEquals("Impossible", new GCDGraph().possible(n, k, x, y));
	}
	
	@Test(timeout=2000)
	public void test6() {
		int n = 2;
		int k = 0;
		int x = 1;
		int y = 2;
		assertEquals("Possible", new GCDGraph().possible(n, k, x, y));
	}
}
