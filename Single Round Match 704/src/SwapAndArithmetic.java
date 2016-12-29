import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SwapAndArithmetic {
	
	public String able(int[] x) {
		Arrays.sort(x);
		int d = x[1] - x[0];
		int n = x.length;
		for (int i = 1; i < n; i++) {
			if (x[i] - x[i - 1] != d) {
				return "Impossible";
			}
		}
		return "Possible";
	}
}
