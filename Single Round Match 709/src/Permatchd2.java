import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Permatchd2 {
	Vector<Vector<Integer>> cc = new Vector<>();
	public int fix(String[] graph) {
		int n = graph.length;
		Vector<Integer> g[] = new Vector[n];
		for (int i = 0; i < n; i++) {
			g[i] = new Vector<>();
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (graph[i].charAt(j) == 'Y') {
					g[i].add(j);
					g[j].add(i);
				}
			}
		}
		dfs(g);
		System.out.println(cc);
		int ans = 0;
		int numeven = 0;
		int numodd = 0;
        for (Vector<Integer> component: cc) {
			int numEdge = 0;
			boolean canadd = false;
			for (int i = 0; i < component.size(); i++) {
				for (int j = i + 1; j < component.size(); j++) {
					int vi = component.get(i);
					int vj = component.get(j);
					if (graph[vi].charAt(vj) == 'Y') {
						numEdge++;
					}
					else {
						canadd = true;
					}
				}
			}
			if (numEdge % 2 == 0){
				numeven++;
			}
			else {
				if (canadd) {
					numeven++;
					ans++;
				}
				else {
					numodd++;
				}
			}
		}
		if (numeven >= numodd) {
			ans += numodd;
		}
		else {
            ans += numeven;
			numodd -= numeven;
			//merging odd with odd
			if (numodd == 1) {
				return -1;
			}
			ans += numodd;
		}
		return ans;
	}
	public void dfs(Vector<Integer> g[]){
		int n = g.length;
		boolean v[] = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (!v[i]) {
				cc.add(new Vector<>());
				dfs_visit(i, v, g);
			}
		}
	}
	public void dfs_visit(int ver, boolean v[], Vector<Integer> g[]) {
		cc.get(cc.size() - 1).add(ver);
		v[ver] = true;
		for(int ch: g[ver]) {
			if (!v[ch]) {
				dfs_visit(ch, v, g);
			}
		}
	}
}
