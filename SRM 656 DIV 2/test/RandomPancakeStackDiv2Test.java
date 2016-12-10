import org.junit.Test;
import static org.junit.Assert.*;

public class RandomPancakeStackDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int[] d = new int[] {1,1,1};
		assertEquals(1.6666666666666667, new RandomPancakeStackDiv2().expectedDeliciousness(d), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] d = new int[] {10,20};
		assertEquals(20.0, new RandomPancakeStackDiv2().expectedDeliciousness(d), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] d = new int[] {3,6,10,9,2};
		assertEquals(9.891666666666667, new RandomPancakeStackDiv2().expectedDeliciousness(d), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] d = new int[] {10,9,8,7,6,5,4,3,2,1};
		assertEquals(10.999999724426809, new RandomPancakeStackDiv2().expectedDeliciousness(d), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] d = new int[] {1,2,3,4,5,6,7,8,9,10};
		assertEquals(7.901100088183421, new RandomPancakeStackDiv2().expectedDeliciousness(d), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] d = new int[] {1,1,1,1,1,1,1,1,1,1};
		assertEquals(1.7182818011463845, new RandomPancakeStackDiv2().expectedDeliciousness(d), 1e-9);
	}
}
