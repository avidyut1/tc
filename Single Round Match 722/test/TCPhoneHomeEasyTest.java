import org.junit.Test;
import static org.junit.Assert.*;

public class TCPhoneHomeEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int digits = 7;
		String[] specialPrefixes = new String[] { "0", "1", "911" };
		assertEquals(7990000, new TCPhoneHomeEasy().validNumbers(digits, specialPrefixes));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int digits = 5;
		String[] specialPrefixes = new String[] { "0", "1", "911" };
		assertEquals(79900, new TCPhoneHomeEasy().validNumbers(digits, specialPrefixes));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int digits = 6;
		String[] specialPrefixes = new String[] { "1", "2", "3" };
		assertEquals(700000, new TCPhoneHomeEasy().validNumbers(digits, specialPrefixes));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int digits = 6;
		String[] specialPrefixes = new String[] { "1", "23", "345" };
		assertEquals(889000, new TCPhoneHomeEasy().validNumbers(digits, specialPrefixes));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int digits = 3;
		String[] specialPrefixes = new String[] {"411"};
		assertEquals(999, new TCPhoneHomeEasy().validNumbers(digits, specialPrefixes));
	}

	@Test(timeout=2000)
	public void test5() {
		int digits = 1;
		String[] specialPrefixes = new String[] {"0"};
		assertEquals(9, new TCPhoneHomeEasy().validNumbers(digits, specialPrefixes));
	}
}
