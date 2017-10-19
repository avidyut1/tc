import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LongMansionDiv2 {
	
	public long minimalTime(int M, int[] t) {
		int n = t.length;
		RowTime rt [] = new RowTime[n];
		for (int i = 0; i < n; i++) {
			rt[i] = new RowTime(i, t[i]);
		}
		Arrays.sort(rt);
		int selRow = rt[0].r;
		long ans = 0l;
		for (int i = 0; i < n; i++) {
			if (i == selRow) {
				ans += M * (long)t[i];
			}
			else {
				ans += t[i];
			}
		}
		return ans;
	}

	private class RowTime implements Comparable<RowTime>{
	    int r, time;

		public RowTime(int r, int time) {
			this.r = r;
			this.time = time;
		}
		public int compareTo(RowTime rt) {
			return Integer.compare(this.time, rt.time);
		}
	}
}
