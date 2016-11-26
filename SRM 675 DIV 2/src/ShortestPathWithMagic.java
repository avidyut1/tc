import javax.swing.text.StyledEditorKit;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ShortestPathWithMagic {
	double ans = Double.MAX_VALUE;
	public double getTime(String[] dist, int k) {
		int n = dist.length;
		Vector<Edge> g[] = new Vector[n];
		for (int i = 0; i < n; i++) {
			g[i] = new Vector<Edge>();
		}
		for (int i = 0; i < dist.length; i++) {
			for (int j = 0; j < dist[i].length(); j++) {
				if (i == j)
					continue;
				g[i].add(new Edge(j, (int)(dist[i].charAt(j) - '0')));
			}
		}
		Queue<State> pq = new PriorityQueue<State>(1000000, new State());
		pq.add(new State(0, 0, k));
		double res[][] = new double[n][k + 1];
		for (int i = 0; i < n; i++) {
			Arrays.fill(res[i], ans);
		}
		for (int i = 0; i < k + 1; i++) {
			res[0][i] = 0;
		}
		while(!pq.isEmpty()) {
			State s = pq.poll();
			for (Edge e : g[s.key]) {
				if (res[e.to][s.rempotion] > res[s.key][s.rempotion] + e.weight) {
					res[e.to][s.rempotion] = res[s.key][s.rempotion] + e.weight;
					pq.add(new State(res[e.to][s.rempotion], e.to, s.rempotion));
				}
				if (s.rempotion > 0 && res[e.to][s.rempotion - 1] > res[s.key][s.rempotion] + e.weight / 2.0d) {
					res[e.to][s.rempotion - 1] = res[s.key][s.rempotion] + e.weight / 2.0d;
					pq.add(new State(res[e.to][s.rempotion], e.to, s.rempotion - 1));
				}
			}
		}
		for (int i = 0; i < k + 1; i++) {
			ans = Math.min(ans, res[1][i]);
		}
		return ans;
	}
}
class State implements Comparator<State>{
	double dist; int key, rempotion;
	public State(){

	}
	public State(double d, int k, int rem){
		this.dist = d;
		this.key = k;
		this.rempotion = rem;
	}
	@Override
	public int compare(State o, State t) {
		return (int)(o.dist - t.dist);
	}
}
class Edge{
	int to, weight;
	public Edge(int to, int weight) {
		this.to = to;
		this.weight = weight;
	}
}
