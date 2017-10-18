import org.junit.Test;
import static org.junit.Assert.*;

public class ClassicTowersTest {
	
	@Test(timeout=2000)
	public void test0() {
		long k = 4L;
		int[] count = new int[] {1,1,2}
;
		assertEquals("CCAB", new ClassicTowers().findTowers(k, count));
	}
	
	@Test(timeout=2000)
	public void test1() {
		long k = 0L;
		int[] count = new int[] {0, 0, 50}
;
		assertEquals("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", new ClassicTowers().findTowers(k, count));
	}
	
	@Test(timeout=2000)
	public void test2() {
		long k = 0L;
		int[] count = new int[] {10,20,20};
		assertEquals("", new ClassicTowers().findTowers(k, count));
	}
	
	@Test(timeout=2000)
	public void test3() {
		long k = 123456123456123L;
		int[] count = new int[] {10,10,30}
;
		assertEquals("CCACCCACCABACCABBACCCBBCCBCCCBACCCCABBACCCCCACBCCC", new ClassicTowers().findTowers(k, count));
	}
	
	@Test(timeout=2000)
	public void test4() {
		long k = 314159265358979L;
		int[] count = new int[] {15,16,17};
		assertEquals("", new ClassicTowers().findTowers(k, count));
	}
}
