import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMinTreeGameTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] edges = new int[] {0};
		int[] costs = new int[] {4,6};
		assertEquals(6, new MaxMinTreeGame().findend(edges, costs));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] edges = new int[] {0,1};
		int[] costs = new int[] {4,6,5};
		assertEquals(5, new MaxMinTreeGame().findend(edges, costs));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] edges = new int[] {0,1,2,3};
		int[] costs = new int[] {0,1,0,1,0};
		assertEquals(0, new MaxMinTreeGame().findend(edges, costs));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] edges = new int[] {0,0,0};
		int[] costs = new int[] {5,1,2,3};
		assertEquals(3, new MaxMinTreeGame().findend(edges, costs));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] edges = new int[] {0,0};
		int[] costs = new int[] {3,2,5};
		assertEquals(5, new MaxMinTreeGame().findend(edges, costs));
	}
}
