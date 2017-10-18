import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class MutaliskEasy {
	int ans = Integer.MAX_VALUE;
	int dp[][][] = new int[100][100][100];
	public int minimalAttacks(int[] x) {
		int ar[] = new int[3];
		for (int i = 0; i < x.length; i++) {
			ar[i] = x[i];
		}
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				Arrays.fill(dp[i][j], Integer.MAX_VALUE);
			}
		}
		go(x[0] - 9, x[1] - 3, x[2] - 1, 1);
		go(x[0] - 9, x[2] - 3, x[1] - 1, 1);
		go(x[1] - 9, x[0] - 3, x[2] - 1, 1);
		go(x[1] - 9, x[2] - 3, x[0] - 1, 1);
		go(x[2] - 9, x[0] - 3, x[1] - 1, 1);
		go(x[2] - 9, x[1] - 3, x[0] - 1, 1);
		return ans;
	}
	public int go(int a, int b, int c, int count){
		if (a <= 0 && b <= 0 && c <= 0) {
			ans = Math.min(ans, count);
			return ans;
		}
		if (dp[a][b][c] != Integer.MAX_VALUE) {
			return dp[a][b][c];
		}
		int s1 = go(a - 9, b - 3, c - 1, count + 1);
		int s2 = go(a - 9, c - 3, b - 1, count + 1);
		int s3 = go(b - 9, a - 3, c - 1, count + 1);
		int s4 = go(b - 9, c - 3, a - 1, count + 1);
		int s5 = go(c - 9, a - 3, b - 1, count + 1);
		int s6 = go(c - 9, b - 3, a - 1, count + 1);
		dp[a][b][c] = Math.min(s1, s2);
		dp[a][b][c] = Math.min(dp[a][b][c], s3);
		dp[a][b][c] = Math.min(dp[a][b][c], s4);
		dp[a][b][c] = Math.min(dp[a][b][c], s5);
		dp[a][b][c] = Math.min(dp[a][b][c], s6);
		return dp[a][b][c];
	}
}
