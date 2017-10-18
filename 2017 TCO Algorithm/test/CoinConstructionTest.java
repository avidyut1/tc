import org.junit.Test;
import static org.junit.Assert.*;

public class CoinConstructionTest {
	
	@Test(timeout=2000)
	public void test0() {
		int k = 6;
		assertArrayEquals(new int[] {3, 4, 7 }, new CoinConstruction().construct(k));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int k = 26;
		assertArrayEquals(new int[] {1, 1, 10, 10, 100, 100 }, new CoinConstruction().construct(k));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int k = 7;
		assertArrayEquals(new int[] {1, 1, 1, 1, 1, 1, 1 }, new CoinConstruction().construct(k));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int k = 1;
		assertArrayEquals(new int[] {999999999 }, new CoinConstruction().construct(k));
	}
}
