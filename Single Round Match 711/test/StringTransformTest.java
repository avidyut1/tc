import org.junit.Test;
import static org.junit.Assert.*;

public class StringTransformTest {
	
	@Test(timeout=2000)
	public void test0() {
		String s = "abc";
		String t = "aba";
		assertEquals("Possible", new StringTransform().isPossible(s, t));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String s = "abc";
		String t = "bbc";
		assertEquals("Impossible", new StringTransform().isPossible(s, t));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String s = "topcoder";
		String t = "topcoder";
		assertEquals("Possible", new StringTransform().isPossible(s, t));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String s = "rdmcxnnbbe";
		String t = "rdrrxrnxbe";
		assertEquals("Possible", new StringTransform().isPossible(s, t));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String s = "rdmcxnnbbe";
		String t = "rdqrxrnxbe";
		assertEquals("Impossible", new StringTransform().isPossible(s, t));
	}

	@Test(timeout=2000)
	public void test5() {
		String s = "efee";
		String t = "eeef";
		assertEquals("Possible", new StringTransform().isPossible(s, t));
	}
}
