import org.junit.Test;
import static org.junit.Assert.*;

public class AverageVarianceSubsetTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] s = new int[] {1,2,3};
		int R = 1;
		assertEquals(0.1, new AverageVarianceSubset().average(s, R), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] s = new int[] {1,2,3};
		int R = 3;
		assertEquals(0.3095238095238096, new AverageVarianceSubset().average(s, R), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] s = new int[] {5,1,3,2};
		int R = 1000000000;
		assertEquals(1.2476851851851847, new AverageVarianceSubset().average(s, R), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] s = new int[] {1,11,111,1111,11111,111111,1111111,11111111,111111111};
		int R = 123456;
		assertEquals(1.1349430459217174E9, new AverageVarianceSubset().average(s, R), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] s = new int[] {1,11,111,1111,11111,111111,1111111,11111111,111111111};
		int R = 999999999;
		assertEquals(9.989198236452121E14, new AverageVarianceSubset().average(s, R), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] s = new int[] {1,1000000000};
		int R = 1000000000;
		assertEquals(8.3333333166666672E16, new AverageVarianceSubset().average(s, R), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test6() {
		int[] s = new int[] {1,1000000000};
		int R = 1;
		assertEquals(0.0, new AverageVarianceSubset().average(s, R), 1e-9);
	}
}
