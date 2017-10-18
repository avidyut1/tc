import org.junit.Test;
import static org.junit.Assert.*;

public class RememberWordsEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int d1 = 2;
		int d2 = 3;
		int w1 = 7;
		int w2 = 18;
		assertEquals("Possible", new RememberWordsEasy().isPossible(d1, d2, w1, w2));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int d1 = 1;
		int d2 = 1;
		int w1 = 3;
		int w2 = 5;
		assertEquals("Impossible", new RememberWordsEasy().isPossible(d1, d2, w1, w2));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int d1 = 3;
		int d2 = 5;
		int w1 = 300;
		int w2 = 500;
		assertEquals("Possible", new RememberWordsEasy().isPossible(d1, d2, w1, w2));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int d1 = 100;
		int d2 = 1;
		int w1 = 0;
		int w2 = 2;
		assertEquals("Impossible", new RememberWordsEasy().isPossible(d1, d2, w1, w2));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int d1 = 1000000;
		int d2 = 1000000;
		int w1 = 1000000;
		int w2 = 1000000;
		assertEquals("Possible", new RememberWordsEasy().isPossible(d1, d2, w1, w2));
	}
}
