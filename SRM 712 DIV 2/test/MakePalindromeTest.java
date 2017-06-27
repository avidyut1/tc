import org.junit.Test;
import static org.junit.Assert.*;

public class MakePalindromeTest {
	
	@Test(timeout=2000)
	public void test0() {
		String card = "abbaa";
		assertArrayEquals(new String[] {"ababa" }, new MakePalindrome().constructMinimal(card));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String card = "abc";
		assertArrayEquals(new String[] {"a", "b", "c" }, new MakePalindrome().constructMinimal(card));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String card = "aaabbbccc";
		assertArrayEquals(new String[] {"aba", "bcb", "cac" }, new MakePalindrome().constructMinimal(card));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String card = "topcoder";
		assertArrayEquals(new String[] {"oco", "d", "e", "p", "r", "t" }, new MakePalindrome().constructMinimal(card));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String card = "z";
		assertArrayEquals(new String[] {"z" }, new MakePalindrome().constructMinimal(card));
	}
}
