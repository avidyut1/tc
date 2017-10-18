import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromicSubstringsDiv1Test {
	
	@Test(timeout=2000)
	public void test0() {
		String[] S1 = new String[] {"a","a",""};
		String[] S2 = new String[] {"a"};
		assertEquals(6.0, new PalindromicSubstringsDiv1().expectedPalindromes(S1, S2), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] S1 = new String[] {"z??"};
		String[] S2 = new String[] {};
		assertEquals(3.115384615384615, new PalindromicSubstringsDiv1().expectedPalindromes(S1, S2), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] S1 = new String[] {"ab","c"};
		String[] S2 = new String[] {"??","a?"};
		assertEquals(7.315088757396449, new PalindromicSubstringsDiv1().expectedPalindromes(S1, S2), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] S1 = new String[] {};
		String[] S2 = new String[] {"?"};
		assertEquals(1.0, new PalindromicSubstringsDiv1().expectedPalindromes(S1, S2), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] S1 = new String[] {"ab?def","?"};
		String[] S2 = new String[] {"f??a"};
		assertEquals(12.545971779699588, new PalindromicSubstringsDiv1().expectedPalindromes(S1, S2), 1e-9);
	}
}
