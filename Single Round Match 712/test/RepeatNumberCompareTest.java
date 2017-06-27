import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatNumberCompareTest {
	
	@Test(timeout=2000)
	public void test0() {
		int x1 = 1234;
		int k1 = 3;
		int x2 = 70;
		int k2 = 4;
		assertEquals("Greater", new RepeatNumberCompare().compare(x1, k1, x2, k2));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int x1 = 1010;
		int k1 = 3;
		int x2 = 101010;
		int k2 = 2;
		assertEquals("Equal", new RepeatNumberCompare().compare(x1, k1, x2, k2));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int x1 = 1234;
		int k1 = 10;
		int x2 = 456;
		int k2 = 20;
		assertEquals("Less", new RepeatNumberCompare().compare(x1, k1, x2, k2));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int x1 = 5;
		int k1 = 9;
		int x2 = 555555555;
		int k2 = 1;
		assertEquals("Equal", new RepeatNumberCompare().compare(x1, k1, x2, k2));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int x1 = 5;
		int k1 = 9;
		int x2 = 555555554;
		int k2 = 1;
		assertEquals("Greater", new RepeatNumberCompare().compare(x1, k1, x2, k2));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int x1 = 5;
		int k1 = 9;
		int x2 = 555555556;
		int k2 = 1;
		assertEquals("Less", new RepeatNumberCompare().compare(x1, k1, x2, k2));
	}
	
	@Test(timeout=2000)
	public void test6() {
		int x1 = 1000000000;
		int k1 = 50;
		int x2 = 1000000000;
		int k2 = 50;
		assertEquals("Equal", new RepeatNumberCompare().compare(x1, k1, x2, k2));
	}
}
