import org.junit.Test;
import static org.junit.Assert.*;

public class GerrymanderEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] A = new int[] {5,1,2,7};
		int[] B = new int[] {4,0,2,2};
		int K = 2;
		assertEquals(0.75, new GerrymanderEasy().getmax(A, B, K), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] A = new int[] {12,34,56,78,90};
		int[] B = new int[] {1,1,1,1,1};
		int K = 1;
		assertEquals(0.08333333333333333, new GerrymanderEasy().getmax(A, B, K), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] A = new int[] {10000,10000,10000,10000,10000,10000,10000,10000,10000,10000};
		int[] B = new int[] {3,1,4,1,5,9,2,6,5,3};
		int K = 5;
		assertEquals(5.4E-4, new GerrymanderEasy().getmax(A, B, K), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] A = new int[] {123,4,46,88,22,34,564,87,56,311,886};
		int[] B = new int[] {0,0,0,0,0,0,0,0,0,0,0};
		int K = 1;
		assertEquals(0.0, new GerrymanderEasy().getmax(A, B, K), 1e-9);
	}
}
