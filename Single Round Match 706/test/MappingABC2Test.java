import org.junit.Test;
import static org.junit.Assert.*;

public class MappingABC2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int[] t = new int[] {9,9,2,9,4};
		assertEquals(2, new MappingABC2().countStrings(t));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] t = new int[] {1,2,3};
		assertEquals(1, new MappingABC2().countStrings(t));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] t = new int[] {1,2,2,1,2,1,2};
		assertEquals(0, new MappingABC2().countStrings(t));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] t = new int[] {7,50,1,50,1,50,1,10,7};
		assertEquals(20, new MappingABC2().countStrings(t));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] t = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48};
		assertEquals(166952139, new MappingABC2().countStrings(t));
	}
}
