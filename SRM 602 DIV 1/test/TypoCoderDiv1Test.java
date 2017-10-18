import org.junit.Test;
import static org.junit.Assert.*;

public class TypoCoderDiv1Test {
	
	@Test(timeout=2000)
	public void test0() {
		int[] D = new int[] {100,200,100,1,1};
		int X = 2000;
		assertEquals(3, new TypoCoderDiv1().getmax(D, X));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] D = new int[] {0,0,0,0,0};
		int X = 2199;
		assertEquals(0, new TypoCoderDiv1().getmax(D, X));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] D = new int[] {90000,80000,70000,60000,50000,40000,30000,20000,10000};
		int X = 0;
		assertEquals(1, new TypoCoderDiv1().getmax(D, X));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] D = new int[] {1000000000,1000000000,10000,100000,2202,1};
		int X = 1000;
		assertEquals(4, new TypoCoderDiv1().getmax(D, X));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] D = new int[] {2048,1024,5012,256,128,64,32,16,8,4,2,1,0};
		int X = 2199;
		assertEquals(0, new TypoCoderDiv1().getmax(D, X));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] D = new int[] {61,666,512,229,618,419,757,217,458,883,23,932,547,679,565,767,513,798,870,31,379,294,929,892,173,127,796,353,913,115,802,803,948,592,959,127,501,319,140,694,851,189,924,590,790,3,669,541,342,272};
		int X = 1223;
		assertEquals(29, new TypoCoderDiv1().getmax(D, X));
	}
	
	@Test(timeout=2000)
	public void test6() {
		int[] D = new int[] {34,64,43,14,58,30,2,16,90,58,35,55,46,24,14,73,96,13,9,42,64,36,89,42,42,64,52,68,53,76,52,54,23,88,32,52,28,96,70,32,26,3,23,78,47,23,54,30,86,32};
		int X = 1328;
		assertEquals(20, new TypoCoderDiv1().getmax(D, X));
	}
}
