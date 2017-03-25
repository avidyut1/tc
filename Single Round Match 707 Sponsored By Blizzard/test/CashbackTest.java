import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] limit = new int[] {1000,1000};
		int[] rate = new int[] {1,2};
		int[] amount = new int[] {58};
		assertEquals(1.16, new Cashback().findMax(limit, rate, amount), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] limit = new int[] {1,2};
		int[] rate = new int[] {1,2};
		int[] amount = new int[] {58};
		assertEquals(0.05, new Cashback().findMax(limit, rate, amount), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] limit = new int[] {100,100};
		int[] rate = new int[] {0,5,
 5,0};
		int[] amount = new int[] {10,10};
		assertEquals(1.0, new Cashback().findMax(limit, rate, amount), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] limit = new int[] {7,8,9};
		int[] rate = new int[] {2, 3, 1,
 5, 7, 10,
 7, 6, 8};
		int[] amount = new int[] {20, 30, 40};
		assertEquals(1.73, new Cashback().findMax(limit, rate, amount), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] limit = new int[] {12,34,56,78,910};
		int[] rate = new int[] {100, 100, 0, 0, 0,
 0, 100, 100, 0, 0,
 0, 0, 100, 100, 0,
 0, 0, 0, 100, 100,
 100, 0, 0, 0, 100};
		int[] amount = new int[] {111,111,111,111,111};
		assertEquals(402.0, new Cashback().findMax(limit, rate, amount), 1e-9);
	}
}
