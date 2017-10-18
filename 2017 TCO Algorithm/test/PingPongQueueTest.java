import org.junit.Test;
import static org.junit.Assert.*;

public class PingPongQueueTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] skills = new int[] {1, 2, 3};
		int N = 2;
		int K = 2;
		assertArrayEquals(new int[] {2, 3 }, new PingPongQueue().whoPlaysNext(skills, N, K));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] skills = new int[] {1, 2, 3};
		int N = 2;
		int K = 4;
		assertArrayEquals(new int[] {1, 2 }, new PingPongQueue().whoPlaysNext(skills, N, K));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] skills = new int[] {49, 24, 26, 12, 5, 33, 25, 30, 35, 41, 46, 23, 21, 3, 38, 43, 11, 19, 34, 29, 20, 32, 39, 7, 50};
		int N = 10;
		int K = 399;
		assertArrayEquals(new int[] {12, 50 }, new PingPongQueue().whoPlaysNext(skills, N, K));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] skills = new int[] {30, 12};
		int N = 34;
		int K = 80;
		assertArrayEquals(new int[] {12, 30 }, new PingPongQueue().whoPlaysNext(skills, N, K));
	}
}
