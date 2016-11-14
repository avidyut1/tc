import org.junit.Test;
import static org.junit.Assert.*;

public class FindingFriendTest {
	
	@Test(timeout=2000)
	public void test0() {
		int roomSize = 2;
		int[] leaders = new int[] {5,1,2};
		int friendPlace = 4;
		assertEquals(2, new FindingFriend().find(roomSize, leaders, friendPlace));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int roomSize = 5;
		int[] leaders = new int[] {1,2,3,4,5};
		int friendPlace = 4;
		assertEquals(1, new FindingFriend().find(roomSize, leaders, friendPlace));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int roomSize = 6;
		int[] leaders = new int[] {10,5,1,4,2,20};
		int friendPlace = 9;
		assertEquals(4, new FindingFriend().find(roomSize, leaders, friendPlace));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int roomSize = 1000000000;
		int[] leaders = new int[] {1};
		int friendPlace = 700700700;
		assertEquals(1, new FindingFriend().find(roomSize, leaders, friendPlace));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int roomSize = 2;
		int[] leaders = new int[] {3,6,8,1,2};
		int friendPlace = 10;
		assertEquals(5, new FindingFriend().find(roomSize, leaders, friendPlace));
	}
}
