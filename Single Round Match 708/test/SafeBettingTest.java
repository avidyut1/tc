import org.junit.Test;
import static org.junit.Assert.*;

public class SafeBettingTest {
	
	@Test(timeout=2000)
	public void test0() {
		int a = 15;
		int b = 20;
		int c = 48;
		assertEquals(3, new SafeBetting().minRounds(a, b, c));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int a = 10;
		int b = 400;
		int c = 560;
		assertEquals(1, new SafeBetting().minRounds(a, b, c));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int a = 5;
		int b = 7;
		int c = 21;
		assertEquals(3, new SafeBetting().minRounds(a, b, c));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int a = 5;
		int b = 7;
		int c = 22;
		assertEquals(4, new SafeBetting().minRounds(a, b, c));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int a = 17;
		int b = 30;
		int c = 1000;
		assertEquals(7, new SafeBetting().minRounds(a, b, c));
	}
}
