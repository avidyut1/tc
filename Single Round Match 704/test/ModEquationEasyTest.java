import org.junit.Test;
import static org.junit.Assert.*;

public class ModEquationEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int n = 2;
		int K = 4;
		int v = 1;
		assertEquals(2, new ModEquationEasy().count(n, K, v));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int n = 2;
		int K = 4;
		int v = 0;
		assertEquals(8, new ModEquationEasy().count(n, K, v));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 2;
		int K = 4;
		int v = 2;
		assertEquals(4, new ModEquationEasy().count(n, K, v));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 3;
		int K = 7;
		int v = 5;
		assertEquals(36, new ModEquationEasy().count(n, K, v));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int n = 10;
		int K = 100;
		int v = 50;
		assertEquals(683036071, new ModEquationEasy().count(n, K, v));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int n = 1;
		int K = 2;
		int v = 0;
		assertEquals(1, new ModEquationEasy().count(n, K, v));
	}
}
