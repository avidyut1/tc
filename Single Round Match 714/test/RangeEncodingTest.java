import org.junit.Test;
import static org.junit.Assert.*;

public class RangeEncodingTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10}	;
		assertEquals(1, new RangeEncoding().minRanges(arr));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] arr = new int[] {1,6,10,20,21,49};
		assertEquals(5, new RangeEncoding().minRanges(arr));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] arr = new int[] {2,4,5,6,8,9,10,11,12,15};
		assertEquals(4, new RangeEncoding().minRanges(arr));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] arr = new int[] {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
		assertEquals(14, new RangeEncoding().minRanges(arr));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] arr = new int[] {10,11,12,13,14,15,20,21,22,23,25,27,28,29,30,31,32,33};
		assertEquals(4, new RangeEncoding().minRanges(arr));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] arr = new int[] {33, 35};
		assertEquals(2, new RangeEncoding().minRanges(arr));
	}
}
