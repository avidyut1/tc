import org.junit.Test;
import static org.junit.Assert.*;

public class MulticoreProcessingEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int jobLength = 2000;
		int corePenalty = 5;
		int[] speed = new int[] {40,20};
		int[] cores = new int[] {2,4};
		assertEquals(30, new MulticoreProcessingEasy().fastestTime(jobLength, corePenalty, speed, cores));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int jobLength = 2000;
		int corePenalty = 5;
		int[] speed = new int[] {10,20};
		int[] cores = new int[] {2,4};
		assertEquals(40, new MulticoreProcessingEasy().fastestTime(jobLength, corePenalty, speed, cores));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int jobLength = 1000;
		int corePenalty = 0;
		int[] speed = new int[] {10};
		int[] cores = new int[] {3};
		assertEquals(34, new MulticoreProcessingEasy().fastestTime(jobLength, corePenalty, speed, cores));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int jobLength = 10000;
		int corePenalty = 5;
		int[] speed = new int[] {39,37,44};
		int[] cores = new int[] {8,16,6};
		assertEquals(63, new MulticoreProcessingEasy().fastestTime(jobLength, corePenalty, speed, cores));
	}
}
