import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearPlaysDiv2 {
	boolean dp[][] = new boolean[1501][1501];
	public String equalPiles(int A, int B, int C) {
		if ((A + B + C) % 3 != 0)
			return "impossible";
		solve(A, B, C);
		int eq = (A + B + C) / 3;
		if (dp[eq][eq]) {
			return "possible";
		}
		else
			return "impossible";
	}
	public void solve(int a, int b, int c) {
		int ar[] = new int[]{a, b, c};
		Arrays.sort(ar);
		//if not processed this state
		if (!dp[ar[0]][ar[1]]) {
            dp[ar[0]][ar[1]] = true;
			if (ar[0] < ar[1]) {
				solve(2 * ar[0], ar[1] - ar[0], ar[2]);
			}
			if (ar[0] < ar[2]) {
				solve(2 * ar[0], ar[1], ar[2] - ar[0]);
			}
			if (ar[1] < ar[2]) {
				solve(ar[0], 2 * ar[1], ar[2] - ar[1]);
			}
		}
	}
}
