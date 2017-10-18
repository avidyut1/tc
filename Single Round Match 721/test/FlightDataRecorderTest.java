import org.junit.Test;
import static org.junit.Assert.*;

public class FlightDataRecorderTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] heading = new int[] {90,0};
		int[] distance = new int[] {3,4};
		assertEquals(5.0, new FlightDataRecorder().getDistance(heading, distance), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] heading = new int[] {37,37,37,37};
		int[] distance = new int[] {1,10,100,1000};
		assertEquals(1111.0, new FlightDataRecorder().getDistance(heading, distance), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] heading = new int[] {0,120,240,0,120,240};
		int[] distance = new int[] {999,999,999,999,999,999};
		assertEquals(6.431098710768743E-13, new FlightDataRecorder().getDistance(heading, distance), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] heading = new int[] {76,321,214,132,0,359,74,65,213};
		int[] distance = new int[] {621,235,698,1,35,658,154,426,965};
		assertEquals(153.54881555325184, new FlightDataRecorder().getDistance(heading, distance), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] heading = new int[] {0};
		int[] distance = new int[] {1};
		assertEquals(1.0, new FlightDataRecorder().getDistance(heading, distance), 1e-9);
	}
}
