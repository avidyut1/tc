import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class FarmvilleDiv2 {
	
	public int minTime(int[] time, int[] cost, int budget) {
		Queue<TimeCost> pq = new PriorityQueue<TimeCost>(100000, new TimeCost());
		for (int i = 0; i < time.length; i++) {
			pq.add(new TimeCost(time[i], cost[i]));
		}
		while(budget > 0) {
			TimeCost tc = pq.poll();
			if (budget >= tc.c) {
				if (tc.t == 0) {
					continue;
				}
				budget -= tc.c;
				int ntime = tc.t - 1;
				pq.add(new TimeCost(ntime, tc.c));
			}
		}
		int ans = 0;
		while(!pq.isEmpty()) {
			ans += pq.poll().t;
		}
		return ans;
	}
}
class TimeCost implements Comparator<TimeCost>{
	int t, c;
	public TimeCost(){

	}
	public TimeCost(int t, int c){
		this.t = t;
		this.c = c;
	}
	@Override
	public int compare(TimeCost tc1, TimeCost tc2) {
		return -(tc1.t - tc2.t);
	}
}
