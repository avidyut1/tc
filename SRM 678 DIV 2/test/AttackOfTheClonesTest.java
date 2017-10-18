import org.junit.Test;
import static org.junit.Assert.*;

public class AttackOfTheClonesTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] firstWeek = new int[] {1,2,3,4};
		int[] lastWeek = new int[] {4,3,2,1};
		assertEquals(4, new AttackOfTheClones().count(firstWeek, lastWeek));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] firstWeek = new int[] {1,2,3,4};
		int[] lastWeek = new int[] {1,2,3,4};
		assertEquals(1, new AttackOfTheClones().count(firstWeek, lastWeek));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] firstWeek = new int[] {8,4,5,1,7,6,2,3};
		int[] lastWeek = new int[] {2,4,6,8,1,3,5,7};
		assertEquals(7, new AttackOfTheClones().count(firstWeek, lastWeek));
	}
}
