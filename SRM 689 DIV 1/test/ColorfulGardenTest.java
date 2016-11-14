import org.junit.Test;
import static org.junit.Assert.*;

public class ColorfulGardenTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] garden = new String[] {"aa",
 "bb"};
		assertArrayEquals(new String[] {"ba", "ab" }, new ColorfulGarden().rearrange(garden));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] garden = new String[] {"xxxx",
 "xxxx"};
		assertArrayEquals(new String[] { }, new ColorfulGarden().rearrange(garden));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] garden = new String[] {"abcd",
 "abcd"};
		assertArrayEquals(new String[] {"abcd", "dcba" }, new ColorfulGarden().rearrange(garden));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] garden = new String[] {"abcdefghijklm",
 "nopqrstuvwxyz"};
		assertArrayEquals(new String[] {"abcdefghijklm", "nopqrstuvwxyz" }, new ColorfulGarden().rearrange(garden));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] garden = new String[] {"aaa",
 "aab"};
		assertArrayEquals(new String[] { }, new ColorfulGarden().rearrange(garden));
	}
}
