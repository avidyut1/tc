import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RepeatNumberCompare {
	
	public String compare(int x1, int k1, int x2, int k2) {
		String xs1 = Integer.toString(x1);
		for (int i = 1; i < k1; i++) {
			xs1 += Integer.toString(x1);
		}
		String xs2 = Integer.toString(x2);
		for (int i = 1; i < k2; i++) {
			xs2 += Integer.toString(x2);
		}
		BigInteger f = new BigInteger(xs1);
		BigInteger s = new BigInteger(xs2);
        if (f.compareTo(s) < 0) {
			return "Less";
		}
		else if (f.compareTo(s) > 0) {
			return "Greater";
		}
		return "Equal";
	}
}
