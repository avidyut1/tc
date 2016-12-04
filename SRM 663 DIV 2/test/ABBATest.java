import org.junit.Test;
import static org.junit.Assert.*;

public class ABBATest {
	
	@Test(timeout=2000)
	public void test0() {
		String initial = "B";
		String target = "ABBA";
		assertEquals("Possible", new ABBA().canObtain(initial, target));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String initial = "AB";
		String target = "ABB";
		assertEquals("Impossible", new ABBA().canObtain(initial, target));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String initial = "BBAB";
		String target = "ABABABABB";
		assertEquals("Impossible", new ABBA().canObtain(initial, target));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String initial = "BBBBABABBBBBBA";
		String target = "BBBBABABBABBBBBBABABBBBBBBBABAABBBAA";
		assertEquals("Possible", new ABBA().canObtain(initial, target));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String initial = "A";
		String target = "BB";
		assertEquals("Impossible", new ABBA().canObtain(initial, target));
	}
}
