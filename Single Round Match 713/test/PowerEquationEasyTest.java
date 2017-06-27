import org.junit.Test;
import static org.junit.Assert.*;

public class PowerEquationEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int n = 2;
		assertEquals(6, new PowerEquationEasy().count(n));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int n = 3;
		assertEquals(15, new PowerEquationEasy().count(n));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 100;
		assertEquals(21620, new PowerEquationEasy().count(n));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 22306;
		assertEquals(68467, new PowerEquationEasy().count(n));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int n = 1;
		assertEquals(1, new PowerEquationEasy().count(n));
	}
}
