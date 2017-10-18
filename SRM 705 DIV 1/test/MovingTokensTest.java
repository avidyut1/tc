import org.junit.Test;
import static org.junit.Assert.*;

public class MovingTokensTest {
	
	@Test(timeout=2000)
	public void test0() {
		int n = 2;
		int m = 2;
		int[] moves = new int[] {0,1,
0,1};
		assertEquals(2, new MovingTokens().move(n, m, moves));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int n = 2;
		int m = 2;
		int[] moves = new int[] {0,0,
1,1};
		assertEquals(1, new MovingTokens().move(n, m, moves));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 3;
		int m = 1;
		int[] moves = new int[] {0,1,1};
		assertEquals(2, new MovingTokens().move(n, m, moves));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 2;
		int m = 5;
		int[] moves = new int[] {0,0,
 0,0,
 0,0,
 1,1,
 1,1};
		assertEquals(1, new MovingTokens().move(n, m, moves));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int n = 3;
		int m = 2;
		int[] moves = new int[] {0,2,2,
 1,1,0};
		assertEquals(1, new MovingTokens().move(n, m, moves));
	}
}
