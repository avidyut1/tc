import org.junit.Test;
import static org.junit.Assert.*;

public class WolfCardGameTest {
	
	@Test(timeout=2000)
	public void test0() {
		int N = 20;
		int K = 4;
		assertArrayEquals(new int[] {1, 2, 3, 4 }, new WolfCardGame().createAnswer(N, K));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int N = 40;
		int K = 1;
		assertArrayEquals(new int[] {39 }, new WolfCardGame().createAnswer(N, K));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int N = 97;
		int K = 6;
		assertArrayEquals(new int[] {7, 68, 9, 10, 62, 58 }, new WolfCardGame().createAnswer(N, K));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int N = 2;
		int K = 12;
		assertArrayEquals(new int[] {33, 69, 42, 45, 96, 15, 57, 12, 93, 9, 54, 99 }, new WolfCardGame().createAnswer(N, K));
	}
}
