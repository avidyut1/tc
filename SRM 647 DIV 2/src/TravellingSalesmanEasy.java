import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TravellingSalesmanEasy {
	
	public int getMaxProfit(int M, int[] profit, int[] city, int[] visit) {
		Queue<Integer> pq[] = new PriorityQueue[M];
		for (int i = 0; i < M; i++) {
			pq[i] = new PriorityQueue<>(100000, Collections.reverseOrder());
		}
		for (int i = 0; i < profit.length; i++) {
			pq[city[i] - 1].add(profit[i]);
		}
		int ans = 0;
		for (int i = 0; i < visit.length; i++) {
            if (pq[visit[i] - 1].size() > 0)
				ans += pq[visit[i] - 1].poll();
		}
		return ans;
	}
}
