import org.junit.Test;
import static org.junit.Assert.*;

public class ArrfixTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] A = new int[] {1,1,1};
		int[] B = new int[] {2,2,2};
		int[] F = new int[] {2};
		assertEquals(2, new Arrfix().mindiff(A, B, F));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] A = new int[] {1,1,1};
		int[] B = new int[] {2,2,1};
		int[] F = new int[] {2,2};
		assertEquals(0, new Arrfix().mindiff(A, B, F));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] A = new int[] {1,2,3};
		int[] B = new int[] {3,2,1};
		int[] F = new int[] {};
		assertEquals(2, new Arrfix().mindiff(A, B, F));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] A = new int[] {2,2,2};
		int[] B = new int[] {2,2,2};
		int[] F = new int[] {1,2,3};
		assertEquals(2, new Arrfix().mindiff(A, B, F));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] A = new int[] {1,3,3,3};
		int[] B = new int[] {2,3,3,3};
		int[] F = new int[] {2,2};
		assertEquals(1, new Arrfix().mindiff(A, B, F));
	}
}
