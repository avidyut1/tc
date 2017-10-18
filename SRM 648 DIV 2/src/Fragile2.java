import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Fragile2 {
	
	public int countPairs(String[] graph) {
		int n = graph.length;
		char [][] g = new char[n][n];
		for (int i = 0; i < n; i++) {
			g[i] = graph[i].toCharArray();
		}
		int ans = 0;
		int cc = findConnectedComponent(g);
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (isarticulationpair(cc, i, j, g)) {
					ans++;
				}
			}
		}
		return ans;
	}
	public boolean isarticulationpair(int initialCC, int i, int j, char g[][]) {
		int n = g.length;
		char newg[][] = new char[n - 2][n - 2];
		int ind = 0;
		for (int k = 0; k < n; k++) {
            if (k == i || k == j) {
				continue;
			}
			int ind2 = 0;
			for (int l = 0; l < n; l++) {
				if (l == j || l == i) {
					continue;
				}
				newg[ind][ind2++] = g[k][l];
			}
			ind++;
		}
		int newar = findConnectedComponent(newg);
		if (newar > initialCC)
			return true;
		return false;
	}
	public int findConnectedComponent(char g[][]) {
		int n = g.length;
		int cc = 0;
		boolean vis[] = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (!vis[i]) {
				cc++;
				dfs_visit(g, vis, i);
			}
		}
		return cc;
	}
	public void dfs_visit(char g[][], boolean v[], int ver) {
		if (v[ver]) {
			return;
		}
		v[ver] = true;
		int n = g.length;
		for (int i = 0; i < n; i++) {
			if (g[ver][i] == 'Y') {
				dfs_visit(g, v, i);
			}
		}
	}
}
