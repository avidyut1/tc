import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LuckyCycle {
	boolean ans = false;
	public int[] getEdge(int[] edge1, int[] edge2, int[] weight) {
		int n = edge1.length + 1;
		for (int i = 0; i < n - 1; i++) {
			edge1[i]--;
			edge2[i]--;
		}
		int graph[][] = new int[n][n];
		for (int i = 0; i < n - 1; i++) {
			graph[edge1[i]][edge2[i]] = weight[i];
			graph[edge2[i]][edge1[i]] = weight[i];
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;
				if (graph[i][j] == 0) {
					ans = false;
					int ng[][] = new int[n][n];
					for (int k = 0; k < n; k++) {
						for (int l = 0; l < n; l++) {
							ng[k][l] = graph[k][l];
						}
					}
					ng[i][j] = 4;
					ng[j][i] = 4;
					//check result
					for (int k = 0; k < n; k++) {
						dfs(k, ng);
					}
					//other possibiilty
                    if (ans) {
						return new int[]{i+1, j+1, 4};
					}
                    ng = new int[n][n];
                    for (int k = 0; k < n; k++) {
                        for (int l = 0; l < n; l++) {
                            ng[k][l] = graph[k][l];
                        }
                    }
                    ng[i][j] = 7;
                    ng[j][i] = 7;
                    //check result
                    for (int k = 0; k < n; k++) {
                        dfs(k, ng);
					}
					if (ans) {
						return new int[]{i+1, j+1, 7};
					}
				}
			}
		}
		return new int[]{};
	}
	public void dfs(int v, int g[][]) {
		int num4 = 0, num7 = 0;
		for (int i = 0; i < g.length; i++) {
			if (g[i][v] > 0){
				boolean vis[] = new boolean[g.length];
				if (g[i][v] == 4)
					dfs_visit(v, g, i, vis, num4 + 1, num7);
				else
					dfs_visit(v, g, i, vis, num4, num7 + 1);
			}
		}
	}
	public void dfs_visit(int v, int g[][], int i, boolean vis[], int n4, int n7) {
		if (i == v && n4 == n7) {
			ans = true;
			return;
		}
		else if(i == v){
			return;
		}
		vis[i] = true;
		for (int j = 0; j < g.length; j++) {
			if (!vis[j] && g[i][j] > 0) {
				if (g[i][j] == 4) {
					dfs_visit(v, g, j, vis, n4 + 1, n7);
				}
				else
					dfs_visit(v, g, j, vis, n4, n7 + 1);
			}
		}
	}
}
