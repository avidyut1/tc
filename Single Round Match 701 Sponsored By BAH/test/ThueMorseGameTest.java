import org.junit.Test;
import static org.junit.Assert.*;

public class ThueMorseGameTest {
	
	@Test(timeout=2000)
	public void test0() {
		int n = 3;
		int m = 3;
		assertEquals("Alice", new ThueMorseGame().get(n, m));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int n = 3;
		int m = 2;
		assertEquals("Bob", new ThueMorseGame().get(n, m));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 387;
		int m = 22;
		assertEquals("Alice", new ThueMorseGame().get(n, m));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 499999999;
		int m = 50;
		assertEquals("Alice", new ThueMorseGame().get(n, m));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int n = 499999975;
		int m = 49;
		assertEquals("Bob", new ThueMorseGame().get(n, m));
	}
}
