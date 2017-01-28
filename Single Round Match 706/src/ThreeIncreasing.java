import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ThreeIncreasing {
	
	public int minEaten(int a, int b, int c) {
		if (b == 1 || c == 1) {
			return -1;
		}
		int ans = 0;
		if (b >= c) {
			int bnew = c - 1;
			ans += (b - bnew);
			b = bnew;
		}
		if (a >= b) {
			int anew = b - 1;
			ans += (a - anew);
			a = anew;
		}
		if (a < b && b < c && b != 1 && c != 1 && a > 0) {
			return ans;
		}
		return -1;
	}
}
