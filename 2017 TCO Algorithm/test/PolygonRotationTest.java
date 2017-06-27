import org.junit.Test;
import static org.junit.Assert.*;

public class PolygonRotationTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] x = new int[] {0, 1, 1, 0};
		int[] y = new int[] {1, 1, 0, 0};
		assertEquals(3.141592653589793, new PolygonRotation().getVolume(x, y), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] x = new int[] {0, 1, 0, -1};
		int[] y = new int[] {2, 1, 0, 1};
		assertEquals(2.0943951023931953, new PolygonRotation().getVolume(x, y), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] x = new int[] {0, 3, 0, -2, -2};
		int[] y = new int[] {2, 0, -3, -1, 1};
		assertEquals(49.91641660703782, new PolygonRotation().getVolume(x, y), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] x = new int[] {0, 3, 3, 0, -1, -1};
		int[] y = new int[] {2, 2, -2, -2, -1, 1};
		assertEquals(113.09733552923255, new PolygonRotation().getVolume(x, y), 1e-9);
	}
}
