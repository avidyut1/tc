import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DoubleWeights {
	public int ans = Integer.MAX_VALUE;
	Vector<Vector<Integer>> paths = new Vector<Vector<Integer>>();
	public int minimalCost(String[] weight1, String[] weight2) {
		char war1[][] = new char[weight1.length][weight1.length];
		char war2[][] = new char[weight2.length][weight2.length];
		int n = weight1.length;
		for (int i = 0; i < n; i++) {
			war1[i] = weight1[i].toCharArray();
		}
		for (int i = 0; i < n; i++) {
			war2[i] = weight2[i].toCharArray();
		}
		Vector<Integer> graph[] = new Vector[n];
		for (int i = 0; i < n; i++) {
			graph[i] = new Vector<Integer>();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (war1[i][j] == '.')
					continue;
				graph[i].add(j);
			}
		}
		dfs(0, 1, graph);
		if (paths.isEmpty()) {
			return -1;
		}
		for (Vector<Integer> path: paths) {
			int w1 = 0, w2 = 0;
			System.out.println(path);
			for (int i = 1; i < path.size(); i++) {
				int dist1 = Integer.parseInt(Character.toString(war1[path.get(i - 1)][path.get(i)]));
				w1 += dist1;
				int dist2 = Integer.parseInt(Character.toString(war2[path.get(i - 1)][path.get(i)]));
				w2 += dist2;
			}
			ans = Math.min(ans, w1 * w2);
		}
		return ans;
	}
	public void dfs(int s, int d, Vector<Integer> g[]) {
		System.out.println(g[s]);
		for(int e : g[s]) {
			//visited array should be inside above for.
			boolean v[]  = new boolean[g.length];
			v[0] = true;
			Vector<Integer> path = new Vector<Integer>();
			path.add(s);
			path.add(e);
			dfs_visit(e, d, g, v, path);
		}
	}
	public void dfs_visit(int ver, int dest, Vector<Integer> g[], boolean v[], Vector<Integer> path) {
		if(v[ver]) {
			return;
		}
		if (ver == dest) {
			paths.add(path);
			return;
		}
		v[ver] = true;
		for(int e : g[ver]){
			Vector<Integer> newpath = new Vector<Integer>(path);
			newpath.add(e);
			dfs_visit(e, dest, g, v, newpath);
		}
	}

	public static void main(String[] args) {
		DoubleWeights dw = new DoubleWeights();
		String [] w1 = new String[] {"......777...8", "..4.........6", ".4.26.......3", "..2.9.9.....1", "..69.8......8", "....8.79.....", "7..9.7.5.....", "7....95.53.3.", "7......5.4.71", ".......34.8..", ".........8.36", ".......37.3.9", "86318...1.69."};
		String [] w2 = new String[] {"......777...8", "..4.........6", ".4.26.......3", "..2.9.9.....1", "..69.8......8", "....8.79.....", "7..9.7.5.....", "7....95.53.3.", "7......5.4.71", ".......34.8..", ".........8.36", ".......37.3.9", "86318...1.69."};
		System.out.println(w1.length);
		System.out.println(dw.minimalCost(w1, w2));
	}
}
