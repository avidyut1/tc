import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseMancalaTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] start = new int[] {6, 3, 4, 0};
		int[] target = new int[] {1, 5, 6, 1};
		assertArrayEquals(new int[] {0 }, new ReverseMancala().findMoves(start, target));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] start = new int[] {1, 5, 6, 1};
		int[] target = new int[] {6, 3, 4, 0};
		assertArrayEquals(new int[] {6 }, new ReverseMancala().findMoves(start, target));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] start = new int[] {10, 0, 1, 2, 3};
		int[] target = new int[] {10, 0, 0, 2, 4};
		assertArrayEquals(new int[] {2, 4, 8 }, new ReverseMancala().findMoves(start, target));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] start = new int[] {2, 0, 1, 7};
		int[] target = new int[] {0, 2, 1, 7};
		assertArrayEquals(new int[] {2, 0, 1, 7 }, new ReverseMancala().findMoves(start, target));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] start = new int[] {3, 2, 4, 5};
		int[] target = new int[] {0, 1, 6, 7};
		assertArrayEquals(new int[] {7, 1, 0, 7, 1, 0 }, new ReverseMancala().findMoves(start, target));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] start = new int[] {2, 1, 6, 4, 5, 2, 4, 5, 3, 0};
		int[] target = new int[] {6, 4, 8, 0, 2, 6, 0, 1, 3, 2};
		assertArrayEquals(new int[] {10, 8, 2, 16, 19, 2, 4, 11, 7, 6, 12, 19, 14, 14, 15, 3, 4, 17, 11, 3, 9, 16, 4, 8, 13, 12, 11, 9, 17, 12, 19, 4, 9, 8, 10, 2, 0, 17, 10, 3, 4, 8, 16, 0, 19, 15, 7, 6, 17, 6 }, new ReverseMancala().findMoves(start, target));
	}
	
	@Test(timeout=2000)
	public void test6() {
		int[] start = new int[] {3, 4, 6, 7, 2, 2, 3, 9, 4, 6};
		int[] target = new int[] {6, 0, 5, 10, 10, 3, 1, 2, 8, 1};
		assertArrayEquals(new int[] {8, 14, 1, 12, 11, 4, 9, 10, 15, 16, 2, 19, 2, 16, 17, 11, 16, 0, 12, 7, 4, 5, 17, 14, 0, 5, 13, 3, 7, 10, 12, 1, 16, 14, 1, 9, 1, 8, 7, 5, 5, 11, 19, 16, 18, 1, 15, 10, 16, 1 }, new ReverseMancala().findMoves(start, target));
	}
}
