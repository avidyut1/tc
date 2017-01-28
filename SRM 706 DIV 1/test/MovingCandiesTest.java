import org.junit.Test;
import static org.junit.Assert.*;

public class MovingCandiesTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] t = new String[] {
"#...###",
"#...#.#",
"##..#.#",
".#....#"
};
		assertEquals(3, new MovingCandies().minMoved(t));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] t = new String[] {
"#...###",
"#...#.#",
"##..###",
".#....#"
};
		assertEquals(2, new MovingCandies().minMoved(t));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] t = new String[] {
".#..",
"##..",
"..#.",
"..#.",
"..##",
"..##"
};
		assertEquals(2, new MovingCandies().minMoved(t));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] t = new String[] {
".....",
".###.",
"####.",
"....."
};
		assertEquals(-1, new MovingCandies().minMoved(t));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] t = new String[] {
".#...#.###.#",
"#.#.##......",
".#.#......#.",
"..#.......#.",
"##.........."
};
		assertEquals(9, new MovingCandies().minMoved(t));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String[] t = new String[] {
"###.#########..#####",
".#######.###########"
};
		assertEquals(0, new MovingCandies().minMoved(t));
	}
	
	@Test(timeout=2000)
	public void test6() {
		String[] t = new String[] {
"..",
".."
};
		assertEquals(-1, new MovingCandies().minMoved(t));
	}
}
