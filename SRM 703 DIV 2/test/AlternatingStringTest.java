import org.junit.Test;
import static org.junit.Assert.*;

public class AlternatingStringTest {
	
	@Test(timeout=2000)
	public void test0() {
		String s = "111101111";
		assertEquals(3, new AlternatingString().maxLength(s));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String s = "1010101";
		assertEquals(7, new AlternatingString().maxLength(s));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String s = "000011110000";
		assertEquals(2, new AlternatingString().maxLength(s));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String s = "1011011110101010010101";
		assertEquals(8, new AlternatingString().maxLength(s));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String s = "0";
		assertEquals(1, new AlternatingString().maxLength(s));
	}
}
