import org.junit.Test;
import static org.junit.Assert.*;

public class SellingFruitsTest {
	
	@Test(timeout=1000)
	public void test0() {
		int x = 3;
		int f = 5;
		int d = 100;
		int p = 10;
		assertEquals(11, new SellingFruits().maxDays(x, f, d, p));
	}
	
	@Test(timeout=1000)
	public void test1() {
		int x = 2;
		int f = 17;
		int d = 20;
		int p = 1;
		assertEquals(10, new SellingFruits().maxDays(x, f, d, p));
	}
	
	@Test(timeout=1000)
	public void test2() {
		int x = 1;
		int f = 97;
		int d = 98;
		int p = 1;
		assertEquals(97, new SellingFruits().maxDays(x, f, d, p));
	}
	
	@Test(timeout=1000)
	public void test3() {
		int x = 16;
		int f = 4;
		int d = 8;
		int p = 2;
		assertEquals(0, new SellingFruits().maxDays(x, f, d, p));
	}
	
	@Test(timeout=1000)
	public void test4() {
		int x = 17;
		int f = 1;
		int d = 2000000000;
		int p = 4;
		assertEquals(95238095, new SellingFruits().maxDays(x, f, d, p));
	}
	
	@Test(timeout=1000)
	public void test5() {
		int x = 1;
		int f = 1996245611;
		int d = 1999990159;
		int p = 123;
		assertEquals(1996275808, new SellingFruits().maxDays(x, f, d, p));
	}
	
	@Test(timeout=1000)
	public void test6() {
		int x = 15000000;
		int f = 100;
		int d = 2000000000;
		int p = 1;
		assertEquals(133, new SellingFruits().maxDays(x, f, d, p));
	}
	
	@Test(timeout=1000)
	public void test7() {
		int x = 1;
		int f = 1000000000;
		int d = 2000000000;
		int p = 1000000000;
		assertEquals(1000000000, new SellingFruits().maxDays(x, f, d, p));
	}
}
