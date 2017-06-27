import org.junit.Test;
import static org.junit.Assert.*;

public class MaximumRangeTest {
	
	@Test(timeout=2000)
	public void test0() {
		String s = "+++++++";
		assertEquals(7, new MaximumRange().findMax(s));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String s = "+--+--+";
		assertEquals(4, new MaximumRange().findMax(s));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String s = "++++--------";
		assertEquals(8, new MaximumRange().findMax(s));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String s = "-+-+-+-+-+-+";
		assertEquals(6, new MaximumRange().findMax(s));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String s = "+";
		assertEquals(1, new MaximumRange().findMax(s));
	}
}
