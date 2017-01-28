import org.junit.Test;
import static org.junit.Assert.*;

public class AlphabetOrderDiv1Test {
	
	@Test(timeout=2000)
	public void test0() {
		String[] words = new String[] {"single","round","match"};
		assertEquals("Possible", new AlphabetOrderDiv1().isOrdered(words));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] words = new String[] {"topcoder","topcoder"};
		assertEquals("Impossible", new AlphabetOrderDiv1().isOrdered(words));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] words = new String[] {"algorithm", "contest"};
		assertEquals("Impossible", new AlphabetOrderDiv1().isOrdered(words));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] words = new String[] {"pink","floyd"};
		assertEquals("Possible", new AlphabetOrderDiv1().isOrdered(words));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] words = new String[] {"gimnasia","y","esgrima","la","plata"};
		assertEquals("Impossible", new AlphabetOrderDiv1().isOrdered(words));
	}
}
