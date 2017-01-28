import org.junit.Test;
import static org.junit.Assert.*;

public class ThreeIncreasingTest {
	
	@Test(timeout=2000)
	public void test0() {
		int a = 15;
		int b = 40;
		int c = 22;
		assertEquals(19, new ThreeIncreasing().minEaten(a, b, c));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int a = 5;
		int b = 6;
		int c = 6;
		assertEquals(2, new ThreeIncreasing().minEaten(a, b, c));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int a = 6;
		int b = 1;
		int c = 3000;
		assertEquals(-1, new ThreeIncreasing().minEaten(a, b, c));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int a = 6;
		int b = 4;
		int c = 2;
		assertEquals(-1, new ThreeIncreasing().minEaten(a, b, c));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int a = 4;
		int b = 2;
		int c = 6;
		assertEquals(3, new ThreeIncreasing().minEaten(a, b, c));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int a = 1;
		int b = 1234;
		int c = 3000;
		assertEquals(0, new ThreeIncreasing().minEaten(a, b, c));
	}
	
	@Test(timeout=2000)
	public void test6() {
		int a = 2789;
		int b = 2400;
		int c = 1693;
		assertEquals(1806, new ThreeIncreasing().minEaten(a, b, c));
	}
}
