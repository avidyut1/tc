import org.junit.Test;
import static org.junit.Assert.*;

public class MiddleCodeTest {
	
	@Test(timeout=2000)
	public void test0() {
		String s = "word";
		assertEquals("ordw", new MiddleCode().encode(s));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String s = "aaaaa";
		assertEquals("aaaaa", new MiddleCode().encode(s));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String s = "abacaba";
		assertEquals("caabbaa", new MiddleCode().encode(s));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String s = "shjegr";
		assertEquals("ejghrs", new MiddleCode().encode(s));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String s = "adafaaaadafawafwfasdaa";
		assertEquals("afawadafawafaafsadadaa", new MiddleCode().encode(s));
	}
}
