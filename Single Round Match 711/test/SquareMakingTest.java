import org.junit.Test;
import static org.junit.Assert.*;

public class SquareMakingTest {
	
	@Test(timeout=2000)
	public void test0() {
		int a = 5;
		int b = 6;
		int c = 5;
		int d = 5;
		assertEquals(1, new SquareMaking().getMinimalPrice(a, b, c, d));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int a = 4;
		int b = 1;
		int c = 5;
		int d = 4;
		assertEquals(4, new SquareMaking().getMinimalPrice(a, b, c, d));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int a = 2017;
		int b = 2017;
		int c = 2017;
		int d = 2017;
		assertEquals(0, new SquareMaking().getMinimalPrice(a, b, c, d));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int a = 705451;
		int b = 751563;
		int c = 608515;
		int d = 994713;
		assertEquals(432310, new SquareMaking().getMinimalPrice(a, b, c, d));
	}
}
