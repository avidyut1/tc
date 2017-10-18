import org.junit.Test;
import static org.junit.Assert.*;

public class FoldingPaper2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int W = 5;
		int H = 3;
		int A = 12;
		assertEquals(1, new FoldingPaper2().solve(W, H, A));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int W = 2;
		int H = 2;
		int A = 3;
		assertEquals(-1, new FoldingPaper2().solve(W, H, A));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int W = 4;
		int H = 4;
		int A = 1;
		assertEquals(4, new FoldingPaper2().solve(W, H, A));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int W = 127;
		int H = 129;
		int A = 72;
		assertEquals(8, new FoldingPaper2().solve(W, H, A));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int W = 1;
		int H = 100000;
		int A = 100000;
		assertEquals(0, new FoldingPaper2().solve(W, H, A));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int W = 1;
		int H = 1;
		int A = 2;
		assertEquals(-1, new FoldingPaper2().solve(W, H, A));
	}
}
