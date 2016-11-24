import org.junit.Test;
import static org.junit.Assert.*;

public class TopBiologistTest {
	
	@Test(timeout=2000)
	public void test0() {
		String sequence = "AGGTCTA";
		assertEquals("AC", new TopBiologist().findShortestNewSequence(sequence));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String sequence = "AGACGACGGAGAACGA";
		assertEquals("T", new TopBiologist().findShortestNewSequence(sequence));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String sequence = "A";
		assertEquals("C", new TopBiologist().findShortestNewSequence(sequence));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String sequence = "AAGATACACCGGCTTCGTG";
		assertEquals("CAT", new TopBiologist().findShortestNewSequence(sequence));
	}
}
