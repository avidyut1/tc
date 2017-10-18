import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ChristmasTreeDecorationDiv2 {
	
	public int solve(int[] col, int[] x, int[] y) {
		int ans = 0;
		for (int i = 0; i < x.length; i++) {
			if (col[x[i] - 1] != col[y[i] - 1]) {
				ans++;
			}
		}
		return ans;
	}
}
