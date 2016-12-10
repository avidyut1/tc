import org.junit.Test;
import static org.junit.Assert.*;

public class PermutationCountsDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int N = 5;
		int[] pos = new int[] {3};
		assertEquals(9, new PermutationCountsDiv2().countPermutations(N, pos));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int N = 13;
		int[] pos = new int[] {12,11,10,9,8,7,6,5,4,3,2,1};
		assertEquals(1, new PermutationCountsDiv2().countPermutations(N, pos));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int N = 13;
		int[] pos = new int[] {};
		assertEquals(1, new PermutationCountsDiv2().countPermutations(N, pos));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int N = 9;
		int[] pos = new int[] {2,4,5};
		assertEquals(1421, new PermutationCountsDiv2().countPermutations(N, pos));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int N = 80;
		int[] pos = new int[] {31,41,59,26,53,58,9,79,32,3,8,46};
		assertEquals(82650786, new PermutationCountsDiv2().countPermutations(N, pos));
	}
}
