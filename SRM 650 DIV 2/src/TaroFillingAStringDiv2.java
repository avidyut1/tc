import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TaroFillingAStringDiv2 {
	
	public int getNumber(String S) {
		char car[] = S.toCharArray();
		int n = car.length;
		final int inf = (int)1e5;
		int dp[][] = new int[n][2];
		dp[0][0] = 0;
		dp[0][1] = 0;
        if (car[0] == 'A') {
			dp[0][1] = inf;
		}
		if (car[0] == 'B') {
			dp[0][0] = inf;
		}
		for (int i = 1; i < n; i++) {
			if (car[i] == 'A') {
				dp[i][0] = Math.min(dp[i - 1][0] + 1, dp[i - 1][1]);
                dp[i][1] = inf;
			}
			else if (car[i] == 'B') {
				dp[i][1] = Math.min(dp[i - 1][1] + 1, dp[i - 1][0]);
				dp[i][0] = inf;
			}
			else {
				dp[i][0] = Math.min(dp[i - 1][0] + 1, dp[i - 1][1]);
				dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1] + 1);
			}
		}
		return Math.min(dp[n - 1][0], dp[n - 1][1]);
	}
}
