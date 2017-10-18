import org.junit.Test;
import static org.junit.Assert.*;

public class PeacefulLineTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] x = new int[] {1,2,3,4};
		assertEquals("possible", new PeacefulLine().makeLine(x));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] x = new int[] {1,1,1,2};
		assertEquals("impossible", new PeacefulLine().makeLine(x));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] x = new int[] {1,1,2,2,3,3,4,4};
		assertEquals("possible", new PeacefulLine().makeLine(x));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] x = new int[] {3,3,3,3,13,13,13,13};
		assertEquals("possible", new PeacefulLine().makeLine(x));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] x = new int[] {3,7,7,7,3,7,7,7,3};
		assertEquals("impossible", new PeacefulLine().makeLine(x));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] x = new int[] {25,12,3,25,25,12,12,12,12,3,25};
		assertEquals("possible", new PeacefulLine().makeLine(x));
	}
	
	@Test(timeout=2000)
	public void test6() {
		int[] x = new int[] {3,3,3,3,13,13,13,13,3};
		assertEquals("possible", new PeacefulLine().makeLine(x));
	}
}
