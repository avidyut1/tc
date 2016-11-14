import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatStringTest {
	
	@Test(timeout=2000)
	public void test0() {
		String s = "aba";
		assertEquals(1, new RepeatString().minimalModify(s));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String s = "adam";
		assertEquals(1, new RepeatString().minimalModify(s));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String s = "x";
		assertEquals(1, new RepeatString().minimalModify(s));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String s = "aaabbbaaaccc";
		assertEquals(3, new RepeatString().minimalModify(s));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String s = "repeatstring";
		assertEquals(6, new RepeatString().minimalModify(s));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String s = "aaaaaaaaaaaaaaaaaaaa";
		assertEquals(0, new RepeatString().minimalModify(s));
	}
}
