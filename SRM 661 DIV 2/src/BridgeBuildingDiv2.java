import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BridgeBuildingDiv2 {
	
	public int minDiameter(int[] a, int[] b, int K) {
		int n = a.length + 1;
		int inf = 1000000;
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < (1 << n); i++) {
			//if set bit is k
			int count = 0;
			for (int j = 0; j < n; j++) {
				if((i & (1 << j)) != 0) {
                    count++;
				}
			}
			if (count == K) {
				int g[][] = new int[2 * n][2 * n];
				for (int j = 0; j < 2 * n; j++) {
					for (int k = 0; k < 2 * n; k++) {
						g[j][k] = inf;
					}
				}
				for (int j = 0; j < n; j++) {
					if((i & (1 << j)) != 0) {
                        g[j][j + n] = 0;
						g[j + n][j] = 0;
					}
				}
				//top
				for (int j = 0; j < n - 1; j++) {
                    g[j][j + 1] = a[j];
					g[j + 1][j] = a[j];
				}
				//bottom
				for (int j = 0; j < n - 1; j++) {
					g[j + n][j + n + 1] = b[j];
					g[j + n + 1][j + n] = b[j];
				}
				//floyd warshall
				for (int k = 0; k < 2 * n; k++) {
					for (int ii = 0; ii < 2* n; ii++) {
						for (int jj = 0; jj <  2 * n; jj++) {
							g[ii][jj] = Math.min(g[ii][jj], g[ii][k] + g[k][jj]);
						}
					}
				}
				int max_dist = 0;
				for (int ii = 0; ii < 2*n; ii++) {
					for (int j = ii + 1; j < 2*n; j++) {
						max_dist = Math.max(max_dist, g[ii][j]);
					}
				}
				res = Math.min(max_dist, res);
			}
		}
		return res;
	}
}
