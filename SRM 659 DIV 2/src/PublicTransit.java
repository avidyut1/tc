import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PublicTransit {
	
	public int minimumLongestDistance(int R, int C) {
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				for (int k = 0; k < R; k++) {
					for (int l = 0; l < C; l++) {
						//teleporter in i,j and k, l
						int grid[][] = new int[R][C];
						grid[i][j] = -7;
						grid[k][l] = -7;
						int findMax = findDist(grid, i, j, k, l, R, C);
						max = Math.min(findMax, max);
					}
				}
			}
		}
		return max;
	}
	public int findDist(int g[][], int i, int j, int k, int l, int R, int C) {
		int max = Integer.MIN_VALUE;
		for (int m = 0; m < R; m++) {
			for (int n = 0; n < C; n++) {
				for (int o = 0; o < R; o++) {
					for (int p = 0; p < C; p++) {
						int dist = Math.abs(o - m) + Math.abs(p - n);
						//using first teleporter
						int dist2 = Math.abs(m - i) + Math.abs(n - j) + Math.abs(o - k) + Math.abs(p - l);
						int dist3 = Math.abs(m - k) + Math.abs(n - l) + Math.abs(o - i) + Math.abs(p - j);
						dist = Math.min(dist, dist2);
						dist = Math.min(dist, dist3);
						max = Math.max(dist, max);
					}
				}
			}
		}
		return max;
	}
}
