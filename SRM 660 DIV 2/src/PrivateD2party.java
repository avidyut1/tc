import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class PrivateD2party {
	public int cycle = 0;
	boolean vis[];
	public int getsz(int[] a) {
		Vector<Integer> g[] = new Vector[a.length];
		for (int i = 0; i < g.length; i++) {
			g[i] = new Vector<>();
		}
		vis = new boolean[g.length];
		for (int i = 0; i < a.length; i++) {
			g[i].add(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
            if (a[i] == i){
				continue;
			}
			dfs(i, g);
		}
		return a.length - cycle;
	}
	public void dfs(int s, Vector<Integer> g[]) {
		if (vis[s]){
			return;
		}
		for(int f: g[s]) {
            if (!vis[f]){
				dfs_visit(f, s, g);
			}
		}
		vis[s] = true;
	}
	public void dfs_visit(int v, int s, Vector<Integer> g[]) {
		if (v == s) {
			cycle++;
			return;
		}
		vis[v] = true;
		for (int ch: g[v]) {
			if (!vis[ch]) {
				dfs_visit(ch, s, g);
			}
		}
	}
}
