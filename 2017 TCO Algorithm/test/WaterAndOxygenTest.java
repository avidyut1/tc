import org.junit.Test;
import static org.junit.Assert.*;

public class WaterAndOxygenTest {
	
	@Test(timeout=2000)
	public void test0() {
		int remainH20 = 64;
		int remainO2 = 70;
		int costH2O = 3;
		int costO2 = 7;
		assertEquals(12.0, new WaterAndOxygen().maxDays(remainH20, remainO2, costH2O, costO2), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int remainH20 = 99;
		int remainO2 = 102;
		int costH2O = 1;
		int costO2 = 1;
		assertEquals(99.0, new WaterAndOxygen().maxDays(remainH20, remainO2, costH2O, costO2), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int remainH20 = 101;
		int remainO2 = 99;
		int costH2O = 1;
		int costO2 = 1;
		assertEquals(99.66666666666667, new WaterAndOxygen().maxDays(remainH20, remainO2, costH2O, costO2), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		int remainH20 = 123456789;
		int remainO2 = 987654321;
		int costH2O = 123;
		int costO2 = 456;
		assertEquals(1003713.731707317, new WaterAndOxygen().maxDays(remainH20, remainO2, costH2O, costO2), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test4() {
		int remainH20 = 987654321;
		int remainO2 = 123456789;
		int costH2O = 456;
		int costO2 = 123;
		assertEquals(1758643.7307692308, new WaterAndOxygen().maxDays(remainH20, remainO2, costH2O, costO2), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test5() {
		int remainH20 = 0;
		int remainO2 = 0;
		int costH2O = 13;
		int costO2 = 27;
		assertEquals(0.0, new WaterAndOxygen().maxDays(remainH20, remainO2, costH2O, costO2), 1e-9);
	}
}
