import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class RockPaperScissorsMagicEasy {
	
	public int count(int[] card, int score) {
		int n = card.length;
		if (score > n){
			return 0;
		}
		int MOD = (int)1e9 + 7;
		int c[][] = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			c[i][0] = 1;
			for (int j = 1; j <= i; j++) {
				c[i][j] = (c[i - 1][j - 1] + c[i - 1][j]) % MOD;
			}
		}
		int x = c[n][score];
		for (int i = 0; i < n - score; i++) {
			x = (2 * x) % MOD;
		}
		return x;
	}
}
