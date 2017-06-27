import org.junit.Test;
import static org.junit.Assert.*;

public class DFSCountEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] G = new String[] {"NYY",
 "YNY",
 "YYN"};
		assertEquals(6L, new DFSCountEasy().count(G));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] G = new String[] {"NYNN",
 "YNYN",
 "NYNY",
 "NNYN"};
		assertEquals(6L, new DFSCountEasy().count(G));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] G = new String[] {"NYYY",
 "YNYY",
 "YYNN",
 "YYNN"};
		assertEquals(16L, new DFSCountEasy().count(G));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] G = new String[] {"NYYYYYYYYYYYY",
 "YNYYYYYYYYYYY",
 "YYNYYYYYYYYYY",
 "YYYNYYYYYYYYY",
 "YYYYNYYYYYYYY",
 "YYYYYNYYYYYYY",
 "YYYYYYNYYYYYY",
 "YYYYYYYNYYYYY",
 "YYYYYYYYNYYYY",
 "YYYYYYYYYNYYY",
 "YYYYYYYYYYNYY",
 "YYYYYYYYYYYNY",
 "YYYYYYYYYYYYN"};
		assertEquals(6227020800L, new DFSCountEasy().count(G));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] G = new String[] {"N"};
		assertEquals(1L, new DFSCountEasy().count(G));
	}
}
